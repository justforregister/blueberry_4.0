package com.lhxm.blueberry.test.testcases.login;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.Util;

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

		// *不输手机号密码
		solo.clickOnImageButton(0);
		assertTrue("\"请输入正确的手机号\"未显示", solo.waitForText("请输入正确的手机号"));
		solo.sleep(2000);

		// *不输密码
		solo.enterText(0, "18888888888");
		solo.clickOnImageButton(0);
		assertTrue("\"请输入密码\"未显示", solo.waitForText("请输入密码"));
		solo.sleep(2000);
		v = solo.getView("del_account");
		solo.clickOnView(v);
		solo.sleep(2000);

		// *不输手机号
		solo.enterText(1, "123456");
		solo.clickOnImageButton(0);
		assertTrue("\"请输入正确的手机号\"未显示", solo.waitForText("请输入正确的手机号"));
		solo.sleep(2000);

		// *输入错误密码
		solo.enterText(0, "13980424212");
		solo.enterText(1, "123456");
		solo.clickOnImageButton(0);
		assertTrue("\"用户名或密码错误\"未显示", solo.waitForText("用户名或密码错误"));
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);

		// *错误手机号
		String phoneNumber = Util.getFixLenthString(11);
		solo.enterText(0, phoneNumber);
		solo.enterText(1, "123456");
		solo.clickOnImageButton(0);
		assertTrue("\"用户不存在\"未显示", solo.waitForText("用户不存在"));
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);

		// *大写字母正确密码
		solo.enterText(0, "13980424212");
		solo.enterText(1, "TEST123");
		solo.clickOnImageButton(0);
		assertTrue("\"用户名或密码错误\"未显示", solo.waitForText("用户名或密码错误"));
		

	}


}
