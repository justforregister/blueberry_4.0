package com.lhxm.blueberry.test.testcases.mall;

import com.lhxm.blueberry.test.BasicTestCase;

public class TestLogin extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	// public void testLogin() {
	// solo.scrollToTop();
	// System.out.println("start");
	// ArrayList<View> v1 = solo.getCurrentViews();
	// for (int i = 0; i < v1.size(); i++) {
	// System.out.println(v1.get(i));
	// }

	public void testIsLoggedIn() {
		try {
			v = solo.getView("icon", 8);
			solo.clickOnView(v);
			solo.sleep(2000);
			solo.getImageButton(1);
			System.out.println("Î´µÇÂ¼");
		} catch (Throwable e) {
			System.out.println("ÒÑµÇÂ¼");
		}

		// finally {
		// System.out.println("²âÊÔ");
		// }

		// *²âÊÔlogin page activity name
		// v = solo.getView("icon", 8);
		// solo.clickOnView(v);
		// solo.sleep(2000);
		// solo.clickOnImageButton(0);
		// solo.assertCurrentActivity("test", MAIN_ACTIVITY);
	}

	@Override
	public void tearDown() throws Exception {
		getActivity().finish();
	}
}
