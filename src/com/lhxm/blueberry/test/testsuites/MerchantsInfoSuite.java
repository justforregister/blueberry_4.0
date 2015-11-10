package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.merchantsinfo.*;

public class MerchantsInfoSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(EnterMerchandiseDetailThroughMerchants.class);
		suite.addTestSuite(EnterMerchandiseFreshVisitPlusOne.class);
		suite.addTestSuite(EnterShop.class);
		suite.addTestSuite(MerchantsInfo.class);
		suite.addTestSuite(ReturnToMerchandiseDetail.class);
		return suite;
	}
}