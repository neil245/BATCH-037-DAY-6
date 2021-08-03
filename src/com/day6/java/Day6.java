package com.day6.java;

import java.util.Scanner;

public class Day6 {
	static int n;
	static int sum =0;
public static void main(String[] args) {
System.out.println("Enter a number to check whether it is perfect or not");
Scanner s = new Scanner(System.in);
n = s.nextInt();
System.out.println("The inputted number is : "+n);
for(int i = 1; i < n; i ++) {
	if(n%i == 0) {
		sum = sum + i;
	}
}
if(sum == n) {
	System.out.println(n+" is a perfect number");
}
else {
	System.out.println(n+" is not a perfect number");
}







}

}
