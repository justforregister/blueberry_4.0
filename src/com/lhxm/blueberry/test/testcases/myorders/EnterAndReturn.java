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

		solo.clickOnText("�ҵĶ���");
		
		solo.assertCurrentActivity("δ�����ҵĶ���", CONSUME_ACTIVITY);
		
		solo.clickOnImageButton(0);

		solo.assertCurrentActivity("δ�����ҵĶ���", MAIN_ACTIVITY);

	}
}
