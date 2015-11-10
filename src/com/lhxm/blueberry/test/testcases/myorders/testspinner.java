package com.lhxm.blueberry.test.testcases.myorders;

import java.util.ArrayList;

import android.view.View;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class testspinner extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testClickToEnterDetail() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("ÎÒµÄ¶©µ¥");

		solo.sleep(1000);

		// solo.pressSpinnerItem(0, 2);
		//
		// solo.sleep(6000);

		v = solo.getView("order_category_layout");
		solo.clickOnView(v);

		solo.sleep(2000);
		ArrayList<View> v1 = solo.getCurrentViews();
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.get(i));

		}
	}
}
