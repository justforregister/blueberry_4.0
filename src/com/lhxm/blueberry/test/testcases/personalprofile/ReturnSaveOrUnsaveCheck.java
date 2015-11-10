package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ReturnSaveOrUnsaveCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReturnSaveOrUnsave() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("个人资料");
		solo.sleep(2000);

		// *未点击保存点返回
		solo.clearEditText(0);
		solo.enterText(0, "");
		solo.clickOnImageButton(0);

		// *验证提示框
		assertTrue("提示框未出现",
				solo.searchText("未点击保存") && solo.searchText("是否返回?"));

		// *返回
		solo.clickOnButton("是");
		solo.sleep(2000);
		solo.assertCurrentActivity("不在我的蓝莓页面", MAIN_ACTIVITY);
		solo.clickOnText("个人资料");
		
		// *不返回
		solo.clearEditText(0);
		solo.enterText(0, "");
		solo.clickOnImageButton(0);
		solo.clickOnButton("否");
		solo.sleep(2000);
		solo.assertCurrentActivity("不在个人资料页面", ACCOUNT_DETAIL_ACTIVITY);

	}
}
