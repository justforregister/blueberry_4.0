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

		solo.enterText(0, "�ս��");
		v = solo.getView("right_text_btn", 0);
		solo.clickOnView(v);

		solo.clickOnButton("�����");
		solo.sleep(2000);

		assertTrue("��Ʒ�б�ҳδ����ˢ�²���ʾ��", solo.searchText("���"));

	}

}
