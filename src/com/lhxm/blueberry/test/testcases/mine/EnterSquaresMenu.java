package com.lhxm.blueberry.test.testcases.mine;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EnterSquaresMenu extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterSquaresMenu() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		// 1.��������
		solo.clickOnText("��������");
		solo.assertCurrentActivity("δ�����������", ACCOUNT_DETAIL_ACTIVITY);
		assertTrue("���������ֶ�δ��ʾ", solo.searchText("��������"));
		solo.clickOnImageButton(0);

		// 2.��������
		solo.clickOnText("��������");
		solo.assertCurrentActivity("δ�����������", SCORE_DETAIL_ACTIVITY);
		assertTrue("���������ֶ�δ��ʾ", solo.searchText("��������"));
		solo.clickOnImageButton(0);

		// 3.��������
		solo.clickOnText("��������");
		assertTrue("δ��ʾ΢��ѡ��", solo.searchText("΢��"));
		solo.goBack();

		// 4.�ҵĶ���
		solo.clickOnText("�ҵĶ���");
		solo.assertCurrentActivity("δ�����ҵĶ���", CONSUME_ACTIVITY);
		assertTrue("�ҵĶ����ֶ�δ��ʾ", solo.searchText("�ҵĶ���"));
		solo.clickOnImageButton(0);

		// 5.�ҵ��ղ�
		solo.clickOnText("�ҵ��ղ�");
		solo.assertCurrentActivity("δ�����ҵ��ղ�", COLLECT_ACTIVITY);
		assertTrue("�ҵ��ղ��ֶ�δ��ʾ", solo.searchText("�ҵ��ղ�"));
		solo.clickOnImageButton(0);

		// 6.�Ƽ�����
		solo.clickOnText("�Ƽ�����");
		solo.assertCurrentActivity("δ�����Ƽ�����", AWARD_ACTIVITY);
		assertTrue("�Ƽ������ֶ�δ��ʾ", solo.searchText("�Ƽ�����"));
		solo.clickOnImageButton(0);

		// 7.��ݮС��
		solo.clickOnText("��ݮС��");
		solo.assertCurrentActivity("δ������ݮС��", COMPLAINTS_ACTIVITY);
		assertTrue("Ͷ��/����/�����ֶ�δ��ʾ", solo.searchText("Ͷ��/����/����"));
		solo.clickOnImageButton(0);

		// 8.ϵͳ����
		solo.clickOnText("ϵͳ����");
		solo.assertCurrentActivity("δ����ϵͳ����", SYSTEM_SETTING_ACTIVITY);
		assertTrue("ϵͳ�����ֶ�δ��ʾ", solo.searchText("ϵͳ����"));
		solo.clickOnImageButton(0);

		// 9.������
		try {
			solo.clickOnText("������");
			solo.clickOnText("ȡ��");
		} catch (Throwable e) {
			// TODO: handle exception
			assertTrue("��������toastδ��ʾ", solo.waitForText("�汾��������"));
		}
	}
}
