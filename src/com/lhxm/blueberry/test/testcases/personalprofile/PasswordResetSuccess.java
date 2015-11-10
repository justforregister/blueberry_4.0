package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class PasswordResetSuccess extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterPersonalProfile() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("个人资料");
		solo.sleep(2000);

		v = solo.getView("update_pass_layout");
		solo.clickOnView(v);

		// *修改成功，登录界面
		solo.enterText(0, "test123");
		solo.enterText(1, "test123");
		solo.enterText(2, "test123");
		solo.clickOnImageButton(0);

		assertTrue("修改成功提示未显示", solo.waitForText("密码修改成功，请重新登录"));

		solo.assertCurrentActivity("未到登录界面", LOGIN_ACTIVITY);

		// *点击返回，到我的蓝莓未登录界面
		solo.clickOnText("返回");
		solo.assertCurrentActivity("未到我的蓝莓界面", MAIN_ACTIVITY);
		assertTrue("已登录！", EnterMinePageActivity.isLoggedIn() == false);

	}
}
