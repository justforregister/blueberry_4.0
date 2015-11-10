package com.lhxm.blueberry.test.testcases.systemsettings;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class SetNumbersLockScreen extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNumbersLockScreen() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		// *������������
		solo.clickOnText("ϵͳ����");
		if (solo.isCheckBoxChecked(1) == false) {
			solo.clickOnCheckBox(1);
		} else {
			solo.sleep(1000);
		}

		// *���������������
		solo.clickOnCheckBox(2);
		// *������λ����,��ȷ��
		solo.enterText(0, "1234");
		solo.clickOnText("ȷ��");
		// *���ȡ���򷵻ذ�ť
		solo.clickOnText("ȡ��");
		solo.sleep(1000);
		solo.clickOnText("ȡ��");
		solo.clickOnImageButton(0);
		solo.clickOnText("ȡ��");
		// *���벻һ��
		solo.enterText(0, "1235");
		solo.clickOnText("ȷ��");
		assertTrue("���벻һ��δ��ʾ", solo.waitForText("����������������벻һ��"));
		// *�ɹ�����
		solo.enterText(0, "1234");
		solo.clickOnText("ȷ��");
		assertTrue("�������óɹ�δ��ʾ", solo.waitForText("������������ɹ�"));

		// *�ٴν�����������
		solo.clickOnCheckBox(2);
		// *��������
		solo.enterText(0, "2323");
		solo.clickOnText("ȷ��");
		assertTrue("�������δ��ʾ", solo.waitForText("�����������������"));
		// *ȡ���򷵻�
		solo.clickOnText("ȡ��");
		solo.clickOnCheckBox(2);
		solo.clickOnImageButton(0);
		solo.clickOnCheckBox(2);
		// *��ȷ����
		solo.enterText(0, "1234");
		solo.clickOnText("ȷ��");

	}

}
