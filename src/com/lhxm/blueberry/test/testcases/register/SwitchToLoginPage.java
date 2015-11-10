package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class SwitchToLoginPage extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSwitchToLoginPage() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *×¢²á°´Å¥
		solo.clickOnImageButton(1);
		solo.sleep(2000);
		
		solo.clickOnText("µÇÂ¼");
		solo.sleep(5000);
		
		assertTrue("Î´ÕÒµ½×¢²á°´Å¥", solo.searchText("×¢²á"));
	}
}
