package com.lhxm.blueberry.test.testcases.merchantsinfo;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class MerchantsInfo extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testMerchantsInfoDisplay() {

		v = solo.getView("browser", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.clickOnButton("��������");
		solo.sleep(2000);

		TextView name = (TextView) solo.getView("name", 0);
		String merchantsName = name.getText().toString();
		TextView add = (TextView) solo.getView("address", 0);
		String merchantsAddress = add.getText().toString();

		assertTrue("�̼һ�����Ϣδ��ʾ��", merchantsName != "" && merchantsAddress != "");
		assertTrue(
				"�̼Ҹ�����Ϣδ��ʾ��",
				solo.searchText("�鿴·��") && solo.searchText("Ӫҵʱ��")
						&& solo.searchText("֧��WIFI")
						&& solo.searchText("֧��POSˢ��"));
	}

}
