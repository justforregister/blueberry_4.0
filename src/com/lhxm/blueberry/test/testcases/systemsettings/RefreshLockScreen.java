package com.lhxm.blueberry.test.testcases.systemsettings;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class RefreshLockScreen extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNumbersLockScreen() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		// *开启锁屏设置，刷新锁屏
		solo.clickOnText("系统设置");
		if (solo.isCheckBoxChecked(1)) {
			solo.clickOnCheckBox(1);
		} else {
			solo.sleep(1000);
		}
		solo.clickOnText("刷新锁屏");
		assertTrue("锁屏设置未开启未显示！", solo.waitForText("锁屏设置未开启"));

		// *开启锁屏设置
		solo.clickOnText("系统设置");
		if (solo.isCheckBoxChecked(1) == false) {
			solo.clickOnCheckBox(1);
		} else {
			solo.sleep(1000);
		}
		solo.clickOnText("刷新锁屏");
		assertTrue("锁屏开始消息未显示", solo.waitForText("刷新锁屏开始，请勿重复点击"));

		// *断开网络
		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);
		solo.clickOnText("刷新锁屏");
		assertTrue("未开启网络未显示", solo.waitForText("未开启网络"));
	}

}
