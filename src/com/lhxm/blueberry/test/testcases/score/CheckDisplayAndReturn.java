package com.lhxm.blueberry.test.testcases.score;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class CheckDisplayAndReturn extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testDisplayAndReturn() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("金币详情");

		assertTrue("顶端消息未显示！", solo.searchText("当天金币变化不计入统计"));

		solo.clickOnImageButton(0);
		
		solo.assertCurrentActivity("未回到我的蓝莓界面", MAIN_ACTIVITY);
		
	}
}
