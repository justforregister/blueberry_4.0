package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ReturnSaveOrUnsaveCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReturnSaveOrUnsave() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("��������");
		solo.sleep(2000);

		// *δ�������㷵��
		solo.clearEditText(0);
		solo.enterText(0, "");
		solo.clickOnImageButton(0);

		// *��֤��ʾ��
		assertTrue("��ʾ��δ����",
				solo.searchText("δ�������") && solo.searchText("�Ƿ񷵻�?"));

		// *����
		solo.clickOnButton("��");
		solo.sleep(2000);
		solo.assertCurrentActivity("�����ҵ���ݮҳ��", MAIN_ACTIVITY);
		solo.clickOnText("��������");
		
		// *������
		solo.clearEditText(0);
		solo.enterText(0, "");
		solo.clickOnImageButton(0);
		solo.clickOnButton("��");
		solo.sleep(2000);
		solo.assertCurrentActivity("���ڸ�������ҳ��", ACCOUNT_DETAIL_ACTIVITY);

	}
}
