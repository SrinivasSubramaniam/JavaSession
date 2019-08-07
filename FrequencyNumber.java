package test;

import java.util.Scanner;

public class FrequencyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int number = sc.nextInt();
		int freq[] = new int[10];
		int freqCount = 0;
		boolean isFreqNotSame = false;
		int digit;		
		
		while (number > 0) {
			digit = number % 10;
			freq[digit]++;
			number = number / 10;
		}
		
		for (int i = 0; i < 10; i++) {
			if (freq[i] != 0) {
				if (freqCount == 0) {
					freqCount = freq[i];
				}

				if (freq[i] != freqCount) {
					isFreqNotSame = true;
					break;
				}

			}
		}

		if (isFreqNotSame == true) {
			System.out.println("Digits freq are not same");

		} else {
			System.out.println("Digits freq are  same");

		}
		sc.close();

	}
}
