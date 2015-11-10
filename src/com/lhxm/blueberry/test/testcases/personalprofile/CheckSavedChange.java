package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class CheckSavedChange extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCheckSavedChange() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("��������");
		solo.sleep(2000);

		// *�޸ı��淵��
		solo.clearEditText(0);
		solo.enterText(0, "NAME2");

		solo.scrollToBottom();
		v = solo.getView("confirm_text");
		solo.clickOnView(v);

		solo.scrollToTop();
		solo.clickOnImageButton(0);
		solo.sleep(1000);

		solo.clickOnText("��������");

		assertTrue("�޸���Ϣδ�Ҵ�", solo.searchText("NAME2"));

	}
}
