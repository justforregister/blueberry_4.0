package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EmptyAccountAndPassword extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEmptyAccountAndPassword() {

		EnterMinePageActivity.enterMinePage();
		doLogout();
		
		solo.sleep(5000);
		
		// *ע�ᰴť
		solo.clickOnImageButton(1);

		solo.enterText(0, "13333333333");
		solo.enterText(1, "12345678");

		// *�����X����ť
		v = solo.getView("del_account");
		solo.clickOnView(v);

		assertTrue(
				"�˺�����δ�����",
				solo.searchText("����������ֻ���\\(11\\)")
						&& solo.searchText("����������\\(6\\-20\\)"));

	}
}
