package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.score.*;

public class ScoreSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(CheckDisplayAndReturn.class);
		suite.addTestSuite(NetworkOffCheck.class);
		return suite;
	}
}