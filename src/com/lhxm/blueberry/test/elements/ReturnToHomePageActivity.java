package com.lhxm.blueberry.test.elements;

import com.lhxm.blueberry.test.BasicTestCase;

public class ReturnToHomePageActivity extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public static void returnToMallHome() {
		v = solo.getView("layout_tab_indicator", 2);
		solo.clickOnView(v);
		solo.sleep(2000);
	}

	@Override
	public void tearDown() throws Exception {
		getActivity().finish();
	}
}
