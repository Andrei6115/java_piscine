package com.company.ex04;

import java.util.Scanner;

public class Program {
	private static void out(short[] arr) {
		int max = arr[1];
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j < 10; j++){
				if ((int)(((double)arr[j*2+1]/max)*10) == 10-i)
					System.out.printf("%3d", arr[j*2+1]);
				else if ((int)(((double)arr[j*2+1]/max)*10) > 10-i)
					System.out.printf("  #");
				else
					break;
			}
			System.out.println();
		}
		for (int i = 0; i < 10; i++)
			System.out.printf("%3c", arr[i*2]);
	}
	//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAASSSSSSSSSSSSSSSSSSSSSSSSDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDWEWWKFKKDKKDSKAKLSLDKSKALLLLLLLLLLRTRTETWTWWWWWWWWWWOOOOOOO42
	private static void shiftItems(short[] arr, int index) {
		for (int i = 19; i > index+1; i--) {
			arr[i] = arr[i-2];
		}
	}
	private static void addInArr(short c, int count, short[] arr) {
		for (int i = 0; i < 9; i++) {
			if (arr[i*2] == c) {
				arr[i*2 + 1]++;
				return;
			}else if (arr[i*2 + 1] < (short)count) {
				shiftItems(arr, i*2);
				arr[i*2] = c;
				arr[i*2+1] = (short) count;
				return;
			}else if (arr[i*2 + 1] == (short)count) {
				for (; i < 9; i++){
					if ((int)c < (int)arr[i*2]){
						shiftItems(arr, i*2);
						arr[i*2] = c;
						arr[i*2+1] = (short) count;
						return;
					} else if (arr[i*2] == c) {
						arr[i * 2 + 1]++;
						return;

					} else if ((int)c > (int)arr[i*2]) {
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		short[] arr = new short[65536];
		char[] array = str.toCharArray();
		int countUniItem = 0;
		for (int i = 0; i < str.length(); i++) {
			arr[array[i]]++;
		}
		short[] ret = new short[20];
		for (int i = 0; i < 65536; i++){
			if (arr[i] != 0)
				addInArr((short)i, (int)arr[i], ret);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println((char) ret[i*2] + " " + ret[i*2 + 1]);
		}
		out(ret);

	}
}

