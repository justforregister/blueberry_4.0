package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EmptyAccountAndPassword extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEmptyAccountAndPassword() {

		EnterMinePageActivity.enterMinePage();
		doLogout();
		
		solo.sleep(5000);
		
		// *注册按钮
		solo.clickOnImageButton(1);

		solo.enterText(0, "13333333333");
		solo.enterText(1, "12345678");

		// *点击“X”按钮
		v = solo.getView("del_account");
		solo.clickOnView(v);

		assertTrue(
				"账号密码未清除！",
				solo.searchText("请输入你的手机号\\(11\\)")
						&& solo.searchText("请输入密码\\(6\\-20\\)"));

	}
}
