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

		solo.clickOnText("个人资料");
		solo.sleep(2000);

		v = solo.getView("birth_text");
		solo.clickOnView(v);
		solo.sleep(2000);

		/**
		 * 直接填写点完成后值不能改变 // *获取当前时间，得到上一年和下一年 Calendar c =
		 * Calendar.getInstance(); Date now = new Date(); c.setTime(now); int
		 * nextYear = c.get(Calendar.YEAR) + 1; int lastYear =
		 * c.get(Calendar.YEAR) - 1; String next_year =
		 * String.valueOf(nextYear); String last_year =
		 * String.valueOf(lastYear);
		 * 
		 * // *输入生日大于当前日期 solo.clearEditText(0); solo.enterText(0, next_year);
		 * solo.clearEditText(1); solo.enterText(1, "1"); solo.clearEditText(2);
		 * solo.enterText(2, "01"); solo.sleep(2000); solo.clickOnButton("完成");
		 * solo.sleep(5000);
		 * 
		 * // *输入生日年份为上一年 v = solo.getView("birth_text"); solo.clickOnView(v);
		 * 
		 * solo.clearEditText(0); solo.enterText(0, last_year);
		 * solo.sleep(2000); solo.clickOnButton("完成"); solo.sleep(2000);
		 */

		// *点击year+
		solo.clickOnImageButton(0);
		solo.clickOnButton("完成");

		solo.scrollToBottom();
		solo.sleep(2000);

		v = solo.getView("confirm_text");
		solo.clickOnView(v);

		assertTrue("生日不能超过当前时间提示未显示！", solo.waitForText("生日不能超过当前时间"));

		v = solo.getView("birth_text");
		solo.clickOnView(v);
		solo.sleep(2000);

		// *点击year-两次
		solo.clickOnImageButton(1);
		solo.clickOnImageButton(1);
		solo.clickOnButton("完成");

		solo.scrollToBottom();
		solo.sleep(2000);

		v = solo.getView("confirm_text");
		solo.clickOnView(v);

		assertTrue("个人信息修改成功未提示！", solo.waitForText("个人信息修改成功"));

	}
}
