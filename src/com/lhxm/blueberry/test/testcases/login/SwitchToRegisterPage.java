package com.lhxm.blueberry.test.testcases.login;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class SwitchToRegisterPage extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSwitchToRegisterPage() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		solo.clickOnImageButton(0);
		solo.sleep(2000);
		
		solo.clickOnText("×¢²á");
		solo.sleep(5000);
		
		assertTrue("Î´ÕÒµ½µÇÂ¼°´Å¥", solo.searchText("µÇÂ¼"));
	}
}
