package com.lhxm.blueberry.test.testcases.location;

import com.lhxm.blueberry.test.BasicTestCase;

public class HotCities extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testHotCity() {

		// Open choose city view
		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		assertTrue("热门城市未出现！", solo.searchText("热门城市"));

		// 判断出现3次成都
		assertTrue("成都未出现3次！", solo.searchText("成都", 3, true));

	}

}
