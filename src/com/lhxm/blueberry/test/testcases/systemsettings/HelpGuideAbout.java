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

		solo.clickOnText("ϵͳ����");

		solo.clickOnText("����ָ��");
		assertTrue("����ָ��δ��ʾ", solo.searchText("����ָ��"));
		solo.clickOnView(solo.getView("left_btn"));
		solo.clickOnText("��ݮ����");
		assertTrue("��ݮ����δ��ʾ", solo.searchText("��ݮ����"));
		solo.clickOnView(solo.getView("left_btn"));
		solo.clickOnText("������ݮ");
		assertTrue("������ݮδ��ʾ", solo.searchText("������ݮ"));
	}

}
