package com.lhxm.blueberry.test.testcases.mycollections;


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

		solo.clickOnText("我的收藏");

		assertTrue("断开网络消息未提示！", solo.waitForText("请检查你的网络连接"));

		
	}
}
