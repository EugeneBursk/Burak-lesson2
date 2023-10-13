package com.belhard.lesson2.cycles;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("Please enter your positive integer number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num >= 0) {
			for (int i = 0; i <= num; i++) {
				sum = num - 1 + i;
			}
			System.out.println("sum = " + sum);
		} else {
			System.out.println("invalid input");
		}
	}
}