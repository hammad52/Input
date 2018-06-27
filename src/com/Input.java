package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String name=input.readLine();
		System.out.println("Hello "+name);
		System.out.println("Enter your age");
		int age=Integer.parseInt(input.readLine());
		System.out.println("Your age is : "+age);
	}

}
