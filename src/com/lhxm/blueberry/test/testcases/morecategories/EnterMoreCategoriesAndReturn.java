package com.lhxm.blueberry.test.testcases.morecategories;

import com.lhxm.blueberry.test.BasicTestCase;

public class EnterMoreCategoriesAndReturn extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanOpenCatagories() {

		solo.scrollToTop();
		solo.clickOnText("更多分类");

		assertTrue("全部分类未显示！", solo.searchText("全部分类"));

		v = solo.getView("left_btn", 0);
		solo.clickOnView(v);
		solo.sleep(1000);

		solo.assertCurrentActivity("未返回商城主页！", MAIN_ACTIVITY);
	}
}
