package com.lhxm.blueberry.test.testcases.merchantsinfo;

import com.lhxm.blueberry.test.BasicTestCase;

public class ReturnToMerchandiseDetail extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReturnToMerchandiseDetail() {
		
		v = solo.getView("browser", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.clickOnButton("进入商铺");
		solo.sleep(2000);

		v = solo.getView("left_btn", 0);

		solo.assertCurrentActivity("未返回商品详情页！", MERCHANTS_ACTIVITY);
	}

}
