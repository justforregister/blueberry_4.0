package com.lhxm.blueberry.test.testcases.merchandiselist;

import android.view.View;

import com.lhxm.blueberry.test.BasicTestCase;

public class ReturnToMallHome extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanReturnToMallHome() {
		solo.scrollToTop();
		View iconView = solo.getView("icon", 0);

		solo.clickOnView(iconView);
		solo.sleep(2000);

		View view = solo.getView("left_btn", 0);
		solo.clickOnView(view);
		solo.sleep(1000);

		// �Ƚϵ�ǰActivity�Ƿ����̳���ҳActivity
		solo.assertCurrentActivity("δ�����̳���ҳ��", MAIN_ACTIVITY);

	}

}
