package com.lhxm.blueberry.test.testcases.personalprofile;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class NetworkOffCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNetworkOff() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);

		solo.clickOnText("个人资料");
		solo.sleep(2000);
		
		solo.scrollToBottom();
		v = solo.getView("confirm_text");
		solo.clickOnView(v);

		assertTrue("断开网络提示未显示！", solo.waitForText("网络未连接"));

	}
}
