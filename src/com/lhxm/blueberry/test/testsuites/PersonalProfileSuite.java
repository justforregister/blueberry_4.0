package com.lhxm.blueberry.test.testsuites;

import junit.framework.TestSuite;

import com.lhxm.blueberry.test.testcases.personalprofile.*;

public class PersonalProfileSuite {
	public static TestSuite getTestSuite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(CheckSavedChange.class);
		suite.addTestSuite(ChooseBirthday.class);
		suite.addTestSuite(EditNickname.class);
		suite.addTestSuite(EnterPersonalProfile.class);
		suite.addTestSuite(NetworkOffCheck.class);
		suite.addTestSuite(PasswordErrorInputCheck.class);
		suite.addTestSuite(PasswordResetSuccess.class);
		suite.addTestSuite(ReturnSaveOrUnsaveCheck.class);
		suite.addTestSuite(ReturnToPrevious.class);
		suite.addTestSuite(SaveWithoutChange.class);
		suite.addTestSuite(SelectEachField.class);
		return suite;
	}
}