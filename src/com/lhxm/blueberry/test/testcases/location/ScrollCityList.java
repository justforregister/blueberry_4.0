package com.lhxm.blueberry.test.testcases.location;

import com.lhxm.blueberry.test.BasicTestCase;

public class ScrollCityList extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanFindSpecificCityInList() {

		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// 下拉到第30行查找重庆市
		// solo.scrollDownList(0);
		solo.scrollListToLine(0, 30);
		solo.sleep(2000);

		assertTrue("未找到对应位置城市！", solo.searchText("重庆市"));

		// solo.sleep(2000);
		// v = solo.getView("city_text", 0);
		// solo.clickOnView(v);
		// solo.sleep(2000);
		//
		// v = solo.getView("nowCity", 0);
		// solo.clickOnView(v);
		// solo.sleep(2000);
	}

}
