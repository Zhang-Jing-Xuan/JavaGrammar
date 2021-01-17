package test_2;

import java.util.Scanner;

public class Test_2 {
	//函数
	public static boolean isPrime(int x) {
		boolean isPrime=true;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
//字符
//		char c='\u0041';//char c='A';
//		System.out.println("abc\bd");
//		System.out.println("123\t123");
//		System.out.println("1\t123");
//包裹类型
/*
		Integer k=10;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Character.toLowerCase('I'));
		System.out.println(Math.abs(-12));
		System.out.println(Math.round(10.01));
		System.out.println(Math.random()*100);
		System.out.println(Math.pow(2,3.2));
*/
//字符串
//		Scanner in=new Scanner(System.in);
//		String s=new String("a string");
//		s="hello"+12;
//		s=in.nextLine();
//		System.out.println(s);
//		System.out.println(s.equals("bye"));
//		in.close();
		
//		String s1="0123456789abc汉字abc";
//		String s2="abd";
//		System.out.println("abd".compareTo(s2));
//		//System.out.println(s1.charAt(0));
//		for(int i=0;i<s1.length();i++) {
//			System.out.println(s1.charAt(i));
//		}
//		System.out.println(s1.substring(2));
//		System.out.println(s1.substring(2,4));
//		System.out.println(s1.indexOf('a'));
//		System.out.println(s1.indexOf("abc"));
//		int k=s1.indexOf('a');
//		System.out.println(s1.indexOf('a',k+1));
		
		System.out.println(isPrime(37));
	}

}
