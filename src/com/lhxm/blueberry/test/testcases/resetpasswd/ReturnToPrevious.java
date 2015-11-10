package com.lhxm.blueberry.test.testcases.resetpasswd;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ReturnToPrevious extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReturnToPrevious() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *��¼��ť
		solo.clickOnImageButton(0);

		// *����������룿��ť
		v = solo.getView("forget_pass_img");
		solo.clickOnView(v);
		solo.sleep(2000);

		v = solo.getView("back_btn");
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.assertCurrentActivity("δ�ص���¼���棡", LOGIN_ACTIVITY);

	}
}
