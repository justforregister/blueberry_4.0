package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class RegisterWithEmptyData extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReisterWithEmptyData() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *注册按钮
		solo.clickOnImageButton(1);

		// *注册按钮（注册页面）
		solo.clickOnImageButton(0);

		assertTrue("提示输入手机号信息未显示", solo.waitForText("请输入正确的手机号"));

	}
}
