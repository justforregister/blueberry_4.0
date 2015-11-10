package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.award.*;

public class AwardSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(ShareCheck.class);
		suite.addTestSuite(LoginReferralCodeCheck.class);
		suite.addTestSuite(RecommendLinkCheck.class);
		return suite;
	}
}