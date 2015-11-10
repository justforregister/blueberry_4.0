package com.lhxm.blueberry.test.testcases.award;


import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class RecommendLinkCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testRecommendLink() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("推荐奖励");
		solo.sleep(1000);
		
		// *点击link
		solo.clickOnView(solo.getView("award_link_text"));
		solo.assertCurrentActivity("未进入推广页面", BROWSER_ACTIVITY);
		solo.clickOnView(solo.getView("left_btn"));
		
		// *点击复制
		solo.clickOnText("点击复制");
		assertTrue("复制成功未出现！", solo.waitForText("复制成功"));
		
	}
}
