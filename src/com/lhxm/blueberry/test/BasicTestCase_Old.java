package com.lhxm.blueberry.test;

import android.os.PowerManager;
import android.test.ActivityInstrumentationTestCase2;

import com.lhxm.blueberry.test.utils.NetworkUtil;
import com.lhxm.blueberry.test.utils.Util;
import com.robotium.solo.Solo;

@SuppressWarnings("rawtypes")
abstract public class BasicTestCase_Old extends
		ActivityInstrumentationTestCase2 {
	@SuppressWarnings("unchecked")
	public BasicTestCase_Old(Class activityClass) {
		super(activityClass);
		// TODO Auto-generated constructor stub
	}

	private Solo solo;
	private PowerManager.WakeLock wakeScreenObject = null;
	protected UIHelper uiHelper = null;

	/**
	 * ��дsetUp�����쳣���񣬽�ͼ����
	 *
	 * @throws Exception
	 */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		try {
			super.setUp();
			init();
		} catch (Throwable tr) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new SetUpException(tr);
		}
	}

	/**
	 * ��дtearDown,�����쳣���񣬽�ͼ����
	 *
	 * @throws Exception
	 */
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		try {
			if (wakeScreenObject != null) {
				wakeScreenObject.release();
				wakeScreenObject = null;
			}
			solo.finishOpenedActivities();
			uiHelper = null;
			super.tearDown();
		} catch (Throwable th) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new TearDownException(th);
		}

	}

	private void init() {
		solo = new Solo(getInstrumentation(), getActivity());
		uiHelper = new UIHelper(solo);
		// �����豸
		if (wakeScreenObject == null) {
			wakeScreenObject = Util.wakeScreen(this);
		}
		// ����
		Util.unlock(getInstrumentation());
		// ��������
		NetworkUtil.setAirplaneModeOffAndNetworkOn(getInstrumentation()
				.getTargetContext());
	}

	/**
	 * ��setUp��runTest��tearDown�׳����Զ����쳣������ͳһ���в���Ȼ��ȷ ��tearDown������ִ�У������ͷ���Դ
	 *
	 * @throws Throwable
	 */
	@Override
	public void runBare() throws Throwable {
		try {
			super.runBare();
		} catch (SetUpException smte) {
			this.tearDown();
			throw smte;
		} catch (RunTestException rte) {
			this.tearDown();
			throw rte;
		} catch (TearDownException tde) {
			this.tearDown();
			throw tde;
		}
	}

	/**
	 * ��дrunTest,�����쳣���н�ͼ����
	 *
	 * @throws Throwable
	 */
	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub
		try {
			super.runTest();
		} catch (Throwable th) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new RunTestException(th);
		}
	}

	/**
	 * �����Զ�����쳣�࣬��ӦsetUpʱ�������쳣��runTest�������� ����tearDown�������쳣
	 *
	 * @author hiworld
	 *
	 */
	class SetUpException extends Exception {
		private static final long serialVersionUID = 1L;

		SetUpException(Throwable e) {
			super("Error in BasicTestCase.setUp()!", e);
		}
	}

	class RunTestException extends Exception {
		private static final long serialVersionUID = 2L;

		RunTestException(Throwable e) {
			super("Error in BasicTestCase.runTest()", e);
		}
	}

	class TearDownException extends Exception {
		private static final long serialVersionUID = 3L;

		TearDownException(Throwable e) {
			super("Error in MultiTestCase.tearDown()", e);
		}
	}

}