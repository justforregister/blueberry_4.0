package com.lhxm.blueberry.test.testcases.location;

import com.lhxm.blueberry.test.BasicTestCase;

public class HotCities extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testHotCity() {

		// Open choose city view
		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		assertTrue("���ų���δ���֣�", solo.searchText("���ų���"));

		// �жϳ���3�γɶ�
		assertTrue("�ɶ�δ����3�Σ�", solo.searchText("�ɶ�", 3, true));

	}

}
