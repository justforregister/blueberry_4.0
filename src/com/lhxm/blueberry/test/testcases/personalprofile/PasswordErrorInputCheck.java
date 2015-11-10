package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class PasswordErrorInputCheck extends BasicTestCaseWithLogin {

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

		// *Empty Input
		solo.clickOnImageButton(0);
		assertTrue("请正确填写旧密码未显示", solo.waitForText("请正确填写旧密码"));

		// *只输入旧密码
		solo.enterText(0, "test123");
		solo.clickOnImageButton(0);
		assertTrue("请检查输入的新密码未显示", solo.waitForText("请检查输入的新密码"));

		// *不输入旧密码
		solo.clearEditText(0);
		solo.enterText(1, "test123");
		solo.enterText(2, "test123");
		solo.clickOnImageButton(0);
		assertTrue("请正确填写旧密码未显示", solo.waitForText("请正确填写旧密码"));

		// *不合规则新密码
		solo.clearEditText(1);
		solo.clearEditText(2);
		solo.enterText(0, "test123");
		solo.enterText(1, "test");
		solo.enterText(2, "test");
		solo.clickOnImageButton(0);
		assertTrue("密码长度限制6-20位", solo.waitForText("密码长度限制6\\-20位"));

		// *新密码不一致
		// *不一致
		solo.clearEditText(0);
		solo.clearEditText(1);
		solo.clearEditText(2);
		solo.enterText(0, "test123");
		solo.enterText(1, "test123");
		solo.enterText(2, "abdjj");
		solo.clickOnImageButton(0);
		assertTrue("两次密码不一致未显示", solo.waitForText("对不起，您输入的两次密码不一致"));
		// *大小写不同
		solo.clearEditText(2);
		solo.enterText(2, "teSt123");
		solo.clickOnImageButton(0);
		assertTrue("两次密码不一致未显示", solo.waitForText("对不起，您输入的两次密码不一致"));

	}
}
