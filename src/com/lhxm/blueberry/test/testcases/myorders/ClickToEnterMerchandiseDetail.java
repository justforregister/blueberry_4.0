package com.lhxm.blueberry.test.testcases.myorders;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ClickToEnterMerchandiseDetail extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testClickToEnterDetail() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("�ҵĶ���");
		
		try {
			v = solo.getView("pro_img",0);
			solo.clickOnView(v);
			solo.assertCurrentActivity("δ������Ʒ����ҳ��", MERCHANDISE_DETAIL);
			
		} catch (Throwable e) {
			// TODO: handle exception
			solo.clickOnImageButton(0);
		}


	}
}
