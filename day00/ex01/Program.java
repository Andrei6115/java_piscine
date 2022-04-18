package com.company.ex01;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number <= 1) {
			System.err.println("IllegalArgument");
			System.exit(-1);
		}
		int temp;
		boolean isPrime = true;
		int count_it = 1;
		for (int i=2; i*i <= number; i++, count_it++) {
			temp = number%i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime + " " + count_it);
	}
}
