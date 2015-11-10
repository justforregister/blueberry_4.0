package com.lhxm.blueberry.test.testcases.mall;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;
import com.lhxm.blueberry.test.utils.*;

import static org.junit.Assert.*;

public class NetworkOnCheck extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNetworkOnCheck() throws Throwable {
		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);

		NetworkUtil.setWifiOn(getInstrumentation().getTargetContext());
		solo.sleep(5000);

		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		tv = (TextView) solo.getView("nowCity", 0);
		String location = tv.getText().toString();
		String networkError = "¶¨Î»Ê§°Ü";
		assertNotEquals("Network may not connected!", networkError, location);
	}
}
