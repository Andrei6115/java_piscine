package com.company.ex02;

import java.util.Scanner;

public class Program {
	private static int sumDigit(int number) {
		if (number <= 0) {
			if (number == -2147483648) {
				return (47);
			}
			number *= -1;
		}
		int sum = 0;
		for (; number > 0; number/=10){
			sum+=number%10;
		}
		return (sum);
	}
	private static boolean isPrime(int number)
	{
		if (number <= 1) {
			return false;
		}
		int temp;
		boolean isPrime = true;
		for (int i=2; i*i <= number; i++) {
			temp = number%i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int countCoffeeRequest = 0;
		while (number != 42)
		{
			if (isPrime(sumDigit(number)))
				countCoffeeRequest++;
			number = scanner.nextInt();
		}
		System.out.println("Count of coffee-request - " + countCoffeeRequest);
	}
}
