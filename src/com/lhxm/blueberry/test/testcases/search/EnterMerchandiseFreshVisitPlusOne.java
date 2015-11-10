package com.lhxm.blueberry.test.testcases.search;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;
import com.lhxm.blueberry.test.utils.Util;

public class EnterMerchandiseFreshVisitPlusOne extends
		BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testRefreshVisitPlusOne() {
		
		v = solo.getView("search_layout", 0);
		solo.clickOnView(v);
		solo.sleep(1000);

		solo.enterText(0, "���");
		v = solo.getView("right_text_btn", 0);
		solo.clickOnView(v);
		solo.sleep(2000);
		
		TextView tv1 = (TextView) solo.getView("merchandisename", 0);
		String merchandiseName = tv1.getText().toString();

		TextView tv2 = (TextView) solo.getView("browser", 0);
		String visit1 = tv2.getText().toString();

		String number1 = Util.splitNumbers(visit1);

		solo.clickOnImage(4);
		solo.sleep(2000);

		v = solo.getView("left_btn", 0);
		solo.clickOnView(v);
		solo.sleep(1000);
		
		//DRAG
		solo.drag(200, 200, 200, 600, 6);
		solo.sleep(2000);
		
//		�����Ҫ�ٴε��ͬһ����Ʒ
//		solo.clickOnText(merchandiseName);
//		solo.sleep(3000);
		
//		TODO ������ȡ�б�views�ļ���
//		RobotiumUtils.filterViewsByText(views, merchandiseName);
		

		// TextView tv2 = (TextView) solo.getView("title", 0);
		// String innerName = tv2.getText().toString();

		// assertEquals("����ҳ����Ʒ��������ҳ��һ�£�", outerName, innerName);

	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();

	}
}
