package com.lhxm.blueberry.test.testcases.register;

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

		// *注册按钮
		solo.clickOnImageButton(1);

		// *不输密码
		solo.enterText(0, "18888888888");
		solo.clickOnImageButton(0);
		assertTrue("\"请检查输入密码\"未显示", solo.waitForText("请检查输入密码"));
		solo.sleep(2000);
		v = solo.getView("del_account");
		solo.clickOnView(v);
		solo.sleep(2000);

		// *不输手机号
		solo.enterText(1, "123456");
		solo.clickOnImageButton(0);
		assertTrue("\"请输入正确的手机号\"未显示", solo.waitForText("请输入正确的手机号"));
		solo.sleep(2000);

		// *未勾选同意条款
		solo.enterText(0, "18888888888");
		solo.clickOnImageButton(0);
		assertTrue("\"请同意服务条款\"未显示", solo.waitForText("请同意服务条款"));
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);

		// *错误手机号
		solo.enterText(0, "123456");
		solo.enterText(1, "123456");
		solo.clickOnImageButton(0);
		assertTrue("\"请输入正确的手机号\"未显示", solo.waitForText("请输入正确的手机号"));
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);

		// *错误密码
		solo.enterText(0, "18888888888");
		solo.enterText(1, "12ab");
		solo.clickOnImageButton(0);
		assertTrue("\"请检查输入密码\"未显示", solo.waitForText("请检查输入密码"));
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);

		// *已注册的手机号
		solo.enterText(0, "18888888888");
		solo.enterText(1, "123456");
		solo.clickOnCheckBox(0);
		solo.clickOnImageButton(0);
		assertTrue("\"手机号已经注册\"未显示", solo.waitForText("手机号已经注册：18888888888"));

	}
}
