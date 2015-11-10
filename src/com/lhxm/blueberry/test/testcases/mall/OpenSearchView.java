package com.lhxm.blueberry.test.testcases.mall;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class OpenSearchView extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanOpenSearchView() {
		// Util.wakeScreen(null);
		v = solo.getView("search_layout", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		v = solo.getView("name", 0);
		tv = (TextView) v;
		String hotSearch = tv.getText().toString();

		assertEquals("search view may not open!", "»»√≈À—À˜", hotSearch);
	}

}
