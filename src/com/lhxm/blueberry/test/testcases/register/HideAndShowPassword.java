package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class HideAndShowPassword extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEmptyAccountAndPassword() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *×¢²á°´Å¥
		solo.clickOnImageButton(1);

		solo.enterText(1, "password");

		// *µã»÷ÑÛ¾¦°´Å¥Òş²ØÃÜÂë
		v = solo.getView("show_pass");
		solo.clickOnView(v);
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);
		
		// *ÃÜÂëÒş²ØÈÎÈ»¿ÉÒÔÕÒµ½?
		// assertFalse("ÃÜÂëÎ´Òş²Ø", solo.searchText("password"));

		// *µã»÷ÑÛ¾¦°´Å¥ÏÔÊ¾ÃÜÂë
		solo.clickOnView(v);
		solo.sleep(2000);

		assertTrue("ÃÜÂëÒÑÒş²Ø", solo.searchText("password"));

	}
}
