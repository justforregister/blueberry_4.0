package com.lhxm.blueberry.test.testcases.location;

import com.lhxm.blueberry.test.BasicTestCase;

public class DeleteTextInSearchBox extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testDeleteSearchText() {

		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// É¾³ıÎÄ×Ö
		solo.enterText(0, "²âÊÔËÑË÷¿òabc");
		solo.sleep(2000);
		solo.clickOnButton(0);
		solo.sleep(2000);
		assertFalse("ËÑË÷¿òÎ´Çå¿Õ£¡", solo.searchText("²âÊÔËÑË÷¿òabc"));
	}

}
