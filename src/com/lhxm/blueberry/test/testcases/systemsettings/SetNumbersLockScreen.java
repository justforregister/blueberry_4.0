package com.lhxm.blueberry.test.testcases.systemsettings;

import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class SetNumbersLockScreen extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testNumbersLockScreen() {

		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();

		// *开启锁屏设置
		solo.clickOnText("系统设置");
		if (solo.isCheckBoxChecked(1) == false) {
			solo.clickOnCheckBox(1);
		} else {
			solo.sleep(1000);
		}

		// *点击开启数字锁屏
		solo.clickOnCheckBox(2);
		// *输入四位密码,点确定
		solo.enterText(0, "1234");
		solo.clickOnText("确定");
		// *点击取消或返回按钮
		solo.clickOnText("取消");
		solo.sleep(1000);
		solo.clickOnText("取消");
		solo.clickOnImageButton(0);
		solo.clickOnText("取消");
		// *密码不一致
		solo.enterText(0, "1235");
		solo.clickOnText("确定");
		assertTrue("密码不一致未显示", solo.waitForText("两次输入的数字密码不一致"));
		// *成功设置
		solo.enterText(0, "1234");
		solo.clickOnText("确定");
		assertTrue("密码设置成功未显示", solo.waitForText("设置数字密码成功"));

		// *再次进入数字密码
		solo.clickOnCheckBox(2);
		// *错误密码
		solo.enterText(0, "2323");
		solo.clickOnText("确定");
		assertTrue("密码错误未显示", solo.waitForText("密码错误，请重新输入"));
		// *取消或返回
		solo.clickOnText("取消");
		solo.clickOnCheckBox(2);
		solo.clickOnImageButton(0);
		solo.clickOnCheckBox(2);
		// *正确密码
		solo.enterText(0, "1234");
		solo.clickOnText("确定");

	}

}
