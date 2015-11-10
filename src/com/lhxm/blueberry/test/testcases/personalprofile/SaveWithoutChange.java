package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class SaveWithoutChange extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSaveWithoutChange() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("个人资料");

		solo.scrollToBottom();
		solo.sleep(2000);

		v = solo.getView("confirm_text");
		solo.clickOnView(v);

		assertTrue("个人信息修改成功未显示！", solo.waitForText("个人信息修改成功"));

	}
}
