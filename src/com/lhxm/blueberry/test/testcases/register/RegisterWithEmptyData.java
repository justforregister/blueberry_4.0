package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class RegisterWithEmptyData extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReisterWithEmptyData() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *ע�ᰴť
		solo.clickOnImageButton(1);

		// *ע�ᰴť��ע��ҳ�棩
		solo.clickOnImageButton(0);

		assertTrue("��ʾ�����ֻ�����Ϣδ��ʾ", solo.waitForText("��������ȷ���ֻ���"));

	}
}
