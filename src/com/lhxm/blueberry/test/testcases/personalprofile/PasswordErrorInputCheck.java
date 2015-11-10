package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class PasswordErrorInputCheck extends BasicTestCaseWithLogin {

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

		// *Empty Input
		solo.clickOnImageButton(0);
		assertTrue("����ȷ��д������δ��ʾ", solo.waitForText("����ȷ��д������"));

		// *ֻ���������
		solo.enterText(0, "test123");
		solo.clickOnImageButton(0);
		assertTrue("���������������δ��ʾ", solo.waitForText("���������������"));

		// *�����������
		solo.clearEditText(0);
		solo.enterText(1, "test123");
		solo.enterText(2, "test123");
		solo.clickOnImageButton(0);
		assertTrue("����ȷ��д������δ��ʾ", solo.waitForText("����ȷ��д������"));

		// *���Ϲ���������
		solo.clearEditText(1);
		solo.clearEditText(2);
		solo.enterText(0, "test123");
		solo.enterText(1, "test");
		solo.enterText(2, "test");
		solo.clickOnImageButton(0);
		assertTrue("���볤������6-20λ", solo.waitForText("���볤������6\\-20λ"));

		// *�����벻һ��
		// *��һ��
		solo.clearEditText(0);
		solo.clearEditText(1);
		solo.clearEditText(2);
		solo.enterText(0, "test123");
		solo.enterText(1, "test123");
		solo.enterText(2, "abdjj");
		solo.clickOnImageButton(0);
		assertTrue("�������벻һ��δ��ʾ", solo.waitForText("�Բ�����������������벻һ��"));
		// *��Сд��ͬ
		solo.clearEditText(2);
		solo.enterText(2, "teSt123");
		solo.clickOnImageButton(0);
		assertTrue("�������벻һ��δ��ʾ", solo.waitForText("�Բ�����������������벻һ��"));

	}
}
