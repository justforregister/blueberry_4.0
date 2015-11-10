package com.lhxm.blueberry.test.testcases.merchandiselist;

import android.view.View;
import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;
import com.lhxm.blueberry.test.utils.*;

public class EmptyLocationWhenNetworkOff extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEmptyLocationWhenNetworkOff() throws Throwable {
		solo.scrollToTop();
		View iconView = solo.getView("icon", 0);
		solo.clickOnView(iconView);
		solo.sleep(4000);

		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(5000);

		solo.clickOnImage(2);
		solo.sleep(3000);
		solo.clickOnImage(2);

		// 4.1版本断网后定位只有toast消息，地址不会设空
		// TextView locationView = (TextView) solo.getView("location_text", 0);
		// String locationText = locationView.getText().toString();
		//
		// assertTrue("定位地址不为空！", locationText == "");


		assertTrue("检查网络连接toast未显示", solo.waitForText("请检查你的网络连接"));

		NetworkUtil.setWifiOn(getInstrumentation().getTargetContext());
		solo.sleep(2000);
	}

}
