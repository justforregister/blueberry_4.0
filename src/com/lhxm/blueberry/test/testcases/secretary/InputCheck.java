package com.lhxm.blueberry.test.testcases.secretary;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class InputCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testInputs() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("蓝莓小秘");
		solo.sleep(1000);

		// *点击选项
		solo.clickOnView(solo.getView("select_check"));
		solo.clickOnView(solo.getView("suggestion"));
		solo.clickOnView(solo.getView("select_check"));
		solo.clickOnView(solo.getView("complaints"));
		solo.clickOnView(solo.getView("select_check"));
		solo.clickOnView(solo.getView("others"));
		solo.clickOnView(solo.getView("select_check"));

		// *不输入内容或空格
		solo.enterText(0, "");
		solo.clickOnButton("发 送");
		assertTrue("请输入内容未显示！", solo.waitForText("您输入的内容太少"));
		solo.clearEditText(0);
		solo.enterText(0, "        ");
		solo.clickOnButton("发 送");
		assertTrue("请输入内容未显示！", solo.waitForText("请输入反馈内容"));

	}
}
