package com.belhard.lesson2.linear;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		    System.out.print("Please enter your number as xxx.yyy :");
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble(); 
		double secondPart; 
		secondPart = a - (a % 1000);
		double firstPart;
		firstPart = a % 1000;
		if (scan.hasNextDouble()) {
		System.out.println("firstPart.secondPart");
		} else { System.out.println ("Invalid input"); }
		}
}