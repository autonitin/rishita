package com.nt.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoListerner implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("DemoListerner.onTestStart()");
	}

}
