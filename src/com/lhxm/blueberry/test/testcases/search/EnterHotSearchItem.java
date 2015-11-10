package com.lhxm.blueberry.test.testcases.search;

import com.lhxm.blueberry.test.BasicTestCase;

public class EnterHotSearchItem extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanEnterHotSearchItem() {

		solo.clickOnView(solo.getView("search_layout", 0));
		solo.sleep(1000);

		// *测试点结果页搜索图标，返回搜索界面
		solo.enterText(0, "火锅");
		solo.clickOnView(solo.getView("right_text_btn", 0));
		solo.sleep(1000);
		solo.clickOnView(solo.getView("right_btn"));

		solo.assertCurrentActivity("未返回搜索页面！", SEARCH_ACTIVITY);

		// *点击热门搜索火锅
		v = solo.getView("textview", 2);
		solo.clickOnView(v);
		solo.sleep(1000);

		assertTrue("未找到相关搜索，可能出BUG!", solo.searchText("火锅"));

	}

}
