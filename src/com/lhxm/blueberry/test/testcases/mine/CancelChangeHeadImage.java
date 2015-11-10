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

		solo.clickOnText("ȡ��");

		assertFalse(
				"������δ��ʧ",
				solo.searchText("����ͷ��") && solo.searchText("���ֻ����ѡ��")
						&& solo.searchText("����") && solo.searchText("ȡ��"));

	}
}
