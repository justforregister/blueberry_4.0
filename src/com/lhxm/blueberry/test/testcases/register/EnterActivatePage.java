package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.Util;

public class EnterActivatePage extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterActivatePage() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *ע�ᰴť
		solo.clickOnImageButton(1);
		
		String phoneNumer = Util.getFixLenthString(11);

		solo.enterText(0, phoneNumer);
		solo.enterText(1, "123456");
		solo.clickOnCheckBox(0);
		solo.clickOnImageButton(0);

		solo.assertCurrentActivity("δ��ת�������˺�ҳ�棡", REGISTER_ACTIVITY);
		assertTrue("\"�����˺�\"δ��ʾ", solo.searchText("�����˺�"));

	}
}
