package com.lhxm.blueberry.test.testcases.morecategories;

import com.lhxm.blueberry.test.BasicTestCase;

public class EnterMoreCategoriesAndReturn extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanOpenCatagories() {

		solo.scrollToTop();
		solo.clickOnText("�������");

		assertTrue("ȫ������δ��ʾ��", solo.searchText("ȫ������"));

		v = solo.getView("left_btn", 0);
		solo.clickOnView(v);
		solo.sleep(1000);

		solo.assertCurrentActivity("δ�����̳���ҳ��", MAIN_ACTIVITY);
	}
}
