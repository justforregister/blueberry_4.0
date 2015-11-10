package com.lhxm.blueberry.test.testcases.mine;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class DailySign extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testDailySign() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		v = solo.getView("bluberry_coin");
		TextView tv1 = (TextView) v;
		String coinText1 = tv1.getText().toString();
		int coinNumber1 = Integer.parseInt(coinText1);

		/**
		 * 测试方法1： TODO 每日签到button和今日已签button都为ImageView
		 * button且id相同，没法判断Text,签到后弹出提示”我知道了“的 button也是一样的,故不好写测试
		 * 
		 * if (solo.getView("sign_btn")!=null){ v = solo.getView("sign_btn");
		 * solo.clickOnView(v); solo.sleep(2000);
		 * 
		 * assertEquals("蓝莓币未+5", coinNumber+=5);
		 * 
		 * // *点击”我知道了“ solo.clickOnView(v); } else{ solo.clickOnView(v); }
		 */

		// *测试方法2（通过判断出现toast与否）：
		v = solo.getView("sign_btn");
		solo.clickOnView(v);
		if (solo.waitForText("今天已签到")) {
			assertEquals("签到后蓝莓币有变化！", coinNumber1, coinNumber1);
		} else {
			// *点击"我知道了",点击不到弹出框的view,这里点击手机go back取消弹出框
			solo.sleep(2000);
			solo.goBack();
			solo.sleep(2000);
			v = solo.getView("bluberry_coin");
			TextView tv2 = (TextView) v;
			String coinText2 = tv2.getText().toString();
			int coinNumber2 = Integer.parseInt(coinText2);
			assertEquals("蓝莓币未+5", coinNumber1 + 5, coinNumber2);

		}

	}

	@Override
	public void tearDown() throws Exception {
		getActivity().finish();
	}
}
