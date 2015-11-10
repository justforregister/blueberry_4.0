package com.lhxm.blueberry.test.testcases.location;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class EnterSpecificHotCityMall extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanEnterSpecificCityMall() {

		// Open choose city view
		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// ��������4�����ų���
		v = solo.getView("textview", 3);
		TextView tv = (TextView) v;
		String cityText = tv.getText().toString();
		solo.clickOnView(v);

		// �Ƚϵ�ǰActivity�Ƿ����̳���ҳActivity
		solo.assertCurrentActivity("δ�����̳���ҳ��", MAIN_ACTIVITY);

		// �ж���ҳ���ų������ֳ���
		assertTrue("���ų�������δ���֣�", solo.searchText(cityText));
		solo.sleep(2000);

		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		v = solo.getView("nowCity", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

	}

}
