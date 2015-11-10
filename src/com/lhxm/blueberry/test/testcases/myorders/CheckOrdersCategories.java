package com.lhxm.blueberry.test.testcases.myorders;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class CheckOrdersCategories extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testOrdersCategories() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("�ҵĶ���");

		// *Ĭ����ʾ�����ж�����
		assertTrue("���ж���δ��ʾ��", solo.searchText("���ж���"));
		solo.sleep(1000);

		// *������ж��������������򣬽��������
		v = solo.getView("order_category_layout");
		solo.clickOnView(v);
		solo.clickOnText("δʹ��");
		solo.sleep(1000);
		solo.clickOnView(v);
		solo.clickOnText("��ʹ��");
		solo.sleep(1000);
		solo.clickOnView(v);
		solo.clickOnText("������");
		solo.sleep(1000);
		solo.clickOnView(v);
		solo.clickOnText("������");
		solo.sleep(1000);
		solo.clickOnView(v);
		solo.clickOnText("�ѹ���");
		solo.sleep(1000);

	}
}
