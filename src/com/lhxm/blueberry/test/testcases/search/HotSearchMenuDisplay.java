package com.lhxm.blueberry.test.testcases.search;

import com.lhxm.blueberry.test.BasicTestCase;

public class HotSearchMenuDisplay extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testHotSearchMenuDisplay() {

		v = solo.getView("search_layout", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		assertTrue("��������δ������ʾ��",
				solo.searchText("��������") && solo.searchText("ȫ��"));
	}

}