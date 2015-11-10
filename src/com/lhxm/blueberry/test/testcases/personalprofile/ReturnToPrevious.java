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

		solo.clickOnText("��������");
		solo.sleep(2000);
		solo.clickOnImageButton(0);

		solo.assertCurrentActivity("δ�ص��ҵ���ݮ���棡", MAIN_ACTIVITY);
		assertTrue("�ҵ���ݮδ��ʾ��", solo.searchText("�ҵ���ݮ"));

	}
}
