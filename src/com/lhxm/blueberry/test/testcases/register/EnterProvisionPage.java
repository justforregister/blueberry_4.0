package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EnterProvisionPage extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEmptyAccountAndPassword() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *ע�ᰴť
		solo.clickOnImageButton(1);

		// *����������Ķ���ͬ����ط����������˽���ߡ�����
		v = solo.getView("provision_text");
		solo.clickOnView(v);
		solo.sleep(2000);
		
		// *�ж��Ƿ��BROWSER_ACTIVITY
		solo.assertCurrentActivity("δ�����������ҳ��", BROWSER_ACTIVITY);
		assertTrue("��������δ��ʾ��", solo.searchText("��������"));

	}
}
