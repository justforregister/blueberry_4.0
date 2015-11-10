package com.lhxm.blueberry.test.testcases.register;

import com.lhxm.blueberry.test.BasicTestCaseWithLogout;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;

public class EnterProvisionPage extends BasicTestCaseWithLogout {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEmptyAccountAndPassword() {

		EnterMinePageActivity.enterMinePage();
		doLogout();

		// *注册按钮
		solo.clickOnImageButton(1);

		// *点击“我已阅读并同意相关服务条款和隐私政策”链接
		v = solo.getView("provision_text");
		solo.clickOnView(v);
		solo.sleep(2000);
		
		// *判断是否打开BROWSER_ACTIVITY
		solo.assertCurrentActivity("未进入服务条款页面", BROWSER_ACTIVITY);
		assertTrue("服务条款未显示！", solo.searchText("服务条款"));

	}
}
