package com.lhxm.blueberry.test.testcases.score;

import com.lhxm.blueberry.test.BasicTestCase;
import com.lhxm.blueberry.test.BasicTestCaseWithLogin;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.ViewFetcher;

public class testpatternunlock extends BasicTestCaseWithLogin {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	ViewFetcher viewFetcher = new ViewFetcher(solo, this.getInstrumentation());

	// private PowerManager.WakeLock wakeScreenObject = null;

	public void testPatternUnlock() {
		
		EnterMinePageActivity.enterMinePage();
		doLoginWithAccount();
		
		solo.clickOnText("œµÕ≥…Ë÷√");
		solo.sleep(2000);
		solo.clickOnView(solo.getView("digital_setting_lock_check"));
		solo.sleep(2000);
		
		viewFetcher.touchLock("pattern_lock", 1, 3, 5, 4, 7);
		solo.sleep(2000);
	}

	@Override
	public void tearDown() throws Exception {
		getActivity().finish();
	}
}
