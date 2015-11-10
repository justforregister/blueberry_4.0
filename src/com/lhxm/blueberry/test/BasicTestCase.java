package com.lhxm.blueberry.test;

import android.content.Intent;
import android.os.PowerManager;
import android.view.View;
import android.widget.TextView;
import android.test.ActivityInstrumentationTestCase2;

import com.lhxm.blueberry.test.utils.NetworkUtil;
import com.lhxm.blueberry.test.utils.Util;
import com.robotium.solo.Solo;

@SuppressWarnings("rawtypes")
public class BasicTestCase extends ActivityInstrumentationTestCase2 {

	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.lhxm.activity.SplashActivity";

	private static Class<?> launcherActivityClass;
	static {
		try {
			launcherActivityClass = Class
					.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public BasicTestCase() {
		super(launcherActivityClass);
		// TODO Auto-generated constructor stub
	}

	protected static Solo solo;
	protected PowerManager.WakeLock wakeScreenObject = null;
	protected static View v = null;
	protected TextView tv = null;

	// Define Mall Home Page Main Activity
	public static final String MAIN_ACTIVITY = "com.lhxm.activity.MainActivity";

	// Define Search Activity
	public static final String SEARCH_ACTIVITY = "SearchActivity";

	// Define Merchants Detail Page Main Activity
	public static final String MERCHANTS_ACTIVITY = "MerchantsDetailActivity";

	// Define Merchandise List Activity
	public static final String MERCHANTS_LIST = "MerchandiseListActivity";

	// Define Merchandise Detail Activity
	public static final String MERCHANDISE_DETAIL = "MerchandiseDetailActivity";

	// Define Login Page Activity
	public static final String LOGIN_ACTIVITY = "LoginActivity";

	// Define Account Detail Activity
	public static final String ACCOUNT_DETAIL_ACTIVITY = "AccountDetailActivity";

	// Define Score Detail Activity
	public static final String SCORE_DETAIL_ACTIVITY = "ScoreDetailActivity";

	// Define Consume Activity
	public static final String CONSUME_ACTIVITY = "ConsumeActivity";

	// Define Collect Activity
	public static final String COLLECT_ACTIVITY = "CollectActivity";

	// Define Award Activity
	public static final String AWARD_ACTIVITY = "AwardActivity";

	// Define Complaints Activity
	public static final String COMPLAINTS_ACTIVITY = "ComplaintsActivity";

	// Define System Setting Activity
	public static final String SYSTEM_SETTING_ACTIVITY = "SystemSettingActivity";

	// Define Register Activity
	public static final String REGISTER_ACTIVITY = "RegisterActivity";

	// Define Browser Activity
	public static final String BROWSER_ACTIVITY = "BrowserActivity";

	// Define FindPass Activity
	public static final String FINDPASS_ACTIVITY = "FindPassActivity";

	/**
	 * ��дsetUp�����쳣���񣬽�ͼ����
	 *
	 * @throws Exception
	 */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		try {

			// super.setUp(); //�ܵ���case��ڶ���case��������ʱ���Լ̳�

			// *������case ��ֹ�ڶ��������ڵ�һ����activity,ÿ�������ʷջ
			Intent i = new Intent();
			i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			setActivityIntent(i);
			solo = new Solo(getInstrumentation(), getActivity());

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
			super.tearDown();
		} catch (Throwable th) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new TearDownException(th);
		}

	}

	private void init() {
		solo = new Solo(getInstrumentation(), getActivity());
		// �����豸
		if (wakeScreenObject == null) {
			wakeScreenObject = Util.wakeScreen(this);
		}
		solo.sleep(5000);
		// ����
		// Util.unlock(getInstrumentation());

		// ������ݮ
		if (Util.isScreenLocked(getActivity()) == true) {
			solo.drag(70, 500, 200, 200, 5);
			// solo.scrollToSide(0, (float) 0.60);
			solo.sleep(5000);
		}

		// ��������
		NetworkUtil.setAirplaneModeOffAndNetworkOn(getInstrumentation()
				.getTargetContext());
		solo.sleep(5000);
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