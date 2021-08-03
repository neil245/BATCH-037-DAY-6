package com.day6.java;

import java.util.Scanner;

public class Day6 {
	static int n;
	static int sum =0,rev;
public static void main(String[] args) {
System.out.println("Enter a number to find it's reverse");
Scanner s = new Scanner(System.in);
n = s.nextInt();
System.out.println("The inputted number is : "+n);
while(n>0) {
	rev = n%10;
	sum = sum*10+rev;
	n = n/10;
}

System.out.println("The reverse of the number is "+sum);




}

}
