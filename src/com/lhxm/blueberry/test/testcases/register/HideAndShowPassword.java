package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class HideAndShowPassword extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEmptyAccountAndPassword() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *ע�ᰴť
		solo.clickOnImageButton(1);

		solo.enterText(1, "password");

		// *����۾���ť��������
		v = solo.getView("show_pass");
		solo.clickOnView(v);
		solo.sleep(2000);
		solo.clickOnView(v);
		solo.sleep(2000);
		
		// *����������Ȼ�����ҵ�?
		// assertFalse("����δ����", solo.searchText("password"));

		// *����۾���ť��ʾ����
		solo.clickOnView(v);
		solo.sleep(2000);

		assertTrue("����������", solo.searchText("password"));

	}
}
