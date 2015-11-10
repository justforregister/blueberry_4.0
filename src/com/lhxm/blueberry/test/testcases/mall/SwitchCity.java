package com.lhxm.blueberry.test.testcases.mall;

import android.widget.TextView;

import com.lhxm.blueberry.test.BasicTestCase;

import static org.junit.Assert.*;

public class SwitchCity extends BasicTestCase {


	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanSwitchLocatedCity() {
		// Open choose city view
		v = solo.getView("city_text", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// Choose the first city in scroll list
		v = solo.getView("name", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// Get chosen city name
		v = solo.getView("city_text", 0);
		TextView v1 = (TextView) v;
		String city1 = v1.getText().toString();
		// System.out.println(city1);

		// Choose current located city
		solo.clickOnView(v);
		solo.sleep(2000);
		v = solo.getView("nowCity", 0);
		solo.clickOnView(v);
		solo.sleep(2000);

		// Get 2nd chosen city name
		v = solo.getView("city_text", 0);
		TextView v2 = (TextView) v;
		String city2 = v2.getText().toString();
		// System.out.println(city2);

		// assert two names not equal
		assertNotEquals("城市相同，可能出现BUG!", city1, city2);
		
	}

}
