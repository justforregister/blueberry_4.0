package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class PasswordResetSuccess extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterPersonalProfile() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("��������");
		solo.sleep(2000);

		v = solo.getView("update_pass_layout");
		solo.clickOnView(v);

		// *�޸ĳɹ�����¼����
		solo.enterText(0, "test123");
		solo.enterText(1, "test123");
		solo.enterText(2, "test123");
		solo.clickOnImageButton(0);

		assertTrue("�޸ĳɹ���ʾδ��ʾ", solo.waitForText("�����޸ĳɹ��������µ�¼"));

		solo.assertCurrentActivity("δ����¼����", LOGIN_ACTIVITY);

		// *������أ����ҵ���ݮδ��¼����
		solo.clickOnText("����");
		solo.assertCurrentActivity("δ���ҵ���ݮ����", MAIN_ACTIVITY);
		assertTrue("�ѵ�¼��", EnterMinePageActivity.isLoggedIn() == false);

	}
}
