package com.lhxm.blueberry.test.testcases.award;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class LoginReferralCodeCheck extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReferralCodeCheck() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		// *我的蓝莓推荐码
		TextView tv1 = (TextView) solo.getView("award_text");
		String s1 = tv1.getText().toString();
		int code1 = Integer.parseInt(s1);

		// *推荐页面推荐码
		solo.clickOnText("推荐奖励");
		TextView tv2 = (TextView) solo.getView("award_text");
		String s2 = tv2.getText().toString();
		int code2 = Integer.parseInt(s2);

		assertTrue("推荐码不相同！", code1 == code2);

	}
}
