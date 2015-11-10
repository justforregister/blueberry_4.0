package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ChangeHeadImageCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanDisplayChangeHeadImageMenu() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		v = solo.getView("user_head_img");
		solo.clickOnView(v);

		assertTrue(
				"����ͷ����ʾ��δ������ʾ��",
				solo.searchText("����ͷ��") && solo.searchText("���ֻ����ѡ��")
						&& solo.searchText("����") && solo.searchText("ȡ��"));

	}
}
