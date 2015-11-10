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
	 * 初始化的时候，找到所有登录页面的控件
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
	 * 获得用户名输入框
	 *
	 * @return
	 */
	public EditText getNameEditText() {
		return nameEditText;
	}

	/**
	 * 获得密码输入框
	 *
	 * @return
	 */
	public EditText getPasswordEditText() {
		return passwordEditText;
	}

	/**
	 * 获得登录按钮
	 *
	 * @return
	 */
	public Button getLoginButton() {
		return loginButton;
	}

	/**
	 * 输入用户名
	 *
	 * @param text
	 */
	public void enterName(String text) {
		solo.enterText(nameEditText, text);
	}

	/**
	 * 输入密码
	 *
	 * @param text
	 */
	public void enterPassword(String text) {
		solo.enterText(passwordEditText, text);
	}

	/**
	 * 点击登录按钮
	 */
	public void clickLoginButton() {
		solo.clickOnView(loginButton);
	}

}