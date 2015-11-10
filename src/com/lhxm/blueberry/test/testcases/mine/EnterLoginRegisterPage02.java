package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EnterLoginRegisterPage02 extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanEnterLoginRegisterPage() {

		EnterMinePageActivity.enterMinePage();
		doLogout();
		
		// *×¢²á°´Å¥
		solo.clickOnImageButton(1);
		solo.assertCurrentActivity("Î´½øÈëµÇÂ½/×¢²áÒ³Ãæ£¡", LOGIN_ACTIVITY);
	}
}
