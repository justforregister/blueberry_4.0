package com.lhxm.blueberry.test;

import com.lhxm.blueberry.test.BasicTestCase;

public class FirstBlueberryTest extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCanOpenSettings() {
		solo.scrollToTop();
		solo.clickOnText("��ʳ");
		// solo.sleep(2000);
		assertTrue(solo.searchText("��ʳ"));
	}
}
