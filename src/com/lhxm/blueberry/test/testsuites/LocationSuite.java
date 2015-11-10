package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.location.*;

public class LocationSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(DeleteTextInSearchBox.class);
		suite.addTestSuite(DisplaySearchResult.class);
		suite.addTestSuite(EnterCityMallThroughList.class);
		suite.addTestSuite(EnterSpecificHotCityMall.class);
		suite.addTestSuite(HotCities.class);
		suite.addTestSuite(ScrollCityList.class);
		return suite;
	}
}