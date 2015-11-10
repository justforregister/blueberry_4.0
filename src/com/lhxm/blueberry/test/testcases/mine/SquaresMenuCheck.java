package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class SquaresMenuCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSquaresMenuCheck() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		assertTrue(
				"�Ź�������Text��ʾ����ȷ",
				solo.searchText("��������") && solo.searchText("��������")
						&& solo.searchText("��������") && solo.searchText("�ҵĶ���")
						&& solo.searchText("�ҵ��ղ�") && solo.searchText("�Ƽ�����")
						&& solo.searchText("��ݮС��") && solo.searchText("ϵͳ����")
						&& solo.searchText("������"));

	}
}
