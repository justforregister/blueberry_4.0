package com.lhxm.blueberry.test.testcases.score;

import android.content.Context;
import android.graphics.Point;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

import com.lhxm.blueberry.test.BasicTestCase;
import com.lhxm.blueberry.test.elements.EnterMinePageActivity;
import com.lhxm.blueberry.test.utils.Util;

public class testlockscreen extends BasicTestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

//	private PowerManager.WakeLock wakeScreenObject = null;
	
	public void testWakeLock() {
		try {
			if (wakeScreenObject != null) {
				wakeScreenObject.release();
				wakeScreenObject = null;
		}} catch (Throwable th) {
			// TODO: handle exception
			solo.sleep(1000);
		}
	}

	@Override
	public void tearDown() throws Exception {
		getActivity().finish();
	}
}
