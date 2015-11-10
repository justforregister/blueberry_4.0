package com.lhxm.blueberry.test.testcases.mycollections;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class CancelDeleteRecord extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCancelDeteleRecord() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("�ҵ��ղ�");

		try {
			v = solo.getView("pro_img", 0);
			// *��һ��������Ʒ����
			tv = (TextView) solo.getView("pro_name_txt", 0);
			String firstOrderName = tv.getText().toString();
			solo.clickLongOnView(v);
			solo.sleep(1000);
			solo.clickOnButton("ȡ��");
			assertTrue("��Ʒ��ɾ����", solo.searchText(firstOrderName));
		} catch (Throwable e) {
			// TODO: handle exception
			solo.clickOnImageButton(0);
		}

	}
}
