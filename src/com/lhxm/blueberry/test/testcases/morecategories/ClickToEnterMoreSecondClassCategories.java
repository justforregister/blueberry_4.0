package com.lhxm.blueberry.test.testcases.morecategories;

import com.lhxm.blueberry.test.BasicTestCase;

public class ClickToEnterMoreSecondClassCategories extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanOpenCatagories() {

		solo.scrollToTop();
		solo.clickOnText("更多分类");

		// Click on relative layout by index:
		v = solo.getView("click_layout", 5);
		solo.clickOnView(v);

		solo.sleep(2000);

		// TODO assertion

	}
}
