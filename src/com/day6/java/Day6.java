package com.day6.java;

import java.util.Scanner;

public class Day6 {
	static int n;
	static int flag =0;
public static void main(String[] args) {
System.out.println("Enter a number to check whether it is prime or not");
Scanner s = new Scanner(System.in);
n = s.nextInt();
System.out.println("The inputted number is : "+n);
for(int i = 2; i <= (n/2); i ++) {
	if(n%i == 0) {
		flag = 1;
		break;
	}
}

if(flag == 1) {
	System.out.println(n+" is not a prime number");
}
else {
	System.out.println(n+" is a prime number");
}







}

}
