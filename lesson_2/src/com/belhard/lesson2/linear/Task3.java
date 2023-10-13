package com.belhard.lesson2.linear;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
	System.out.println("Please enter your integer number of seconds:"); 
    Scanner scan = new Scanner(System.in);
    
	int a = scan.nextInt();
	int sec = a % 60;
	int min = a / 60 % 60;
	int hours = a / 3600;
	System.out.println( hours + "h" + min + "min" + sec + "s");
	}	
}
