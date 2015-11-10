package com.lhxm.blueberry.test.testcases.mycollections;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class ExchangeWhenNetworkOff extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testExchangeWhenNetwordOff() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("�ҵ��ղ�");

		solo.sleep(2000);

		try {
			NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
			solo.sleep(5000);

			solo.clickOnText("�����һ�", 0);
			solo.sleep(1000);

			// *ȷ�϶һ�
			solo.clickOnImageButton(0);

			assertTrue("��δ����������ʾδ��ʾ��", solo.waitForText("��δ��������"));
		} catch (Throwable e) {
			// TODO: handle exception
			solo.clickOnImageButton(0);
		}

	}
}
