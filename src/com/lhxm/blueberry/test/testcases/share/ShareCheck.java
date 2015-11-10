package com.lhxm.blueberry.test.testcases.share;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class ShareCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testShareAndUpdate() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("��������");
		solo.sleep(1000);

		assertTrue(
				"�ɷ���ƽ̨����δ��ʾ��",
				solo.searchText("΢��") && solo.searchText("΢��")
						&& solo.searchText("QQ"));
		solo.goBack();

		// *�Ͽ�������
		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);
		solo.clickOnText("��������");
		// *�����һ������ͼ��
		v = solo.getView("umeng_socialize_shareboard_image", 0);
		solo.clickOnView(v);
		solo.sleep(1000);
		assertTrue("���粻����δ��ʾ", solo.waitForText("�������粻����,������������..."));

	}

	@Override
	public void tearDown() throws Exception {
		getActivity().finish();
	}
}
