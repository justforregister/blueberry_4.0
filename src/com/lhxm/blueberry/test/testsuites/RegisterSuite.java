package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.register.*;

public class RegisterSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(EmptyAccountAndPassword.class);
		suite.addTestSuite(EnterActivatePage.class);
		suite.addTestSuite(EnterProvisionPage.class);
		suite.addTestSuite(ErrorInputsCheck.class);
		suite.addTestSuite(HideAndShowPassword.class);
		suite.addTestSuite(NetworkOffCheck.class);
		suite.addTestSuite(RegisterWithEmptyData.class);
		suite.addTestSuite(ReturnToPrevious.class);
		suite.addTestSuite(SwitchToLoginPage.class);
		return suite;
	}
}