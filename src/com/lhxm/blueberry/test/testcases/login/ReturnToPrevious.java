package com.lhxm.blueberry.test.testcases.login;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ReturnToPrevious extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReturnToPrevious() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		solo.clickOnImageButton(0);
		solo.sleep(2000);
		solo.clickOnText("返回");
		solo.sleep(2000);

		solo.assertCurrentActivity("未回到我的蓝莓界面！", MAIN_ACTIVITY);
		assertTrue("我的蓝莓未显示！", solo.searchText("我的蓝莓"));

	}
}
