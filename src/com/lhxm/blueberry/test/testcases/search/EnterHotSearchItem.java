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

		// *���Ե���ҳ����ͼ�꣬������������
		solo.enterText(0, "���");
		solo.clickOnView(solo.getView("right_text_btn", 0));
		solo.sleep(1000);
		solo.clickOnView(solo.getView("right_btn"));

		solo.assertCurrentActivity("δ��������ҳ�棡", SEARCH_ACTIVITY);

		// *��������������
		v = solo.getView("textview", 2);
		solo.clickOnView(v);
		solo.sleep(1000);

		assertTrue("δ�ҵ�������������ܳ�BUG!", solo.searchText("���"));

	}

}
