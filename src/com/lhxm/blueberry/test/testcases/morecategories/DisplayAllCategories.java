package com.lhxm.blueberry.test.testcases.morecategories;

import com.lhxm.blueberry.test.BasicTestCase;

public class DisplayAllCategories extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanOpenCatagories() {

		solo.scrollToTop();
		solo.clickOnText("更多分类");

		assertTrue("全部分类未显示！", solo.searchText("全部分类"));

		solo.clickOnButton("全部分类");
		solo.sleep(1000);

		solo.assertCurrentActivity("未进入所有商品页面！", MERCHANTS_LIST);
	}
}
