package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.*;

public class ChangeHeadImageWhenNetworkOff extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testChangeHeadImageWhenNetworkOff() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		v = solo.getView("user_head_img");
		solo.clickOnView(v);

		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);

		solo.clickOnText("从手机相册选择");

		assertTrue("网络断开toast未出现！", solo.waitForText("请在网络连接下使用上传头像功能"));

	}
}
