package com.day6.java;

import java.util.Scanner;

public class Day6 {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	int n,i;
	int sum = 0;
	System.out.println("Enter the range of fibonacci series");
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	if(n==1) {
		System.out.println(a);
	}
	else if(n==2) {
			System.out.print(a);
			System.out.print(" "+b);
		}
		else {
			System.out.print(a);
			System.out.print(" "+b);	
			for(i=3;i<=n;i++) {
				sum = a+b;
				System.out.print(" "+sum);
				a=b;
				b=sum;
				
				
			}
		}
	
	}

}
