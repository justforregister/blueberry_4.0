package com.lhxm.blueberry.test;

import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

//import com.lhxm.blueberry.test.elements.ReturnToHomePageActivity;

public class BasicTestCaseWithLogout extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	public void doLogout() {
		// solo.waitForActivity(MainActivity.class, 3000);
		if (EnterMinePageActivity.isLoggedIn()) {
			solo.clickOnText("ϵͳ����");
			solo.sleep(1000);
			// v = solo.getView("right_img");
			// solo.clickOnView(v);
			// solo.sleep(1000);
			
			solo.scrollToBottom();
			solo.clickOnText("�˳���¼");
			solo.sleep(1000);
			solo.clickOnText("�˳���¼");
			solo.sleep(1000);

			// ArrayList<View> dialogViews = solo.getCurrentViews();
			// for (int i = 0; i < dialogViews.size(); i++) {
			// System.out.println(dialogViews.get(i));
			// }

			// // *go back
			solo.clickOnImageButton(0);
			// *ģ��������
			// solo.clickOnScreen(500, 950);
		} else {
			solo.sleep(2000);
		}
	}
}