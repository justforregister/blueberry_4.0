package com.lhxm.blueberry.test.testcases.location;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class DisplaySearchResult extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testDisplaySearchResult() {

		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// 输入城市并查看搜索结果
		solo.enterText(0, "青岛");
		solo.sleep(2000);

		TextView tv = (TextView) solo.getView("name", 0);
		String cityName = tv.getText().toString();
		assertTrue("搜索结果未显示！", solo.searchText(cityName));
	}

}
