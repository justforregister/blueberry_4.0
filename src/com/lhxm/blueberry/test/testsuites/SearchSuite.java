package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.search.*;

public class SearchSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(EnterHotSearchItem.class);
		suite.addTestSuite(EmptySearchResult.class);
		suite.addTestSuite(EnterMerchandiseFreshVisitPlusOne.class);
		suite.addTestSuite(EnterSpecificMerchandise.class);
		suite.addTestSuite(HotSearchMenuDisplay.class);
		suite.addTestSuite(NetworkOffCheck.class);
		suite.addTestSuite(NormalSearch.class);
		suite.addTestSuite(ReturnToMallHome.class);
		suite.addTestSuite(SearchSpecialCharacters.class);
		suite.addTestSuite(WanderAround.class);
		return suite;
	}
}