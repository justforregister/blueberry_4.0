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
		solo.clickOnText("����");
		solo.sleep(2000);

		solo.assertCurrentActivity("δ�ص��ҵ���ݮ���棡", MAIN_ACTIVITY);
		assertTrue("�ҵ���ݮδ��ʾ��", solo.searchText("�ҵ���ݮ"));

	}
}
