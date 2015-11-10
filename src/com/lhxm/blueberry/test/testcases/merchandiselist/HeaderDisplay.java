package com.lhxm.blueberry.test.testcases.merchandiselist;

import android.view.View;
import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class HeaderDisplay extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testHeadersDisplay() {
		solo.scrollToTop();
		View iconView = solo.getView("icon", 0);
		TextView textView = (TextView) solo.getView("text", 0);
		String firstMerchandise = textView.getText().toString();

		solo.clickOnView(iconView);
		solo.sleep(2000);

		TextView titleView = (TextView) solo.getView("title", 0);
		String titleMerchandise = titleView.getText().toString();

		assertTrue("商品分类页面与首页所选不一致！", firstMerchandise == titleMerchandise);
	}

}
