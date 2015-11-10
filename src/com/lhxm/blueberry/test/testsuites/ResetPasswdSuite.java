package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.resetpasswd.*;

public class ResetPasswdSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(EnterFindPasswdPage.class);
		suite.addTestSuite(ErrorInputsCheck.class);
		suite.addTestSuite(ReturnToPrevious.class);
		return suite;
	}
}