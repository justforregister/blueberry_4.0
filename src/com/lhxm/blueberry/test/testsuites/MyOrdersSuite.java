package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.myorders.*;

public class MyOrdersSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(CheckOrdersCategories.class);
		suite.addTestSuite(ClickToEnterMerchandiseDetail.class);
		suite.addTestSuite(EnterAndReturn.class);
		return suite;
	}
}