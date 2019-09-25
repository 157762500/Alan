package com.git.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("before suite运行啦");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("after suite运行啦");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest运行啦");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest运行啦");
	}

}
