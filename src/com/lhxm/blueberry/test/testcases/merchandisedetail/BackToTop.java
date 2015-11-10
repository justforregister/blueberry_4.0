package com.lhxm.blueberry.test.testcases.merchandisedetail;

import com.lhxm.blueberry.test.BasicTestCase;

public class BackToTop extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testBackToTop() {
		v = solo.getView("browser", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.scrollToBottom();
		solo.sleep(2000);
		solo.drag(200, 200, 400, 50, 6);
		solo.sleep(2000);

		// 点击Back Top Button
		v = solo.getView("top", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		assertTrue("未到达顶部", solo.searchText("剩余"));
	}
}
