package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.morecategories.*;

public class MoreCategoriesSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(ClickToEnterMoreSecondClassCategories.class);
		suite.addTestSuite(DisplayAllCategories.class);
		suite.addTestSuite(EnterMoreCategoriesAndReturn.class);
		return suite;
	}
}