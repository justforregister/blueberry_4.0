package com.lhxm.blueberry.test.testcases.mycollections;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class CancelDeleteRecord extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCancelDeteleRecord() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("我的收藏");

		try {
			v = solo.getView("pro_img", 0);
			// *第一个订单商品名字
			tv = (TextView) solo.getView("pro_name_txt", 0);
			String firstOrderName = tv.getText().toString();
			solo.clickLongOnView(v);
			solo.sleep(1000);
			solo.clickOnButton("取消");
			assertTrue("商品被删除！", solo.searchText(firstOrderName));
		} catch (Throwable e) {
			// TODO: handle exception
			solo.clickOnImageButton(0);
		}

	}
}
