package com.lhxm.blueberry.test.testcases.location;

import com.lhxm.blueberry.test.BasicTestCase;

public class ScrollCityList extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanFindSpecificCityInList() {

		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// ��������30�в���������
		// solo.scrollDownList(0);
		solo.scrollListToLine(0, 30);
		solo.sleep(2000);

		assertTrue("δ�ҵ���Ӧλ�ó��У�", solo.searchText("������"));

		// solo.sleep(2000);
		// v = solo.getView("city_text", 0);
		// solo.clickOnView(v);
		// solo.sleep(2000);
		//
		// v = solo.getView("nowCity", 0);
		// solo.clickOnView(v);
		// solo.sleep(2000);
	}

}
