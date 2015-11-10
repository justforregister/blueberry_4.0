package com.lhxm.blueberry.test.testcases.secretary;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class NetworkOffCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNetworkOff() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("��ݮС��");

		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);

		solo.enterText(0, "���ԶϿ����緢����Ϣ");
		solo.clickOnButton("�� ��");

		// *TODO �ȴ��������
//		assertTrue("�Ͽ�������Ϣδ��ʾ��", solo.waitForText("���������������"));

	}
}
