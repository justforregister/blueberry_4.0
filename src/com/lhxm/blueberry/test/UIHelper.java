package com.lhxm.blueberry.test;

import com.lhxm.blueberry.test.elements.ElementsMallHomeActivity;
import com.robotium.solo.Solo;

public class UIHelper {
	private Solo solo = null;
	private ElementsMallHomeActivity elementsLoginActivity;

	public UIHelper(Solo solo) {
		this.solo = solo;
	}

	public Solo getSolo() {
		return solo;
	}

	public ElementsMallHomeActivity getElementsMallHomeActivity() {
		if (elementsLoginActivity == null) {
			elementsLoginActivity = new ElementsMallHomeActivity(solo);
			return elementsLoginActivity;
		}
		return elementsLoginActivity;
	}
	
//	**
//	TODO 后续编写完其他页面的控件类，
//	可以参照getElementsMallHome方法，
//	编写对应的获取页面控件类 
//	**
}
