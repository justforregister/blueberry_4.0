package com.lhxm.blueberry.test.runners;

import junit.framework.TestSuite;
import android.test.InstrumentationTestRunner;

import com.lhxm.blueberry.test.testsuites.RunAllSuite;

public class Runner2 extends InstrumentationTestRunner {

	@Override
	public TestSuite getAllTests() {
		// TODO Auto-generated method stub
		TestSuite suite = new TestSuite();
		/**
		 * Add more suites here
		 */

		suite.addTest(RunAllSuite.getTestSuite());
		return suite;
	}

}
