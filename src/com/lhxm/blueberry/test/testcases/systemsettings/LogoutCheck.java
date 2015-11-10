package com.lhxm.blueberry.test.testcases.systemsettings;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class LogoutCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testBrowserPagesinSettings() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("系统设置");

		solo.clickOnText("退出登录");

		// *取消
		solo.clickOnText("取消");
		solo.assertCurrentActivity("未回到系统设置界面", SYSTEM_SETTING_ACTIVITY);

		// *退出成功，返回我的蓝莓界面
		solo.clickOnText("退出登录");
		solo.clickOnText("退出登录");
		assertTrue("退出成功未显示！", solo.waitForText("退出成功"));
		solo.assertCurrentActivity("未回到我的蓝莓界面", MAIN_ACTIVITY);
	}

}
