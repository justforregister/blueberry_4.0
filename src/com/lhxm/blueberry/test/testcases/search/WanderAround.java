package com.lhxm.blueberry.test.testcases.search;

import com.lhxm.blueberry.test.BasicTestCase;

public class WanderAround extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEmptySearchResult() {

		v = solo.getView("search_layout", 0);
		solo.clickOnView(v);
		solo.sleep(1000);

		solo.enterText(0, "空结果");
		v = solo.getView("right_text_btn", 0);
		solo.clickOnView(v);

		solo.clickOnButton("随便逛逛");
		solo.sleep(2000);

		assertTrue("产品列表页未正常刷新并显示！", solo.searchText("浏览"));

	}

}
