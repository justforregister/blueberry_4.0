package com.lhxm.blueberry.test.runners;

import junit.framework.TestSuite;
import android.test.InstrumentationTestRunner;

import com.lhxm.blueberry.test.testsuites.AwardSuite;
import com.lhxm.blueberry.test.testsuites.LocationSuite;
import com.lhxm.blueberry.test.testsuites.LoginSuite;
import com.lhxm.blueberry.test.testsuites.MallSuite;
import com.lhxm.blueberry.test.testsuites.MerchandiseDetailSuite;
import com.lhxm.blueberry.test.testsuites.MerchandiseListSuite;
import com.lhxm.blueberry.test.testsuites.MerchantsInfoSuite;
import com.lhxm.blueberry.test.testsuites.MineSuite;
import com.lhxm.blueberry.test.testsuites.MoreCategoriesSuite;
import com.lhxm.blueberry.test.testsuites.MyCollectionsCategoriesSuite;
import com.lhxm.blueberry.test.testsuites.MyOrdersSuite;
import com.lhxm.blueberry.test.testsuites.PersonalProfileSuite;
import com.lhxm.blueberry.test.testsuites.RegisterSuite;
import com.lhxm.blueberry.test.testsuites.ResetPasswdSuite;
import com.lhxm.blueberry.test.testsuites.ScoreSuite;
import com.lhxm.blueberry.test.testsuites.SearchSuite;
import com.lhxm.blueberry.test.testsuites.SecretarySuite;
import com.lhxm.blueberry.test.testsuites.ShareSuite;
import com.lhxm.blueberry.test.testsuites.SystemSettingsSuite;

public class Runner1 extends InstrumentationTestRunner {

	@Override
	public TestSuite getAllTests() {
		// TODO Auto-generated method stub
		TestSuite suite = new TestSuite();
		/**
		 * Add more suites here
		 */
		suite.addTest(AwardSuite.getTestSuite());
		suite.addTest(LocationSuite.getTestSuite());
		suite.addTest(LoginSuite.getTestSuite());
		suite.addTest(MallSuite.getTestSuite());
		suite.addTest(MerchandiseDetailSuite.getTestSuite());
		suite.addTest(MerchandiseListSuite.getTestSuite());
		suite.addTest(MerchantsInfoSuite.getTestSuite());
		suite.addTest(MineSuite.getTestSuite());
		suite.addTest(MoreCategoriesSuite.getTestSuite());
		suite.addTest(MyCollectionsCategoriesSuite.getTestSuite());
		suite.addTest(MyOrdersSuite.getTestSuite());
		suite.addTest(PersonalProfileSuite.getTestSuite());
		suite.addTest(RegisterSuite.getTestSuite());
		suite.addTest(ResetPasswdSuite.getTestSuite());
		suite.addTest(ScoreSuite.getTestSuite());
		suite.addTest(SearchSuite.getTestSuite());
		suite.addTest(SecretarySuite.getTestSuite());
		suite.addTest(ShareSuite.getTestSuite());
		suite.addTest(SystemSettingsSuite.getTestSuite());
		return suite;
	}

}
