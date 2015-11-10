package com.lhxm.blueberry.test.testcases.search;

import com.lhxm.blueberry.test.BasicTestCase;

public class ReturnToMallHome extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanReturnToMallHome() {

		// *搜索页返回
		solo.clickOnView(solo.getView("search_layout", 0));
		solo.sleep(1000);

		solo.clickOnView(solo.getView("left_btn", 0));
		solo.sleep(1000);

		// 比较当前Activity是否是商城主页Activity
		solo.assertCurrentActivity("未返回商城主页！", MAIN_ACTIVITY);

		// *搜索结果页返回
		solo.clickOnView(solo.getView("search_layout", 0));
		solo.enterText(0, "火锅");
		solo.clickOnView(solo.getView("right_text_btn", 0));
		solo.sleep(1000);
		solo.clickOnView(solo.getView("left_btn", 0));
		solo.sleep(1000);
		solo.assertCurrentActivity("未返回商城主页！", MAIN_ACTIVITY);
	}

}
