package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EditNickname extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterPersonalProfile() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("个人资料");
		solo.sleep(2000);

		String nickName = "NAME2";

		solo.clearEditText(0);
		solo.enterText(0, nickName);
		solo.scrollToBottom();
		solo.sleep(2000);

		v = solo.getView("confirm_text");
		solo.clickOnView(v);

		solo.clickOnImageButton(0);
		solo.sleep(2000);

		assertTrue("昵称未修改成功！", solo.searchText(nickName));

	}
}
