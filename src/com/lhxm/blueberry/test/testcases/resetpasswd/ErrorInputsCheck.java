package com.lhxm.blueberry.test.testcases.resetpasswd;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ErrorInputsCheck extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testErrorInput() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *登录按钮
		solo.clickOnImageButton(0);

		// *点击忘记密码？按钮
		v = solo.getView("forget_pass_img");
		solo.clickOnView(v);
		solo.sleep(2000);

		// *不输手机号密码
		solo.clickOnImageButton(0);
		assertTrue("\"请输入正确的手机号\"未显示", solo.waitForText("请输入正确的手机号"));
		solo.sleep(2000);

		// *两次新密码不一致
		solo.enterText(0, "18888888888");
		solo.enterText(1, "432122");
		solo.enterText(2, "123456");
		solo.enterText(3, "654321");
		solo.clickOnImageButton(0);
		assertTrue("\"两次输入密码不一致\"未显示", solo.waitForText("两次输入的密码不一致"));
		solo.sleep(2000);
		
		// *验证码有误
		solo.clearEditText(1);
		solo.enterText(1, "43122");
		solo.clickOnImageButton(0);
		assertTrue("\"验证码有误\"未显示", solo.waitForText("验证码有误"));
		

	}
}
