package com.nt.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.nt.listener.DemoListerner;

@Listeners(DemoListerner.class)
public class Test1 {

	@Test
	public void m1() {
		System.out.println("Test1.m1()");
	}
	
	@Test
	public void m2() {
		System.out.println("Test1.m2()");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Test1.beforeMethod()");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Test1.afterMethod()");
	}
	
	@Test
	public void m4() {
		System.out.println("Test1.m4()");
	}
}