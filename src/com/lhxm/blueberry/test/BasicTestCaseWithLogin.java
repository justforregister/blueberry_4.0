package com.lhxm.blueberry.test;

import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class BasicTestCaseWithLogin extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	public static final String loginAccount = "18583229745";
	public static final String loginPassword = "123456";
	
	
	public void doLoginWithAccount() {
		// solo.waitForActivity(MainActivity.class, 3000);
		if (EnterMinePageActivity.isLoggedIn() == false) {
			solo.clickOnImageButton(0);
			solo.enterText(0, loginAccount);
			solo.enterText(1, loginPassword);
			solo.clickOnImageButton(0);
			solo.sleep(1000);
		} else {
			solo.sleep(2000);
		}
	}
}