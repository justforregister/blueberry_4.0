package com.lhxm.blueberry.test.testcases.mall;

import com.lhxm.blueberry.test.BasicTestCase;

public class OpenCategories extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanOpenCatagories() {
		
		solo.scrollToTop();
		solo.clickOnText("美食");
		solo.sleep(1000);
		assertTrue(solo.searchText("美食"));

		v = solo.getView("left_btn");
		solo.clickOnView(v);

		solo.clickOnText("休闲娱乐");
		solo.sleep(1000);
		assertTrue(solo.searchText("休闲娱乐"));
		solo.clickOnView(v);

		solo.clickOnText("生活服务");
		solo.sleep(1000);
		assertTrue(solo.searchText("生活服务"));
		solo.clickOnView(v);

		solo.scrollToTop();
		solo.clickOnText("更多分类");
		solo.sleep(1000);
		assertTrue(solo.searchText("更多分类"));
	}
}
