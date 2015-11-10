package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class CancelChangeHeadImage extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCancelChangeHeadImageMenu() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		v = solo.getView("user_head_img");
		solo.clickOnView(v);

		solo.clickOnText("取消");

		assertFalse(
				"弹出框未消失",
				solo.searchText("更换头像") && solo.searchText("从手机相册选择")
						&& solo.searchText("拍照") && solo.searchText("取消"));

	}
}
