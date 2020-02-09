package com.home2.calculator;

import java.util.Random;
import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("--------------------Simple Calculator-----------------------");
		CalApp c;
		int c1=0,tot=0;
		int[] arr=new int[]{1,2,3,4};
		while(c1!=3){
			System.out.print("\n1.Add\n2.Subtraction\n3.Multiplication\n4.Division");
			int choice=new Random().nextInt(arr.length);
			switch(choice)
			{
			case 1:System.out.println("Addtion");
			c=new CalApp();
			System.out.print("Enter a and b\n");
			int a=in.nextInt();
			int b=in.nextInt();
			tot=tot+c.Add(a, b);
			System.out.print("Sum of a and b\n"+c.Add(a, b));
			break;
			case 2:System.out.println("Subtraction");
			c=new CalApp();
			System.out.print("Enter a and b\n");
			int a1=in.nextInt();
			int b1=in.nextInt();
			System.out.print("Subtraction of a and b\n"+c.Subtract(a1, b1));
			break;
			case 3:System.out.println("Multiplication");
			c=new CalApp();
			tot=1;
			System.out.print("Enter a and b\n");
			int a11=in.nextInt();
			int b11=in.nextInt();
			System.out.print("Multiplication of a and b\n"+c.Multiply(a11, b11));
			break;
			case 4:System.out.println("Division");
			c=new CalApp();
			System.out.print("Enter a and b\n");
			int a111=in.nextInt();
			int b111=in.nextInt();
			System.out.print("Division of a and b\n"+c.Division(a111, b111));
			break;
			
			
			}
			c1++;
		}
	}

}
