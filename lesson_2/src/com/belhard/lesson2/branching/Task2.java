package com.belhard.lesson2.branching;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter X:");

		if (scan.hasNextDouble()) {
			double x = scan.nextDouble();
			double y;
			if (x <= 3) {
				y = x * x - 3 * x + 9;
			} else {
				y = 1 / (x * x * x + 6);
			}

			System.out.println("y = " + y);

		} else {
			System.out.println("Invalid input");

		}

	}
}
