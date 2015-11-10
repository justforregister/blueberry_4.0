package com.lhxm.blueberry.test.testcases.search;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class EnterSpecificMerchandise extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanEnterSpecificMerchandise() {

		v = solo.getView("search_layout", 0);
		solo.clickOnView(v);
		solo.sleep(1000);

		solo.enterText(0, "火锅");
		v = solo.getView("right_text_btn", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		TextView tv1 = (TextView) solo.getView("merchandisename", 0);
		String outerName = tv1.getText().toString();

		solo.clickOnImage(4);
		solo.sleep(2000);

		TextView tv2 = (TextView) solo.getView("title", 0);
		String innerName = tv2.getText().toString();

		assertEquals("搜索页面商品名与详情页不一致！", outerName, innerName);

	}

}
