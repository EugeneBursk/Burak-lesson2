package com.belhard.lesson2.linear;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("z = ((a - 3) * b / 2) + c" );
		System.out.print("Please enter your numbers:");
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		System.out.println("a = " + a);
		double b = scanner.nextDouble();
		System.out.println("b = " + b);
		double c = scanner.nextDouble();
		System.out.println("c = " + c);
		double z;
		z = ((a - 3) * b / 2) + c;
		System.out.println("z = " + z);

	}
}
