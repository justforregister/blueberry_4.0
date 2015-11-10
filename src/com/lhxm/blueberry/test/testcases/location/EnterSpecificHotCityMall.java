package com.lhxm.blueberry.test.testcases.location;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class EnterSpecificHotCityMall extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanEnterSpecificCityMall() {

		// Open choose city view
		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// 点击进入第4个热门城市
		v = solo.getView("textview", 3);
		TextView tv = (TextView) v;
		String cityText = tv.getText().toString();
		solo.clickOnView(v);

		// 比较当前Activity是否是商城主页Activity
		solo.assertCurrentActivity("未返回商城主页！", MAIN_ACTIVITY);

		// 判断主页热门城市名字出现
		assertTrue("热门城市名字未出现！", solo.searchText(cityText));
		solo.sleep(2000);

		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		v = solo.getView("nowCity", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

	}

}
