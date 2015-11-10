package com.lhxm.blueberry.test.testcases.resetpasswd;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EnterFindPasswdPage extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterPasswdResetPage() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *��¼��ť
		solo.clickOnImageButton(0);

		// *����������룿��ť
		v = solo.getView("forget_pass_img");
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.assertCurrentActivity("δ�����һ��������", FINDPASS_ACTIVITY);
	}
}
