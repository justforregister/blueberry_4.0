package com.lhxm.blueberry.test.elements;

import com.lhxm.blueberry.test.BasicTestCase;

public class EnterMinePageActivity extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public static void enterMinePage() {
		v = solo.getView("layout_tab_indicator", 4);
		solo.clickOnView(v);
		solo.sleep(2000);
	}

	public static boolean isLoggedIn() {
		try {
			v = solo.getView("icon", 8);
			solo.clickOnView(v);
			solo.sleep(1000);
			solo.getImageButton(1);
			return false;
		} catch (Throwable e) {
			return true;
		}
	}

	@Override
	public void tearDown() throws Exception {
		getActivity().finish();
	}
}
