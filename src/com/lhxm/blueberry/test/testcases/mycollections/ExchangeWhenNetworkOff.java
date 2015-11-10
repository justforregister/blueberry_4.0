package com.lhxm.blueberry.test.testcases.mycollections;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class ExchangeWhenNetworkOff extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testExchangeWhenNetwordOff() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("我的收藏");

		solo.sleep(2000);

		try {
			NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
			solo.sleep(5000);

			solo.clickOnText("立即兑换", 0);
			solo.sleep(1000);

			// *确认兑换
			solo.clickOnImageButton(0);

			assertTrue("尚未连接网络提示未显示！", solo.waitForText("尚未连接网络"));
		} catch (Throwable e) {
			// TODO: handle exception
			solo.clickOnImageButton(0);
		}

	}
}
