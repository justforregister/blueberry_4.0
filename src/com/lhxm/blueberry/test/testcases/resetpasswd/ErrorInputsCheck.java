package com.lhxm.blueberry.test.testcases.resetpasswd;

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

		// *��¼��ť
		solo.clickOnImageButton(0);

		// *����������룿��ť
		v = solo.getView("forget_pass_img");
		solo.clickOnView(v);
		solo.sleep(2000);

		// *�����ֻ�������
		solo.clickOnImageButton(0);
		assertTrue("\"��������ȷ���ֻ���\"δ��ʾ", solo.waitForText("��������ȷ���ֻ���"));
		solo.sleep(2000);

		// *���������벻һ��
		solo.enterText(0, "18888888888");
		solo.enterText(1, "432122");
		solo.enterText(2, "123456");
		solo.enterText(3, "654321");
		solo.clickOnImageButton(0);
		assertTrue("\"�����������벻һ��\"δ��ʾ", solo.waitForText("������������벻һ��"));
		solo.sleep(2000);
		
		// *��֤������
		solo.clearEditText(1);
		solo.enterText(1, "43122");
		solo.clickOnImageButton(0);
		assertTrue("\"��֤������\"δ��ʾ", solo.waitForText("��֤������"));
		

	}
}
