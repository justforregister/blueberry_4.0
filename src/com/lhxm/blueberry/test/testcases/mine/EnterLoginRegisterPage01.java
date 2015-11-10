package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EnterLoginRegisterPage01 extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanEnterLoginRegisterPage() {

		EnterMinePageActivity.enterMinePage();
		doLogout();
		
		// *��½��ť
		solo.clickOnImageButton(0);
		solo.assertCurrentActivity("δ�����½/ע��ҳ�棡", LOGIN_ACTIVITY);
		
	}
}
