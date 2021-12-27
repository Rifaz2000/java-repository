package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamicinitialization {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		
		long a,b;
		String name;
		char c;
		
		System.out.println("Enter your name:");
		name=ob.readLine();
		
		System.out.println("Enter the value of a:");
		a=Long.parseLong(ob.readLine());
		
		System.out.println("Enter the value of b:");
		b=Long.parseLong(ob.readLine());
		
		System.out.println("sum="+ (a+b));
		
		System.out.println("Enter any character value:");
		c=(char)ob.read();
		
		
		System.out.println(c);
		System.out.println(name);
		
		
		
		
		
		
		

	}

}
