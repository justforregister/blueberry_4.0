package com.lhxm.blueberry.test.testcases.share;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class ShareCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testShareAndUpdate() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("立即分享");
		solo.sleep(1000);

		assertTrue(
				"可分享平台文字未显示！",
				solo.searchText("微博") && solo.searchText("微信")
						&& solo.searchText("QQ"));
		solo.goBack();

		// *断开网络检查
		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);
		solo.clickOnText("立即分享");
		// *点击第一个分享图标
		v = solo.getView("umeng_socialize_shareboard_image", 0);
		solo.clickOnView(v);
		solo.sleep(1000);
		assertTrue("网络不可用未提示", solo.waitForText("您的网络不可用,请检查网络连接..."));

	}

	@Override
	public void tearDown() throws Exception {
		getActivity().finish();
	}
}
