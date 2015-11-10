package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.merchandiselist.*;

public class MerchandiseListSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(EmptyLocationWhenNetworkOff.class);
		suite.addTestSuite(EnterSearchView.class);
		suite.addTestSuite(GetLocationWhenNetworkOn.class);
		suite.addTestSuite(HeaderDisplay.class);
		suite.addTestSuite(ReturnToMallHome.class);
		return suite;
	}
}