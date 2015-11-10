package com.lhxm.blueberry.test.testcases.mall;

import com.lhxm.blueberry.test.BasicTestCase;

public class OpenCategories extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanOpenCatagories() {
		
		solo.scrollToTop();
		solo.clickOnText("��ʳ");
		solo.sleep(1000);
		assertTrue(solo.searchText("��ʳ"));

		v = solo.getView("left_btn");
		solo.clickOnView(v);

		solo.clickOnText("��������");
		solo.sleep(1000);
		assertTrue(solo.searchText("��������"));
		solo.clickOnView(v);

		solo.clickOnText("�������");
		solo.sleep(1000);
		assertTrue(solo.searchText("�������"));
		solo.clickOnView(v);

		solo.scrollToTop();
		solo.clickOnText("�������");
		solo.sleep(1000);
		assertTrue(solo.searchText("�������"));
	}
}
