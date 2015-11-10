package com.lhxm.blueberry.test.testcases.merchantsinfo;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class MerchantsInfo extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testMerchantsInfoDisplay() {

		v = solo.getView("browser", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.clickOnButton("进入商铺");
		solo.sleep(2000);

		TextView name = (TextView) solo.getView("name", 0);
		String merchantsName = name.getText().toString();
		TextView add = (TextView) solo.getView("address", 0);
		String merchantsAddress = add.getText().toString();

		assertTrue("商家基本信息未显示！", merchantsName != "" && merchantsAddress != "");
		assertTrue(
				"商家更多信息未显示！",
				solo.searchText("查看路线") && solo.searchText("营业时间")
						&& solo.searchText("支持WIFI")
						&& solo.searchText("支持POS刷卡"));
	}

}
