package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

public class RunAllSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTest(LocationSuite.getTestSuite());
		suite.addTest(LoginSuite.getTestSuite());
		suite.addTest(MallSuite.getTestSuite());
		suite.addTest(MerchandiseDetailSuite.getTestSuite());
		suite.addTest(MerchandiseListSuite.getTestSuite());
		suite.addTest(MerchantsInfoSuite.getTestSuite());
		suite.addTest(MineSuite.getTestSuite());
		suite.addTest(MoreCategoriesSuite.getTestSuite());
		suite.addTest(PersonalProfileSuite.getTestSuite());
		suite.addTest(RegisterSuite.getTestSuite());
		suite.addTest(ResetPasswdSuite.getTestSuite());
		suite.addTest(ScoreSuite.getTestSuite());
		suite.addTest(SearchSuite.getTestSuite());
		return suite;
	}
}