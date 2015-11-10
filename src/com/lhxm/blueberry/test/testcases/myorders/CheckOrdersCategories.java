package com.lhxm.blueberry.test.testcases.myorders;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class CheckOrdersCategories extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testOrdersCategories() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("我的订单");

		// *默认显示“所有订单”
		assertTrue("所有订单未显示！", solo.searchText("所有订单"));
		solo.sleep(1000);

		// *点击所有订单，弹出下拉框，进入分类项
		v = solo.getView("order_category_layout");
		solo.clickOnView(v);
		solo.clickOnText("未使用");
		solo.sleep(1000);
		solo.clickOnView(v);
		solo.clickOnText("已使用");
		solo.sleep(1000);
		solo.clickOnView(v);
		solo.clickOnText("待评价");
		solo.sleep(1000);
		solo.clickOnView(v);
		solo.clickOnText("配送中");
		solo.sleep(1000);
		solo.clickOnView(v);
		solo.clickOnText("已过期");
		solo.sleep(1000);

	}
}
