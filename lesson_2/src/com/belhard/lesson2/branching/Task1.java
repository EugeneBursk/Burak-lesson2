package com.belhard.lesson2.branching;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("x = max{min(a, b), min(c, d)}");
		Scanner scan = new Scanner(System.in);
		double a = 0;
		System.out.print("Please enter decimal value A:");
		if (scan.hasNextDouble()) {
			a = scan.nextDouble();
		} else {
			System.out.println("Not a decimal value!");
		}
		double b = 0;
		System.out.print("Please enter decimal value B:");
		if (scan.hasNextDouble()) {
			b = scan.nextDouble();
		} else {
			System.out.println("Not a decimal value!");
		}
		double c = 0;
		System.out.print("Please enter decimal value C:");
		if (scan.hasNextDouble()) {
			c = scan.nextDouble();
		} else {
			System.out.println("Not a decimal value!");
		}
		double d = 0;
		System.out.print("Please enter decimal value D:");
		if (scan.hasNextDouble()) {
			d = scan.nextDouble();
		} else {
			System.out.println("Not a decimal value!");
			return;
		}
		double minAB = b <= a ? b : a;
		double minCD = c <= d ? c : d;
		double x = minAB >= minCD ? minAB : minCD;
		System.out.println("x = " + x);
	}
}