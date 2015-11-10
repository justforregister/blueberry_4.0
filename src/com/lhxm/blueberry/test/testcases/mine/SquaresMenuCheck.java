package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class SquaresMenuCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSquaresMenuCheck() throws Throwable {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		assertTrue(
				"九宫格区域Text显示不正确",
				solo.searchText("个人资料") && solo.searchText("积分详情")
						&& solo.searchText("立即分享") && solo.searchText("我的订单")
						&& solo.searchText("我的收藏") && solo.searchText("推荐奖励")
						&& solo.searchText("蓝莓小秘") && solo.searchText("系统设置")
						&& solo.searchText("检测更新"));

	}
}
