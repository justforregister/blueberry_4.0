package com.lhxm.blueberry.test.testcases.search;

import com.lhxm.blueberry.test.BasicTestCase;

public class ReturnToMallHome extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanReturnToMallHome() {

		// *����ҳ����
		solo.clickOnView(solo.getView("search_layout", 0));
		solo.sleep(1000);

		solo.clickOnView(solo.getView("left_btn", 0));
		solo.sleep(1000);

		// �Ƚϵ�ǰActivity�Ƿ����̳���ҳActivity
		solo.assertCurrentActivity("δ�����̳���ҳ��", MAIN_ACTIVITY);

		// *�������ҳ����
		solo.clickOnView(solo.getView("search_layout", 0));
		solo.enterText(0, "���");
		solo.clickOnView(solo.getView("right_text_btn", 0));
		solo.sleep(1000);
		solo.clickOnView(solo.getView("left_btn", 0));
		solo.sleep(1000);
		solo.assertCurrentActivity("δ�����̳���ҳ��", MAIN_ACTIVITY);
	}

}
