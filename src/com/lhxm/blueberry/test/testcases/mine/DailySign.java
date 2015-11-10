package com.lhxm.blueberry.test.testcases.mine;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class DailySign extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testDailySign() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		v = solo.getView("bluberry_coin");
		TextView tv1 = (TextView) v;
		String coinText1 = tv1.getText().toString();
		int coinNumber1 = Integer.parseInt(coinText1);

		/**
		 * ���Է���1�� TODO ÿ��ǩ��button�ͽ�����ǩbutton��ΪImageView
		 * button��id��ͬ��û���ж�Text,ǩ���󵯳���ʾ����֪���ˡ��� buttonҲ��һ����,�ʲ���д����
		 * 
		 * if (solo.getView("sign_btn")!=null){ v = solo.getView("sign_btn");
		 * solo.clickOnView(v); solo.sleep(2000);
		 * 
		 * assertEquals("��ݮ��δ+5", coinNumber+=5);
		 * 
		 * // *�������֪���ˡ� solo.clickOnView(v); } else{ solo.clickOnView(v); }
		 */

		// *���Է���2��ͨ���жϳ���toast��񣩣�
		v = solo.getView("sign_btn");
		solo.clickOnView(v);
		if (solo.waitForText("������ǩ��")) {
			assertEquals("ǩ������ݮ���б仯��", coinNumber1, coinNumber1);
		} else {
			// *���"��֪����",��������������view,�������ֻ�go backȡ��������
			solo.sleep(2000);
			solo.goBack();
			solo.sleep(2000);
			v = solo.getView("bluberry_coin");
			TextView tv2 = (TextView) v;
			String coinText2 = tv2.getText().toString();
			int coinNumber2 = Integer.parseInt(coinText2);
			assertEquals("��ݮ��δ+5", coinNumber1 + 5, coinNumber2);

		}

	}

	@Override
	public void tearDown() throws Exception {
		getActivity().finish();
	}
}
