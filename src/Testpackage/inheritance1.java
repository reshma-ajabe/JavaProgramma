package Testpackage;

public class inheritance1 {
	int a=100;
	static int b=56;
	String s="reshmaajabe";
	
	public void method1() {
		System.out.println("I am super class method");
		
	}
	public int method2() {
		System.out.println("I am return type method");
		return method2();
	}
	public static void method3() {
		System.out.println("I am static method");
	}
	
	

}
