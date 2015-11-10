package com.lhxm.blueberry.test.testcases.merchandiselist;

import android.view.View;
import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;
import com.lhxm.blueberry.test.utils.NetworkUtil;

public class GetLocationWhenNetworkOn extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testGetLocationWhenNetworkOn() throws Throwable {

		solo.scrollToTop();
		View iconView = solo.getView("icon", 0);
		solo.clickOnView(iconView);
		solo.sleep(5000);

		// �ر����磬�����λ
		NetworkUtil.setWifiOff(getInstrumentation().getTargetContext());
		solo.sleep(2000);

		solo.clickOnImage(2);
		solo.sleep(2000);
		solo.clickOnImage(2);
		solo.sleep(2000);

		// �����磬�����λ
		NetworkUtil.setWifiOn(getInstrumentation().getTargetContext());
		solo.sleep(5000);

		solo.clickOnImage(2);
		solo.sleep(2000);
		solo.clickOnImage(2);
		solo.sleep(2000);

		TextView locationView = (TextView) solo.getView("location_text", 0);
		String locationText = locationView.getText().toString();

		assertTrue("��λ��ַΪ�գ�", locationText != "");

	}

}
