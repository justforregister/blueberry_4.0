package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class SwitchToLoginPage extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSwitchToLoginPage() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *ע�ᰴť
		solo.clickOnImageButton(1);
		solo.sleep(2000);
		
		solo.clickOnText("��¼");
		solo.sleep(5000);
		
		assertTrue("δ�ҵ�ע�ᰴť", solo.searchText("ע��"));
	}
}
