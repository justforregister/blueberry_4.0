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

		// 4.1�汾������λֻ��toast��Ϣ����ַ�������
		// TextView locationView = (TextView) solo.getView("location_text", 0);
		// String locationText = locationView.getText().toString();
		//
		// assertTrue("��λ��ַ��Ϊ�գ�", locationText == "");


		assertTrue("�����������toastδ��ʾ", solo.waitForText("���������������"));

		NetworkUtil.setWifiOn(getInstrumentation().getTargetContext());
		solo.sleep(2000);
	}

}
