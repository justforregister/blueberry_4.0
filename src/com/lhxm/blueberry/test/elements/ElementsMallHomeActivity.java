package com.lhxm.blueberry.test.elements;

import android.widget.Button;
import android.widget.EditText;

//import com.lhxm.blueberry.R;

import com.robotium.solo.Solo;

public class ElementsMallHomeActivity {

	private Solo solo;
	private EditText nameEditText, passwordEditText;
	private Button loginButton;

	public ElementsMallHomeActivity(Solo solo) {
		this.solo = solo;
		initViews();
	}

	/**
	 * ��ʼ����ʱ���ҵ����е�¼ҳ��Ŀؼ�
	 */
	private void initViews() {
		// * TODO when get source codes *
		// nameEditText
		// =(EditText)solo.getCurrentActivity().findViewById(R.id.nameET);
		// passwordEditText
		// =(EditText)solo.getCurrentActivity().findViewById(R.id.passwordET);
		// loginButton
		// =(Button)solo.getCurrentActivity().findViewById(R.id.loginBtn);
	}

	/**
	 * ����û��������
	 *
	 * @return
	 */
	public EditText getNameEditText() {
		return nameEditText;
	}

	/**
	 * ������������
	 *
	 * @return
	 */
	public EditText getPasswordEditText() {
		return passwordEditText;
	}

	/**
	 * ��õ�¼��ť
	 *
	 * @return
	 */
	public Button getLoginButton() {
		return loginButton;
	}

	/**
	 * �����û���
	 *
	 * @param text
	 */
	public void enterName(String text) {
		solo.enterText(nameEditText, text);
	}

	/**
	 * ��������
	 *
	 * @param text
	 */
	public void enterPassword(String text) {
		solo.enterText(passwordEditText, text);
	}

	/**
	 * �����¼��ť
	 */
	public void clickLoginButton() {
		solo.clickOnView(loginButton);
	}

}