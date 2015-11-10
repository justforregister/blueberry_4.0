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
		
		// *û����
		solo.enterText(0, "");
		v = solo.getView("right_text_btn", 0);
		solo.clickOnView(v);
		solo.sleep(1000);
		assertTrue("������������ʾδ���֣�", solo.searchText("�����̼һ���Ʒ����"));
		
		// *û���
		solo.enterText(0, "�ս��");
		v = solo.getView("right_text_btn", 0);
		solo.clickOnView(v);
		solo.sleep(1000);

		assertTrue("�������Ϊ����ʾδ���֣�", solo.searchText("��ʱû�ҵ�\"�ս��\"�����Ϣ"));

	}

}
