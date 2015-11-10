package com.lhxm.blueberry.test.testcases.award;


import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class RecommendLinkCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testRecommendLink() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("�Ƽ�����");
		solo.sleep(1000);
		
		// *���link
		solo.clickOnView(solo.getView("award_link_text"));
		solo.assertCurrentActivity("δ�����ƹ�ҳ��", BROWSER_ACTIVITY);
		solo.clickOnView(solo.getView("left_btn"));
		
		// *�������
		solo.clickOnText("�������");
		assertTrue("���Ƴɹ�δ���֣�", solo.waitForText("���Ƴɹ�"));
		
	}
}
