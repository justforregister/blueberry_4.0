package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.login.*;

public class LoginSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(ErrorInputsCheck.class);
		suite.addTestSuite(ReturnToPrevious.class);
		suite.addTestSuite(SwitchToRegisterPage.class);
		suite.addTestSuite(NetworkOffCheck.class);
		suite.addTestSuite(LoginSuccessCheck.class);
		return suite;
	}
}