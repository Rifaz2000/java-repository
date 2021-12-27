package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Faraheneattocentgrade {

	public static void main(String[] args)throws NumberFormatException, IOException {
		double c,f;
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		System.out.println("enter the farenheat number:");
		f=Double.parseDouble(ob.readLine());
		c=5*(f-32)/9;
		
		System.out.println("Centigrade"+c);
		

	}

}
