package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ErrorInputsCheck extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testErrorInput() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *ע�ᰴť
		solo.clickOnImageButton(1);

		// *��������
		solo.enterText(0, "18888888888");
		solo.clickOnImageButton(0);
		assertTrue("\"������������\"δ��ʾ", solo.waitForText("������������"));
		solo.sleep(2000);
		v = solo.getView("del_account");
		solo.clickOnView(v);
		solo.sleep(2000);

		// *�����ֻ���
		solo.enterText(1, "123456");
		solo.clickOnImageButton(0);
		assertTrue("\"��������ȷ���ֻ���\"δ��ʾ", solo.waitForText("��������ȷ���ֻ���"));
		solo.sleep(2000);

		// *δ��ѡͬ������
		solo.enterText(0, "18888888888");
		solo.clickOnImageButton(0);
		assertTrue("\"��ͬ���������\"δ��ʾ", solo.waitForText("��ͬ���������"));
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);

		// *�����ֻ���
		solo.enterText(0, "123456");
		solo.enterText(1, "123456");
		solo.clickOnImageButton(0);
		assertTrue("\"��������ȷ���ֻ���\"δ��ʾ", solo.waitForText("��������ȷ���ֻ���"));
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);

		// *��������
		solo.enterText(0, "18888888888");
		solo.enterText(1, "12ab");
		solo.clickOnImageButton(0);
		assertTrue("\"������������\"δ��ʾ", solo.waitForText("������������"));
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);

		// *��ע����ֻ���
		solo.enterText(0, "18888888888");
		solo.enterText(1, "123456");
		solo.clickOnCheckBox(0);
		solo.clickOnImageButton(0);
		assertTrue("\"�ֻ����Ѿ�ע��\"δ��ʾ", solo.waitForText("�ֻ����Ѿ�ע�᣺18888888888"));

	}
}
