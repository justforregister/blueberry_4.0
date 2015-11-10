package com.lhxm.blueberry.test.testcases.systemsettings;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class HelpGuideAbout extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testBrowserPagesinSettings() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("系统设置");

		solo.clickOnText("帮助指南");
		assertTrue("帮助指南未显示", solo.searchText("帮助指南"));
		solo.clickOnView(solo.getView("left_btn"));
		solo.clickOnText("蓝莓攻略");
		assertTrue("蓝莓攻略未显示", solo.searchText("蓝莓攻略"));
		solo.clickOnView(solo.getView("left_btn"));
		solo.clickOnText("关于蓝莓");
		assertTrue("关于蓝莓未显示", solo.searchText("关于蓝莓"));
	}

}
