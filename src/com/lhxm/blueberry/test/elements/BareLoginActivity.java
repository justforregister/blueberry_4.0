package com.lhxm.blueberry.test.elements;

import com.lhxm.blueberry.test.BasicTestCase;

public class BareLoginActivity extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public static void doLogin() {
		solo.enterText(0, "13880478197");
		solo.enterText(1, "92381127");
		solo.clickOnImageButton(0);
		solo.sleep(2000);
	}

	@Override
	public void tearDown() throws Exception {
		getActivity().finish();
	}
}
