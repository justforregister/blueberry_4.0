package com.lhxm.blueberry.test.testcases.merchantsinfo;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

public class EnterShop extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanEnterShop() {

		v = solo.getView("browser", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		solo.clickOnButton("��������");
		solo.sleep(2000);

		TextView tv = (TextView) solo.getView("title", 0);
		String title = tv.getText().toString();

		assertTrue("δ�����̼���Ϣҳ�棡", title == "�̼���Ϣ");
	}

}
