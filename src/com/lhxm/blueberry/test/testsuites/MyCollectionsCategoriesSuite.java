package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.mycollections.*;

public class MyCollectionsCategoriesSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(CancelDeleteRecord.class);
		suite.addTestSuite(ExchangeWhenNetworkOff.class);
		suite.addTestSuite(NetworkOffCheck.class);
		return suite;
	}
}