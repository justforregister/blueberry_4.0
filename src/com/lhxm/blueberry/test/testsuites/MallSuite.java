package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.mall.*;

public class MallSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(ReturnAndClose.class);
		suite.addTestSuite(NetworkOffCheck.class);
		suite.addTestSuite(NetworkOnCheck.class);
		suite.addTestSuite(SwitchCity.class);
		suite.addTestSuite(MallHomeUICheck.class);
		suite.addTestSuite(OpenCategories.class);
		suite.addTestSuite(OpenSearchView.class);
		return suite;
	}
}