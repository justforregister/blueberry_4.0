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
		// 唤醒设备
		if (wakeScreenObject == null) {
			wakeScreenObject = Util.wakeScreen(this);
		}
		solo.sleep(5000);
		
		// 解锁系统
		//Util.unlock(getInstrumentation());
		
		// 解锁蓝莓
		solo.drag(500, 1000, 600, 600, 6);
		solo.sleep(5000);
		// 连接网络
		NetworkUtil.setAirplaneModeOffAndNetworkOn(getInstrumentation()
				.getTargetContext());
		solo.sleep(5000);
	}

	public void testCanOpenSettings() {
		solo.scrollToTop();
		solo.clickOnText("美食");
//		solo.sleep(2000);
		assertTrue(solo.searchText("美食"));
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();

	}
}
