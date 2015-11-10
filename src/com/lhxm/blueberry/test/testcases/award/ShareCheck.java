package com.lhxm.blueberry.test.testcases.award;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class ShareCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testShareCheck() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("�Ƽ�����");
		solo.sleep(1000);

		v = solo.getView("right_img");
		solo.clickOnView(v);

		assertTrue(
				"�ɷ���ƽ̨����δ��ʾ��",
				solo.searchText("΢��") && solo.searchText("΢��")
						&& solo.searchText("QQ"));

		solo.clickOnView(v);

		// *�Ͽ�������
		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);
		solo.clickOnView(v);
		// *�����һ������ͼ��
		v = solo.getView("umeng_socialize_shareboard_image", 0);
		solo.clickOnView(v);

		assertTrue("���粻����δ��ʾ", solo.waitForText("�������粻����,������������..."));

	}
}
