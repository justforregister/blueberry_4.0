package com.lhxm.blueberry.test.testcases.login;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class LoginSuccessCheck extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testLoginSuccess() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *��¼��ť
		solo.clickOnImageButton(0);

		solo.enterText(0, "13980424212");
		solo.enterText(1, "test123");
		solo.clickOnImageButton(0);
		assertTrue("\"��ӭ��Ϣδ����\"δ��ʾ", solo.waitForText("��ӭ�ص���ݮ"));

	}
}
