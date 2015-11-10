package com.lhxm.blueberry.test.utils;

import java.util.ArrayList;
import com.robotium.solo.*;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Instrumentation;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.NumberPicker;

public class ViewFetcher {

	Solo solo;
	private final Instrumentation inst;

	public ViewFetcher(Solo solo, Instrumentation inst) {
		this.solo = solo;
		this.inst = inst;
	}

	public View getChildView(View view, int id, String viewClass) {
		View view1 = null;
		ArrayList<View> viewList = new ArrayList<View>();
		if (view != null) {

			ViewGroup viewGroup = (ViewGroup) view;
			for (int i = 0; i < viewGroup.getChildCount(); i++) {

				final View child = viewGroup.getChildAt(i);
				String temp = child.getClass().getName().toString();

				temp = temp.substring(temp.lastIndexOf(".") + 1, temp.length());
				if (temp.equals(viewClass)) {
					viewList.add(child);
				}

			}

			if (id > viewList.size() - 1) {
				return view1;
			} else {
				view1 = viewList.get(id);
			}
		}
		return view1;
	}

	public View getViewById(String id) {

		View view = null;

		if (id == "") {
			return view;
		}
		try {
			Activity act = solo.getCurrentActivity();// ��ȡ��ǰActivity
			int id1 = act.getResources().getIdentifier(id, "id",
					solo.getCurrentActivity().getPackageName());// ��ȡid
			view = solo.getView(id1);// �õ�View
		} catch (Exception ex) {
			Log.e("Exception", ex.getMessage());

		}
		return view;

	}

	public boolean clickById(String id) {

		View view = getViewById(id);

		if (view == null) {
			return false;
		}

		solo.clickOnView(view);
		return true;

	}

	public View getChildViewByID(View view, String ID) {
		ArrayList<View> viewList = new ArrayList<View>();
		viewList = solo.getViews(view);

		for (int i = 0; i < viewList.size(); i++) {

			final View view1 = viewList.get(i);
			String temp = view1.toString();
			int index = temp.lastIndexOf("app:id/");
			if (index > 0) {

				String id = temp.substring(index + 7, temp.length() - 1);
				if (ID.equals(id)) {
					return view1;
				}
			}

		}
		return null;

	}

	public void enterTextById(String id, String text) {
		solo.enterText((EditText) getViewById(id), text);
	}

	public void typeTextById(String id, String text) {
		solo.typeText((EditText) getViewById(id), text);

	}

	public void clickViewByXY(View view) {

		int[] xyLocation = new int[2];
		view.getLocationOnScreen(xyLocation);

		final int viewWidth = view.getWidth();
		final int viewHeight = view.getHeight();

		final float x = xyLocation[0] + (viewWidth / 2.0f);
		float y = xyLocation[1] + (viewHeight / 2.0f);

		solo.clickOnScreen(x, y);

	}

	// area = 0 , �����������
	// area = 1 , �����������
	public void clickNumberPicker(View view, int area) {

		int[] xyLocation = new int[2];
		view.getLocationOnScreen(xyLocation);

		int viewWidth = view.getWidth();
		int viewHeight = view.getHeight();

		float x = xyLocation[0] + (viewWidth / 2.0f);
		float y;
		if (area == 0) {
			y = xyLocation[1] + (viewHeight / 6.0f);
		} else if (area == 1) {
			y = xyLocation[1] + (viewHeight / 6.0f * 5.0f);
		} else {
			return;
		}
		solo.clickOnScreen(x, y);

	}

	public void touchLock(String viewID, int... step) {
		View v = getViewById(viewID);
		touchLock(v, step);

	}

	// ���������ж�Ӧ�ĵ�λ
	// ****1****2****3****
	// ****4****5****6****
	// ****7****8****9****
	@SuppressLint("Recycle")
	public void touchLock(View view, int... step) {

		// �ж�һ�£� ��������������Ҫ2��
		if (step.length < 2) {
			return;
		}

		for (int i = 0; i < step.length; i++) {
			// ���������������ֲ��Ƕ�Ӧ9����ĵ�λ��ֱ���˳�
			if (step[i] < 1 || step[i] > 9) {
				return;
			}
			// ��ÿ���ƶ���λ-1����ӦX Y�����飻
			step[i] = step[i] - 1;
		}

		int[] xyLocation = new int[2];
		view.getLocationOnScreen(xyLocation);

		int viewWidth = view.getWidth();
		int viewHeight = view.getHeight();

		float[] xPoint = new float[9];
		float[] yPoint = new float[9];

		// ���㻬������ҳ���У�9��Ȧ������λ�á�
		// ****1****2****3****
		// ****4****5****6****
		// ****7****8****9****
		xPoint[0] = xyLocation[0] + (viewWidth / 6.0f);
		yPoint[0] = xyLocation[1] + (viewHeight / 6.0f);

		xPoint[1] = xyLocation[0] + (viewWidth / 2.0f);
		yPoint[1] = xyLocation[1] + (viewHeight / 6.0f);

		xPoint[2] = xyLocation[0] + (viewWidth * 5.0f / 6.0f);
		yPoint[2] = xyLocation[1] + (viewHeight / 6.0f);

		xPoint[3] = xyLocation[0] + (viewWidth / 6.0f);
		yPoint[3] = xyLocation[1] + (viewHeight / 2.0f);

		xPoint[4] = xyLocation[0] + (viewWidth / 2.0f);
		yPoint[4] = xyLocation[1] + (viewHeight / 2.0f);

		xPoint[5] = xyLocation[0] + (viewWidth * 5.0f / 6.0f);
		yPoint[5] = xyLocation[1] + (viewHeight / 2.0f);

		xPoint[6] = xyLocation[0] + (viewWidth / 6.0f);
		yPoint[6] = xyLocation[1] + (viewHeight * 5.0f / 6.0f);

		xPoint[7] = xyLocation[0] + (viewWidth / 2.0f);
		yPoint[7] = xyLocation[1] + (viewHeight * 5.0f / 6.0f);

		xPoint[8] = xyLocation[0] + (viewWidth * 5.0f / 6.0f);
		yPoint[8] = xyLocation[1] + (viewHeight * 5.0f / 6.0f);

		// Ҫ�ǻ�������С��2���㣬ֱ���˳�
		if (step.length < 2) {
			return;
		}

		long downTime = SystemClock.uptimeMillis();
		long eventTime = SystemClock.uptimeMillis();

		float x = xPoint[step[0]];
		float y = yPoint[step[0]];

		MotionEvent event = MotionEvent.obtain(downTime, eventTime,
				MotionEvent.ACTION_DOWN, x, y, 0);
		try {
			inst.sendPointerSync(event);
		} catch (SecurityException ignored) {
		}

		solo.sleep(200);
		for (int i = 0; i < step.length - 1; ++i) {
			x = xPoint[step[i + 1]];
			y = yPoint[step[i + 1]];
			eventTime = SystemClock.uptimeMillis();
			event = MotionEvent.obtain(downTime, eventTime,
					MotionEvent.ACTION_MOVE, x, y, 0);
			try {
				inst.sendPointerSync(event);
			} catch (SecurityException ignored) {
			}

			solo.sleep(200);
		}
		x = xPoint[step[step.length - 1]];
		y = yPoint[step[step.length - 1]];
		event = MotionEvent.obtain(downTime, eventTime, MotionEvent.ACTION_UP,
				x, y, 0);
		try {
			inst.sendPointerSync(event);
		} catch (SecurityException ignored) {
		}

		solo.sleep(200);
	}

}
