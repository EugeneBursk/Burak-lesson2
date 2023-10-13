package com.belhard.lesson2.cycles;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a start coordinate A of the segment:");
		double segmStart = scan.nextDouble();
		System.out.println("Please enter an end coordinate B of the segment:");
		double segmEnd = scan.nextDouble();
		System.out.println("Please enter a stap:");
		double step = scan.nextDouble();
		double x = segmStart;
		System.out.println("The function values are:");
		while (x <= segmEnd ) {
			double functionValue = 0;
					if (x > 2 ) {
						functionValue = x + 4;
					} else if (x <= 2) {
						functionValue = -x * 2;
					}
					System.out.println("x = " + x + ",y =" + functionValue );
					x += step; 
		}
		
	}
}
