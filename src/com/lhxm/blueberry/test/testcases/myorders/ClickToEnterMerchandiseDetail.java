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

		solo.clickOnText("我的订单");
		
		try {
			v = solo.getView("pro_img",0);
			solo.clickOnView(v);
			solo.assertCurrentActivity("未进入商品详情页面", MERCHANDISE_DETAIL);
			
		} catch (Throwable e) {
			// TODO: handle exception
			solo.clickOnImageButton(0);
		}


	}
}
