package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.mine.*;

public class MineSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(ChangeHeadImageCheck.class);
		suite.addTestSuite(DailySign.class);
		suite.addTestSuite(EnterLoginRegisterPage01.class);
		suite.addTestSuite(EnterLoginRegisterPage02.class);
		suite.addTestSuite(ReferralCodeCheck.class);
		return suite;
	}
}