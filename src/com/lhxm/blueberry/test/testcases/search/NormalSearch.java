package com.lhxm.blueberry.test.testcases.search;

import com.lhxm.blueberry.test.BasicTestCase;


public class NormalSearch extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNormalSearch() {
		
		v = solo.getView("search_layout", 0);
		solo.clickOnView(v);
		solo.sleep(1000);

		solo.enterText(0, "���");
		v = solo.getView("right_text_btn", 0);
		solo.clickOnView(v);
		solo.sleep(1000);

		assertTrue("δ�ҵ�������������ܳ�BUG!", solo.searchText("���"));

	}

}
