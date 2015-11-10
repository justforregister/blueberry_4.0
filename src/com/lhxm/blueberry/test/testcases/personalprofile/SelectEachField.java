package com.lhxm.blueberry.test.testcases.personalprofile;

import android.view.View;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class SelectEachField extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSelectEachField() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		solo.clickOnText("个人资料");
		solo.sleep(2000);

		// *性别选择
		View gender = solo.getView("sex_layout");
		solo.clickOnView(gender);
		View male = solo.getView("text1", 0);
		solo.clickOnView(male);
		solo.clickOnView(gender);
		View female = solo.getView("text1", 1);
		solo.clickOnView(female);
		solo.sleep(2000);

		// *选择学历
		View edu = solo.getView("edu_layout");
		solo.clickOnView(edu);
		View edu1 = solo.getView("text1", 0);
		solo.clickOnView(edu1);
		solo.clickOnView(edu);
		View edu2 = solo.getView("text1", 1);
		solo.clickOnView(edu2);
		solo.clickOnView(edu);
		View edu3 = solo.getView("text1", 2);
		solo.clickOnView(edu3);
		solo.clickOnView(edu);
		View edu4 = solo.getView("text1", 3);
		solo.clickOnView(edu4);
		solo.clickOnView(edu);
		View edu5 = solo.getView("text1", 4);
		solo.clickOnView(edu5);
		solo.clickOnView(edu);
		View edu6 = solo.getView("text1", 5);
		solo.clickOnView(edu6);
		solo.sleep(2000);

		// *选择收入
		View income = solo.getView("money_layout");
		solo.clickOnView(income);
		View inc1 = solo.getView("text1", 0);
		solo.clickOnView(inc1);
		solo.clickOnView(income);
		View inc2 = solo.getView("text1", 1);
		solo.clickOnView(inc2);
		solo.clickOnView(income);
		View inc3 = solo.getView("text1", 2);
		solo.clickOnView(inc3);
		solo.clickOnView(income);
		View inc4 = solo.getView("text1", 3);
		solo.clickOnView(inc4);
		solo.clickOnView(income);
		View inc5 = solo.getView("text1", 4);
		solo.clickOnView(inc5);
		solo.clickOnView(income);
		View inc6 = solo.getView("text1", 5);
		solo.clickOnView(inc6);
		solo.sleep(2000);

		// *填写地址
		solo.clearEditText(1);
		solo.enterText(1, "成都市高新区益州大道布鲁明顿广场B-12");
		solo.sleep(2000);

		// *邮箱格式验证
		solo.scrollToBottom();
		solo.clearEditText(1);
		solo.enterText(1, "blueberry.com");
		v = solo.getView("confirm_text");
		solo.clickOnView(v);
		assertTrue("邮箱格式不正确未显示", solo.waitForText("邮箱格式不正确"));
		solo.clearEditText(1);
		solo.enterText(1, "blueberry@testmail.com");

		// *兴趣爱好
		View hobby1 = solo.getView("item_text", 0);
		solo.clickOnView(hobby1);
		View hobby2 = solo.getView("item_text", 1);
		solo.clickOnView(hobby2);
		View hobby3 = solo.getView("item_text", 2);
		solo.clickOnView(hobby3);
		View hobby4 = solo.getView("item_text", 3);
		solo.clickOnView(hobby4);
		View hobby5 = solo.getView("item_text", 4);
		solo.clickOnView(hobby5);
		View hobby6 = solo.getView("item_text", 5);
		solo.clickOnView(hobby6);
		View hobby7 = solo.getView("item_text", 6);
		solo.clickOnView(hobby7);
		View hobby8 = solo.getView("item_text", 7);
		solo.clickOnView(hobby8);
		View hobby9 = solo.getView("item_text", 8);
		solo.clickOnView(hobby9);
		solo.clickOnView(hobby5);
		solo.sleep(2000);

		solo.clickOnView(v);
		assertTrue("修改成功提示未显示", solo.waitForText("个人信息修改成功"));
	}
}
