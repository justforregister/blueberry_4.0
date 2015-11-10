package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EnterSquaresMenu extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterSquaresMenu() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		// 1.个人资料
		solo.clickOnText("个人资料");
		solo.assertCurrentActivity("未进入个人资料", ACCOUNT_DETAIL_ACTIVITY);
		assertTrue("个人资料字段未显示", solo.searchText("资料设置"));
		solo.clickOnImageButton(0);

		// 2.积分详情
		solo.clickOnText("积分详情");
		solo.assertCurrentActivity("未进入积分详情", SCORE_DETAIL_ACTIVITY);
		assertTrue("积分详情字段未显示", solo.searchText("积分详情"));
		solo.clickOnImageButton(0);

		// 3.立即分享
		solo.clickOnText("立即分享");
		assertTrue("未显示微信选项", solo.searchText("微信"));
		solo.goBack();

		// 4.我的订单
		solo.clickOnText("我的订单");
		solo.assertCurrentActivity("未进入我的订单", CONSUME_ACTIVITY);
		assertTrue("我的订单字段未显示", solo.searchText("我的订单"));
		solo.clickOnImageButton(0);

		// 5.我的收藏
		solo.clickOnText("我的收藏");
		solo.assertCurrentActivity("未进入我的收藏", COLLECT_ACTIVITY);
		assertTrue("我的收藏字段未显示", solo.searchText("我的收藏"));
		solo.clickOnImageButton(0);

		// 6.推荐奖励
		solo.clickOnText("推荐奖励");
		solo.assertCurrentActivity("未进入推荐奖励", AWARD_ACTIVITY);
		assertTrue("推荐奖励字段未显示", solo.searchText("推荐奖励"));
		solo.clickOnImageButton(0);

		// 7.蓝莓小秘
		solo.clickOnText("蓝莓小秘");
		solo.assertCurrentActivity("未进入蓝莓小秘", COMPLAINTS_ACTIVITY);
		assertTrue("投诉/建议/反馈字段未显示", solo.searchText("投诉/建议/反馈"));
		solo.clickOnImageButton(0);

		// 8.系统设置
		solo.clickOnText("系统设置");
		solo.assertCurrentActivity("未进入系统设置", SYSTEM_SETTING_ACTIVITY);
		assertTrue("系统设置字段未显示", solo.searchText("系统设置"));
		solo.clickOnImageButton(0);

		// 9.检测更新
		try {
			solo.clickOnText("检测更新");
			solo.clickOnText("取消");
		} catch (Throwable e) {
			// TODO: handle exception
			assertTrue("已是最新toast未显示", solo.waitForText("版本已是最新"));
		}
	}
}
