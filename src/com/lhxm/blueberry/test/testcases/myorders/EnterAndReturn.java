package com.lhxm.blueberry.test.testcases.myorders;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EnterAndReturn extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterAndReturn() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("我的订单");
		
		solo.assertCurrentActivity("未进入我的订单", CONSUME_ACTIVITY);
		
		solo.clickOnImageButton(0);

		solo.assertCurrentActivity("未进入我的订单", MAIN_ACTIVITY);

	}
}
