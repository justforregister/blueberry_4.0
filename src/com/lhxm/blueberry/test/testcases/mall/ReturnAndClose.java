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
		// solo.clickOnText("��ʳ");
		// solo.sleep(2000);
		// assertTrue(solo.searchText("��ʳ"));
		// solo.goBack();
		// System.out.println("toast should show");
		// solo.sleep(3000);

		// ͨ��textviewȡtoast������

		// TextView toastTextView = (TextView) solo.getView("message", 0);
		// String toastText = toastTextView.getText().toString();
		// System.out.println(toastText);
		// assertEquals("toast msg is incorrect", "�ٰ�һ���˳���ݮ", toastText);
		// assertTrue(this.solo.searchText("�ٰ�һ���˳���ݮ"));
		// assertEquals("�ٰ�һ���˳���ݮ",
		// ((TextView)solo.getView("message")).getText());
		// solo.goBack();
		// assertTrue(isApplicationClosed());

		solo.goBack();
		assertTrue("toastδ��ʾ", solo.waitForText("�ٰ�һ���˳���ݮ"));
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
