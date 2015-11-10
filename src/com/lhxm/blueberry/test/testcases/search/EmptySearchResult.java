package com.lhxm.blueberry.test.testcases.search;

import com.lhxm.blueberry.test.BasicTestCase;

public class EmptySearchResult extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEmptySearchResult() {

		v = solo.getView("search_layout", 0);
		solo.clickOnView(v);
		solo.sleep(1000);
		
		// *没内容
		solo.enterText(0, "");
		v = solo.getView("right_text_btn", 0);
		solo.clickOnView(v);
		solo.sleep(1000);
		assertTrue("请输入内容提示未出现！", solo.searchText("输入商家或商品名称"));
		
		// *没结果
		solo.enterText(0, "空结果");
		v = solo.getView("right_text_btn", 0);
		solo.clickOnView(v);
		solo.sleep(1000);

		assertTrue("搜索结果为空提示未出现！", solo.searchText("暂时没找到\"空结果\"相关信息"));

	}

}
