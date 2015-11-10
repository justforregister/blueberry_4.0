package com.lhxm.blueberry.test.testcases.secretary;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class InputCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testInputs() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("��ݮС��");
		solo.sleep(1000);

		// *���ѡ��
		solo.clickOnView(solo.getView("select_check"));
		solo.clickOnView(solo.getView("suggestion"));
		solo.clickOnView(solo.getView("select_check"));
		solo.clickOnView(solo.getView("complaints"));
		solo.clickOnView(solo.getView("select_check"));
		solo.clickOnView(solo.getView("others"));
		solo.clickOnView(solo.getView("select_check"));

		// *���������ݻ�ո�
		solo.enterText(0, "");
		solo.clickOnButton("�� ��");
		assertTrue("����������δ��ʾ��", solo.waitForText("�����������̫��"));
		solo.clearEditText(0);
		solo.enterText(0, "        ");
		solo.clickOnButton("�� ��");
		assertTrue("����������δ��ʾ��", solo.waitForText("�����뷴������"));

	}
}
