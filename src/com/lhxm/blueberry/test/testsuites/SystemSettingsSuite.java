package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.systemsettings.*;

public class SystemSettingsSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(HelpGuideAbout.class);
		suite.addTestSuite(LogoutCheck.class);
		suite.addTestSuite(RefreshLockScreen.class);
		suite.addTestSuite(SetNumbersLockScreen.class);
		return suite;
	}
}