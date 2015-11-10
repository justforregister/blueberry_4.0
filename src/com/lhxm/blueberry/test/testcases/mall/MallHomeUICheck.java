package com.lhxm.blueberry.test.testcases.mall;

import com.lhxm.blueberry.test.BasicTestCase;

public class MallHomeUICheck extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanDisplayHeaders() {

		solo.scrollToTop();
		v = solo.getView("icon", 2);
		solo.clickOnView(v);
		solo.sleep(5000);
	}
}
