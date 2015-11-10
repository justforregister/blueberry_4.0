package com.lhxm.blueberry.test.testcases.resetpasswd;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ReturnToPrevious extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReturnToPrevious() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *登录按钮
		solo.clickOnImageButton(0);

		// *点击忘记密码？按钮
		v = solo.getView("forget_pass_img");
		solo.clickOnView(v);
		solo.sleep(2000);

		v = solo.getView("back_btn");
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.assertCurrentActivity("未回到登录界面！", LOGIN_ACTIVITY);

	}
}
