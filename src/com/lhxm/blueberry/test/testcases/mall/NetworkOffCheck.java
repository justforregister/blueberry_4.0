package com.lhxm.blueberry.test.testcases.mall;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;
import com.lhxm.blueberry.test.utils.*;

public class NetworkOffCheck extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNetworkOffCheck() throws Throwable {
		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);
		// TODO cannot detect toast message for now
		// solo.drag(200, 200, 200, 600, 6);
		// solo.sleep(2000);
		// assertTrue(solo.waitForText("������������..."));
		solo.scrollToTop();
		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		tv = (TextView) solo.getView("nowCity", 0);
		String location = tv.getText().toString();
		String networkError = "��λʧ��";
		assertEquals("�������δ�ر�", networkError, location);
	}

}
