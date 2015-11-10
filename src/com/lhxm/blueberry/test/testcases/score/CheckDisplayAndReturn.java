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

		solo.clickOnText("�������");

		assertTrue("������Ϣδ��ʾ��", solo.searchText("�����ұ仯������ͳ��"));

		solo.clickOnImageButton(0);
		
		solo.assertCurrentActivity("δ�ص��ҵ���ݮ����", MAIN_ACTIVITY);
		
	}
}
