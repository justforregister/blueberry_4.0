package com.lhxm.blueberry.test.testcases.search;

import com.lhxm.blueberry.test.BasicTestCase;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class NetworkOffCheck extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNetworkOff() throws Throwable {

		solo.clickOnView(solo.getView("search_layout", 0));
		solo.sleep(1000);

		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);

		solo.enterText(0, "���");
		solo.clickOnView(solo.getView("right_text_btn", 0));
		solo.sleep(1000);

		assertTrue("�Ͽ�������ʾδ��ʾ��", solo.waitForText("���������������"));

	}
}
