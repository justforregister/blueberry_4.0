package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.*;

public class ChangeHeadImageWhenNetworkOff extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testChangeHeadImageWhenNetworkOff() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		v = solo.getView("user_head_img");
		solo.clickOnView(v);

		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);

		solo.clickOnText("���ֻ����ѡ��");

		assertTrue("����Ͽ�toastδ���֣�", solo.waitForText("��������������ʹ���ϴ�ͷ����"));

	}
}
