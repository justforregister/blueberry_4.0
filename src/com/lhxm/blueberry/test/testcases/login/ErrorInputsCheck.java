package com.lhxm.blueberry.test.testcases.login;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.Util;

public class ErrorInputsCheck extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testErrorInput() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *��¼��ť
		solo.clickOnImageButton(0);

		// *�����ֻ�������
		solo.clickOnImageButton(0);
		assertTrue("\"��������ȷ���ֻ���\"δ��ʾ", solo.waitForText("��������ȷ���ֻ���"));
		solo.sleep(2000);

		// *��������
		solo.enterText(0, "18888888888");
		solo.clickOnImageButton(0);
		assertTrue("\"����������\"δ��ʾ", solo.waitForText("����������"));
		solo.sleep(2000);
		v = solo.getView("del_account");
		solo.clickOnView(v);
		solo.sleep(2000);

		// *�����ֻ���
		solo.enterText(1, "123456");
		solo.clickOnImageButton(0);
		assertTrue("\"��������ȷ���ֻ���\"δ��ʾ", solo.waitForText("��������ȷ���ֻ���"));
		solo.sleep(2000);

		// *�����������
		solo.enterText(0, "13980424212");
		solo.enterText(1, "123456");
		solo.clickOnImageButton(0);
		assertTrue("\"�û������������\"δ��ʾ", solo.waitForText("�û������������"));
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);

		// *�����ֻ���
		String phoneNumber = Util.getFixLenthString(11);
		solo.enterText(0, phoneNumber);
		solo.enterText(1, "123456");
		solo.clickOnImageButton(0);
		assertTrue("\"�û�������\"δ��ʾ", solo.waitForText("�û�������"));
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);

		// *��д��ĸ��ȷ����
		solo.enterText(0, "13980424212");
		solo.enterText(1, "TEST123");
		solo.clickOnImageButton(0);
		assertTrue("\"�û������������\"δ��ʾ", solo.waitForText("�û������������"));
		

	}


}
