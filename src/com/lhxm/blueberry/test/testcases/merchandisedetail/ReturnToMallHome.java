package com.lhxm.blueberry.test.testcases.merchandisedetail;

import com.lhxm.blueberry.test.BasicTestCase;

public class ReturnToMallHome extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanReturnToMallHome() {
		v = solo.getView("browser", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// ���Home Button
		solo.clickOnButton(3);
		solo.sleep(2000);

		// �Ƚϵ�ǰActivity�Ƿ����̳���ҳActivity
		solo.assertCurrentActivity("δ�����̳���ҳ��", MAIN_ACTIVITY);
	}

}
