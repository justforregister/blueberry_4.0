package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ReferralCodeCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanDisplayReferralCode() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		assertTrue("ÍÆ¼öÂëÎ´ÏÔÊ¾£¡", solo.searchText("ÍÆ¼öÂë"));

	}
}
