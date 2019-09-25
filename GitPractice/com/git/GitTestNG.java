package com.git;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GitTestNG {
	
	//最基本的注解，用来把方法标记为测试的一部分
	@Test
	public void testcase1() {
		System.out.println("这是测试用例1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("这是测试用例2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod这是测试方法前运行");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod这是测试方法后运行");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass这是在类运行之前运行的方法");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass这是在类运行之后运行的方法");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite测试套件之前");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite测试套件之后");
	}
}
