package com.lhxm.blueberry.test.testcases.search;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;
import com.lhxm.blueberry.test.utils.Util;

public class EnterMerchandiseFreshVisitPlusOne extends
		BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testRefreshVisitPlusOne() {
		
		v = solo.getView("search_layout", 0);
		solo.clickOnView(v);
		solo.sleep(1000);

		solo.enterText(0, "火锅");
		v = solo.getView("right_text_btn", 0);
		solo.clickOnView(v);
		solo.sleep(2000);
		
		TextView tv1 = (TextView) solo.getView("merchandisename", 0);
		String merchandiseName = tv1.getText().toString();

		TextView tv2 = (TextView) solo.getView("browser", 0);
		String visit1 = tv2.getText().toString();

		String number1 = Util.splitNumbers(visit1);

		solo.clickOnImage(4);
		solo.sleep(2000);

		v = solo.getView("left_btn", 0);
		solo.clickOnView(v);
		solo.sleep(1000);
		
		//DRAG
		solo.drag(200, 200, 200, 600, 6);
		solo.sleep(2000);
		
//		如果需要再次点击同一个商品
//		solo.clickOnText(merchandiseName);
//		solo.sleep(3000);
		
//		TODO 好像不能取列表views的集合
//		RobotiumUtils.filterViewsByText(views, merchandiseName);
		

		// TextView tv2 = (TextView) solo.getView("title", 0);
		// String innerName = tv2.getText().toString();

		// assertEquals("搜索页面商品名与详情页不一致！", outerName, innerName);

	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();

	}
}
