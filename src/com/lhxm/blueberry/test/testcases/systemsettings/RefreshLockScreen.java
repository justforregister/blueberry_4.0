package com.lhxm.blueberry.test.testcases.systemsettings;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class RefreshLockScreen extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNumbersLockScreen() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		// *�����������ã�ˢ������
		solo.clickOnText("ϵͳ����");
		if (solo.isCheckBoxChecked(1)) {
			solo.clickOnCheckBox(1);
		} else {
			solo.sleep(1000);
		}
		solo.clickOnText("ˢ������");
		assertTrue("��������δ����δ��ʾ��", solo.waitForText("��������δ����"));

		// *������������
		solo.clickOnText("ϵͳ����");
		if (solo.isCheckBoxChecked(1) == false) {
			solo.clickOnCheckBox(1);
		} else {
			solo.sleep(1000);
		}
		solo.clickOnText("ˢ������");
		assertTrue("������ʼ��Ϣδ��ʾ", solo.waitForText("ˢ��������ʼ�������ظ����"));

		// *�Ͽ�����
		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);
		solo.clickOnText("ˢ������");
		assertTrue("δ��������δ��ʾ", solo.waitForText("δ��������"));
	}

}
