package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.merchandisedetail.*;

public class MerchandiseDetailSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(BackToTop.class);
		suite.addTestSuite(ReturnToMallHome.class);
		return suite;
	}
}