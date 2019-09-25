package com.git.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsMethod {
	
	@Test(groups="server")
	public void test1() {
		System.out.println("这是服务端组的测试方法1");
	}
	
	@Test(groups="server")
	public void test2() {
		System.out.println("这是服务端组的测试方法2");
	}
	
	@Test(groups="client")
	public void test3() {
		System.out.println("这是客户端组的测试方法1");
	}
	
	@Test(groups="client")
	public void test4() {
		System.out.println("这是客户端组的测试方法2");
	}
	
	@BeforeGroups("server")
	public void beforeGroupsServer(){
		System.out.println("这是服务端组运行前的方法1");
	}
	
	@AfterGroups("server")
	public void afterGroupsServer(){
		System.out.println("这是服务端组运行后的方法2");
	}
	
	@BeforeGroups("client")
	public void beforeGroupsClient(){
		System.out.println("这是客户端组运行前的方法1");
	}
	
	@AfterGroups("client")
	public void afterGroupsClient(){
		System.out.println("这是客户端组运行后的方法2");
	}

}
