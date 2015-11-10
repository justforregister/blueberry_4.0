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
//	TODO ������д������ҳ��Ŀؼ��࣬
//	���Բ���getElementsMallHome������
//	��д��Ӧ�Ļ�ȡҳ��ؼ��� 
//	**
}
