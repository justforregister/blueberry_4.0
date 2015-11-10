package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.secretary.*;

public class SecretarySuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(InputCheck.class);
		suite.addTestSuite(NetworkOffCheck.class);
		return suite;
	}
}