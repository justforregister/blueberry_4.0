package com.lhxm.blueberry.test.testcases.systemsettings;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class LogoutCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testBrowserPagesinSettings() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("ϵͳ����");

		solo.clickOnText("�˳���¼");

		// *ȡ��
		solo.clickOnText("ȡ��");
		solo.assertCurrentActivity("δ�ص�ϵͳ���ý���", SYSTEM_SETTING_ACTIVITY);

		// *�˳��ɹ��������ҵ���ݮ����
		solo.clickOnText("�˳���¼");
		solo.clickOnText("�˳���¼");
		assertTrue("�˳��ɹ�δ��ʾ��", solo.waitForText("�˳��ɹ�"));
		solo.assertCurrentActivity("δ�ص��ҵ���ݮ����", MAIN_ACTIVITY);
	}

}
