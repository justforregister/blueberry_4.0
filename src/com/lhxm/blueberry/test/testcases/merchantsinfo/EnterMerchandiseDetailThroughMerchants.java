package com.lhxm.blueberry.test.testcases.merchantsinfo;

import com.lhxm.blueberry.test.BasicTestCase;

public class EnterMerchandiseDetailThroughMerchants extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterMerchandiseDetailThroughMerchants() {

		v = solo.getView("browser", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.clickOnButton("��������");
		solo.sleep(2000);

		solo.scrollToBottom();

		v = solo.getView("header_imageview", 0);
		solo.clickOnView(v);

		assertTrue("δ������Ʒ����ҳ��", solo.searchText("��������"));

	}

}
