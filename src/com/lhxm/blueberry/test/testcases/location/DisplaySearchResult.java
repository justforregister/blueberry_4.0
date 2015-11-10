package com.lhxm.blueberry.test.testcases.location;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class DisplaySearchResult extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testDisplaySearchResult() {

		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// ������в��鿴�������
		solo.enterText(0, "�ൺ");
		solo.sleep(2000);

		TextView tv = (TextView) solo.getView("name", 0);
		String cityName = tv.getText().toString();
		assertTrue("�������δ��ʾ��", solo.searchText(cityName));
	}

}
