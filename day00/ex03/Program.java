package com.company.ex03;

import java.util.Scanner;

public class Program {
	public static long pow(int base, int pow) {
		if (pow == 0)
			return 1;
		long ret = base;
		for (int i = 1; i < pow; i++)
			ret *= 10;
		return ret;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int countWeek = 0;
		String str;
		int num;
		long ret = 0;
		boolean exit = false;
		while (!exit && scanner.hasNextLine())
		{
			str = scanner.next();

			if (!scanner.hasNextInt() || !str.equals("Week")){
				System.out.println("IllegalArgument");
				System.exit(-1);
			}
			num = scanner.nextInt();
			countWeek++;
			if (num != countWeek){
				System.out.println("IllegalArgument");
				System.exit(-1);
			}
			int min = 10;
			int temp;
			while (!exit && scanner.hasNextInt()) {
				temp = scanner.nextInt();
				if ((temp <=0 || temp >= 10) && temp != 42){
					System.out.println("IllegalArgument");
					System.exit(-1);
				}
				if (min > temp) {
					min = temp;
				}
				if (temp == 42){
					exit = true;
				}
			}
			ret += pow(10, countWeek-1) * (long)min;
		}
		int i = 1;
		while (ret > 0) {
			System.out.print("Week" + i + " ");
			for (int t = (int)ret%10; t > 0; t--){
				System.out.print("=");
			}
			System.out.println(">");
			i++;
			ret /= 10;
		}
	}
}
