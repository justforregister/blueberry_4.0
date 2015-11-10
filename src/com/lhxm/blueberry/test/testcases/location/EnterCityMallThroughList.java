package com.lhxm.blueberry.test.testcases.location;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class EnterCityMallThroughList extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanFindSpecificCityInList() {

		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.scrollListToLine(0, 30);
		solo.sleep(2000);

		// ���list����һ�����е��̳���ҳ
		v = solo.getView("name", 1);
		TextView tv = (TextView) v;
		String cityText = tv.getText().toString();
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.assertCurrentActivity("δ�����̳���ҳ��", MAIN_ACTIVITY);
		assertTrue("δ�����Ӧλ�ó��У�", solo.searchText(cityText));
		
		solo.sleep(2000);
		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		v = solo.getView("nowCity", 0);
		solo.clickOnView(v);
		solo.sleep(2000);
	}

}
