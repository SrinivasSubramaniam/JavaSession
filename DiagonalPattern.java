package test;

import java.util.Scanner;

public class DiagonalPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number from 1 to 100");
		int userValue = sc.nextInt();
		int num = 1;
		int row = 1;
		int rowfinalValue = 0;
		if (userValue > 0 && userValue <= 100) {
			for (int i = 1; i <= row; i++) {
				if (userValue < rowfinalValue + i) {
					break;
				} else {
					for (int j = 1; j <= i; j++) {
						System.out.print(num + " ");
						num++;
					}
					rowfinalValue = num - 1;
					System.out.println();
					row++;
				}
				
			}
		} else {
			System.out.println("Provided number is not between 1 to 100. Please renter");
		}
		sc.close();

	}

}
