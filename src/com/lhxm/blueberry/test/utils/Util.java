package com.lhxm.blueberry.test.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.annotation.SuppressLint;
import android.app.Instrumentation;
import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.test.InstrumentationTestCase;
import android.util.Log;

@SuppressWarnings("deprecation")
public class Util {

	/**
	 * wake up screen if needed
	 * 
	 * @param owner
	 * @return return wakeLock object,it will release after class done
	 */
	@SuppressLint("Wakelock")
	public static WakeLock wakeScreen(InstrumentationTestCase owner) {
		PowerManager pm = (PowerManager) owner.getInstrumentation()
				.getTargetContext().getSystemService(Context.POWER_SERVICE);
		WakeLock wakeLock = pm.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK
				| PowerManager.FULL_WAKE_LOCK
				| PowerManager.ACQUIRE_CAUSES_WAKEUP, owner.getClass()
				.getSimpleName());
		wakeLock.acquire();
		return wakeLock;
	}

	/**
	 * close screen if needed
	 * 
	 * @param instr
	 */
	@SuppressLint("Wakelock")
	public static void closeScreen(InstrumentationTestCase owner) {
		 PowerManager pm = (PowerManager) owner.getInstrumentation()
		 .getTargetContext().getSystemService(Context.POWER_SERVICE);
		 WakeLock wakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK,
		"My TAG");
//		if (pm.isScreenOn()) {
			wakeLock.acquire();
//			wakeLock.release();
//		}
//		return wakeLock;
//		pm.goToSleep(2000); //no permission DEVICE_POWER error..
	}

	public static void unlock(Instrumentation instr) {
		try {
			Context targetContext = instr.getTargetContext();
			KeyguardManager keyGuardManager = (KeyguardManager) targetContext
					.getSystemService(Context.KEYGUARD_SERVICE);
			KeyguardLock mLock = keyGuardManager.newKeyguardLock("");
			mLock.disableKeyguard();
		} catch (Throwable e) {
			Log.e("", "disableKeyguard:", e);
		}
	}

	public static void lock(Instrumentation instr) {
		try {
			Context targetContext = instr.getTargetContext();
			KeyguardManager keyGuardManager = (KeyguardManager) targetContext
					.getSystemService(Context.KEYGUARD_SERVICE);
			KeyguardLock mLock = keyGuardManager.newKeyguardLock("");
			mLock.reenableKeyguard();
		} catch (Throwable e) {
			Log.e("", "reenableKeyguard:", e);
		}
	}

	// 判断屏幕是否被锁定 （目前跑单个Case会用蓝莓锁屏+解锁，跑Suite不会锁屏）
	@SuppressWarnings("static-access")
	public final static boolean isScreenLocked(Context c) {
		android.app.KeyguardManager mKeyguardManager = (KeyguardManager) c
				.getSystemService(c.KEYGUARD_SERVICE);
		return mKeyguardManager.inKeyguardRestrictedInputMode();
	}

	// 截取数字正则方法
	public static String splitNumbers(String string) {
		String return_str = "";
		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher matcher = pattern.matcher(string);
		return_str = matcher.replaceAll("");
		return return_str;
	}

	/*
	 * 返回长度为 [strLength] 的随机数，在前面补0
	 */
	public static String getFixLenthString(int strLength) {

		Random rm = new Random();

		// 获得随机数
		double pross = (1 + rm.nextDouble()) * Math.pow(10, strLength);

		// 将获得的获得随机数转化为字符串
		String fixLenthString = String.valueOf(pross);

		// 返回固定的长度的随机数
		return fixLenthString.substring(1, strLength + 1);
	}

}