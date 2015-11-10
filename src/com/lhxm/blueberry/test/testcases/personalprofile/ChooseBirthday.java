package com.lhxm.blueberry.test.testcases.personalprofile;

import java.util.Calendar;
import java.util.Date;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class ChooseBirthday extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEnterPersonalProfile() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("��������");
		solo.sleep(2000);

		v = solo.getView("birth_text");
		solo.clickOnView(v);
		solo.sleep(2000);

		/**
		 * ֱ����д����ɺ�ֵ���ܸı� // *��ȡ��ǰʱ�䣬�õ���һ�����һ�� Calendar c =
		 * Calendar.getInstance(); Date now = new Date(); c.setTime(now); int
		 * nextYear = c.get(Calendar.YEAR) + 1; int lastYear =
		 * c.get(Calendar.YEAR) - 1; String next_year =
		 * String.valueOf(nextYear); String last_year =
		 * String.valueOf(lastYear);
		 * 
		 * // *�������մ��ڵ�ǰ���� solo.clearEditText(0); solo.enterText(0, next_year);
		 * solo.clearEditText(1); solo.enterText(1, "1"); solo.clearEditText(2);
		 * solo.enterText(2, "01"); solo.sleep(2000); solo.clickOnButton("���");
		 * solo.sleep(5000);
		 * 
		 * // *�����������Ϊ��һ�� v = solo.getView("birth_text"); solo.clickOnView(v);
		 * 
		 * solo.clearEditText(0); solo.enterText(0, last_year);
		 * solo.sleep(2000); solo.clickOnButton("���"); solo.sleep(2000);
		 */

		// *���year+
		solo.clickOnImageButton(0);
		solo.clickOnButton("���");

		solo.scrollToBottom();
		solo.sleep(2000);

		v = solo.getView("confirm_text");
		solo.clickOnView(v);

		assertTrue("���ղ��ܳ�����ǰʱ����ʾδ��ʾ��", solo.waitForText("���ղ��ܳ�����ǰʱ��"));

		v = solo.getView("birth_text");
		solo.clickOnView(v);
		solo.sleep(2000);

		// *���year-����
		solo.clickOnImageButton(1);
		solo.clickOnImageButton(1);
		solo.clickOnButton("���");

		solo.scrollToBottom();
		solo.sleep(2000);

		v = solo.getView("confirm_text");
		solo.clickOnView(v);

		assertTrue("������Ϣ�޸ĳɹ�δ��ʾ��", solo.waitForText("������Ϣ�޸ĳɹ�"));

	}
}
