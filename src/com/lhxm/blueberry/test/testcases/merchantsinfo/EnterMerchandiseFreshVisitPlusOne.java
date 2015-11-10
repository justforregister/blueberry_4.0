package com.lhxm.blueberry.test.testcases.merchantsinfo;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;
import com.lhxm.blueberry.test.utils.Util;

public class EnterMerchandiseFreshVisitPlusOne extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testRefreshVisitPlusOne() {

		v = solo.getView("browser", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.clickOnButton("进入商铺");
		solo.sleep(2000);

		solo.scrollToBottom();

		TextView tv1 = (TextView) v;
		String visit1 = tv1.getText().toString();
		String number1 = Util.splitNumbers(visit1);

		v = solo.getView("header_imageview", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		System.out.println(number1);

		v = solo.getView("left_btn", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.scrollToTop();

		// DRAG
		solo.drag(200, 200, 200, 600, 6);
		solo.sleep(2000);

		solo.scrollToBottom();
		solo.sleep(2000);

		TextView tv2 = (TextView) solo.getView("browser", 0);
		String visit2 = tv2.getText().toString();
		String number2 = Util.splitNumbers(visit2);

		int value1 = Integer.parseInt(number1);
		int value2 = Integer.parseInt(number2);

		System.out.println(number1);
		System.out.println(number2);

		assertTrue("浏览数未增加！", value2 > value1);

	}

}
