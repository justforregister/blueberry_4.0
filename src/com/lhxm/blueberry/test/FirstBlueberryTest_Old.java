package com.lhxm.blueberry.test;

import com.robotium.solo.Solo;

import android.os.PowerManager;
import android.test.ActivityInstrumentationTestCase2;

import com.lhxm.blueberry.test.utils.Util;
import com.lhxm.blueberry.test.utils.NetworkUtil;

@SuppressWarnings("rawtypes")
public class FirstBlueberryTest_Old extends ActivityInstrumentationTestCase2 {

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
	public FirstBlueberryTest_Old() {
		super(launcherActivityClass);
		// TODO Auto-generated constructor stub
	}

	private Solo solo;
	private PowerManager.WakeLock wakeScreenObject = null;

	@Override
	protected void setUp() throws Exception {
		
		solo = new Solo(getInstrumentation(), getActivity());
		// �����豸
		if (wakeScreenObject == null) {
			wakeScreenObject = Util.wakeScreen(this);
		}
		solo.sleep(5000);
		
		// ����ϵͳ
		//Util.unlock(getInstrumentation());
		
		// ������ݮ
		solo.drag(500, 1000, 600, 600, 6);
		solo.sleep(5000);
		// ��������
		NetworkUtil.setAirplaneModeOffAndNetworkOn(getInstrumentation()
				.getTargetContext());
		solo.sleep(5000);
	}

	public void testCanOpenSettings() {
		solo.scrollToTop();
		solo.clickOnText("��ʳ");
//		solo.sleep(2000);
		assertTrue(solo.searchText("��ʳ"));
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();

	}
}
