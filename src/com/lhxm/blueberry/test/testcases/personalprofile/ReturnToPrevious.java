package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;

import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ReturnToPrevious extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReturnToPrevious() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("个人资料");
		solo.sleep(2000);
		solo.clickOnImageButton(0);

		solo.assertCurrentActivity("未回到我的蓝莓界面！", MAIN_ACTIVITY);
		assertTrue("我的蓝莓未显示！", solo.searchText("我的蓝莓"));

	}
}
