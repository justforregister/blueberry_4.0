package com.lhxm.blueberry.test.testcases.morecategories;

import com.lhxm.blueberry.test.BasicTestCase;

public class DisplayAllCategories extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanOpenCatagories() {

		solo.scrollToTop();
		solo.clickOnText("�������");

		assertTrue("ȫ������δ��ʾ��", solo.searchText("ȫ������"));

		solo.clickOnButton("ȫ������");
		solo.sleep(1000);

		solo.assertCurrentActivity("δ����������Ʒҳ�棡", MERCHANTS_LIST);
	}
}
