package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class NetworkOffCheck extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNetworkOff() throws Throwable{

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *ע�ᰴť
		solo.clickOnImageButton(1);
		
		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);
		
		solo.enterText(0, "18888888888");
		solo.enterText(1, "123456");
		solo.clickOnCheckBox(0);
		solo.clickOnImageButton(0);
		
		assertTrue("�Ͽ�������ʾδ��ʾ��", solo.searchText("�������������Ƿ�����"));

	

	}
}
