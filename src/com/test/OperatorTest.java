package com.test;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		
		int a=23,b=89, c=34;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		
		if(a>b && a>c)
		{
			System.out.println("Hi program");
		}
		
		else
		{
			System.out.println("hello world");
		}
		
		
		
		if(b>a || b<c)
		{
			System.out.println("Hi program");
		}
		
		else
		{
			System.out.println("hello world");
		}
		
		
		
		
		
		System.out.println(b>a && b<c);  //relational operator
		System.out.println(b!=a);//true
		System.out.println(b==a);//false
		
		Scanner ob=new Scanner(System.in);
		
		   
		a+=5;//assignment operator
		System.out.println(a);
		
		a=a/2;
		a/=2;
		
		a=a*5;
		a*=5;
		
		a=12;
		a=b; //Comparison operator
		
		System.out.println(c++);
		System.out.println(c);  //post increment
		
		System.out.println(c--); //post decrement
		System.out.println(c);
		
		System.out.println(--c);
		System.out.println(c);//pre decrement
		
		System.out.println(++c);
		System.out.println(c);//pre increment
		
		
		System.out.println(a++ + ++a - --a);//we have to clear all assignment value
		
		System.out.println(ob instanceof Scanner);
		
		
		
		
		
		
		

	}

}
