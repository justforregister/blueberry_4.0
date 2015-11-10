package com.lhxm.blueberry.test.testcases.mall;

import com.lhxm.blueberry.test.BasicTestCase;

public class ReturnAndClose extends BasicTestCase {
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testReturnToastAndCloseApp() {
		// *TODO* Util.wakeScreen(null);
		// solo.scrollToTop();
		// solo.clickOnText("美食");
		// solo.sleep(2000);
		// assertTrue(solo.searchText("美食"));
		// solo.goBack();
		// System.out.println("toast should show");
		// solo.sleep(3000);

		// 通过textview取toast不可行

		// TextView toastTextView = (TextView) solo.getView("message", 0);
		// String toastText = toastTextView.getText().toString();
		// System.out.println(toastText);
		// assertEquals("toast msg is incorrect", "再按一次退出蓝莓", toastText);
		// assertTrue(this.solo.searchText("再按一次退出蓝莓"));
		// assertEquals("再按一次退出蓝莓",
		// ((TextView)solo.getView("message")).getText());
		// solo.goBack();
		// assertTrue(isApplicationClosed());

		solo.goBack();
		assertTrue("toast未显示", solo.waitForText("再按一次退出蓝莓"));
		solo.sleep(2000);

		// solo.goBack();
		// assertTrue(isApplicationClosed());
	}

	// private boolean isApplicationClosed() {
	// return solo.getCurrentViews().size() == 0;
	// }

	 @Override
	 public void tearDown() throws Exception {
	 getActivity().finish();
	 }

}
