package com.lhxm.blueberry.test.testcases.resetpasswd;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EnterFindPasswdPage extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterPasswdResetPage() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *登录按钮
		solo.clickOnImageButton(0);

		// *点击忘记密码？按钮
		v = solo.getView("forget_pass_img");
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.assertCurrentActivity("未进入找回密码界面", FINDPASS_ACTIVITY);
	}
}
