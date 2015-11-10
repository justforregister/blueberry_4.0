package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class test_select_location_drop_down_list extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSelectLocationDropDownList() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("��������");
		solo.sleep(2000);

		// *ѡ��ʡ
		solo.clickOnView(solo.getView("privance_tv"));
		solo.sleep(1000);
		solo.scrollListToLine(0, 20);
		solo.sleep(1000);
		solo.clickOnView(solo.getView("item_tv", 2));
		solo.sleep(1000);

		// *ѡ����
		solo.clickOnView(solo.getView("city_tv"));
		solo.sleep(1000);
		solo.scrollListToLine(0, 9);
		solo.sleep(1000);
		solo.clickOnView(solo.getView("item_tv", 2));
		solo.sleep(1000);

		// *ѡ����
		solo.clickOnView(solo.getView("area_tv"));
		solo.sleep(1000);
		solo.scrollListToLine(0, 2);
		solo.sleep(1000);
		solo.clickOnView(solo.getView("item_tv", 2));
		solo.sleep(1000);
	}
}
