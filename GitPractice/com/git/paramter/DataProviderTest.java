package com.git.paramter;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "data")
	public void testDataProvider(String name,int age) {
		System.out.println("name="+name+"; age="+age);
	}
	
	@DataProvider(name = "data")
	public Object[][] providerData(){
		Object[][] demo=new Object[][] {
			{"zhangsan",10},
			{"lisi",20},
			{"wangwu",30}
		};
		return demo;
	}
	
	@Test(dataProvider = "methodData")
	public void test1(String name,int age) {
		System.out.println("test1111方法 name="+name+";age="+age);
	}
	
	@Test(dataProvider = "methodData")
	public void test2(String name,int age) {
		System.out.println("test2222方法 name="+name+";age="+age);
	}
	
	@DataProvider(name="methodData")
	public Object[][] methodDataTest(Method method){
		Object[][] result =null;
		if(method.getName().equals("test1")) {
			result = new Object[][] {
				{"AAA",20},
				{"BBB",30}
			};
		}else if(method.getName().equals("test2")) {
			result = new Object[][] {
				{"CCC",40},
				{"DDD",50}
			}; 
		}
		return result;
	}
	
}
