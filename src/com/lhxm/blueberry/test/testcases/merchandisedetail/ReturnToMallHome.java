package com.lhxm.blueberry.test.testcases.merchandisedetail;

import com.lhxm.blueberry.test.BasicTestCase;

public class ReturnToMallHome extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanReturnToMallHome() {
		v = solo.getView("browser", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// 点击Home Button
		solo.clickOnButton(3);
		solo.sleep(2000);

		// 比较当前Activity是否是商城主页Activity
		solo.assertCurrentActivity("未返回商城主页！", MAIN_ACTIVITY);
	}

}
