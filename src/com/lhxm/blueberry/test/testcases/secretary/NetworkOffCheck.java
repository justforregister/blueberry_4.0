package com.lhxm.blueberry.test.testcases.secretary;

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

		solo.clickOnText("蓝莓小秘");

		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);

		solo.enterText(0, "测试断开网络发送消息");
		solo.clickOnButton("发 送");

		// *TODO 等待开发添加
//		assertTrue("断开网络消息未提示！", solo.waitForText("请检查你的网络连接"));

	}
}
