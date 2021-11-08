package preWorkAssignmentSolution;

import java.util.Scanner;

public class PreWorkAssignmentSolution {
	public void palindromeNumber(String number) {
		int numberLength = number.length();
		int loopLength = (int) Math.ceil(numberLength / 2);
		int i;

		for (i = 0; i < loopLength; i++) {
			if (number.charAt(i) != number.charAt(numberLength - (i + 1))) {
				break;
			}
		}

		if (i == loopLength) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not a palindrome number");
		}
	}

	public void starPattern(int number) {
		for (int i = number; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void primeNumber(int number) {
		int loopLength = (int) Math.floor(number / 2);
		int i;

		for (i = 2; i <= loopLength; i++) {
			if (number % i == 0) {
				break;
			}
		}

		if (i > loopLength) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime number");
		}
	}

	public void fibonacciSeries(int size) {
		if (size <= 2) {
			System.out.println("Invalid size");
		} else {
			int num1 = 0;
			int num2 = 1;

			System.out.print(num1 + "\t" + num2 + "\t");

			for (int i = 1; i <= size - 2; i++) {
				int newNum = num1 + num2;
				num1 = num2;
				num2 = newNum;
				System.out.print(newNum + "\t");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		PreWorkAssignmentSolution obj = new PreWorkAssignmentSolution();

		do {
			System.out.println("Enter your choice from below list:");
			System.out.println("1. Check for palindrome number");
			System.out.println("2. Print star pattern");
			System.out.println("3. Check for prime number");
			System.out.println("4. Print fibonacci series");
			System.out.println("Or, Enter 0 to exit");

			choice = scan.nextInt();

			switch (choice) {
			case 0:
				choice = 0;
				break;
			case 1:
				System.out.println("Check for palindrome number");
				System.out.print("Enter number: ");
				obj.palindromeNumber(scan.next());
				break;
			case 2:
				System.out.println("Print star pattern");
				System.out.print("Enter number of rows: ");
				obj.starPattern(scan.nextInt());
				break;
			case 3:
				System.out.println("Check for prime number");
				System.out.print("Enter number: ");
				obj.primeNumber(scan.nextInt());
				break;
			case 4:
				System.out.println("Print fibonacci series");
				System.out.print("Enter series size (must be greater than 2): ");
				obj.fibonacciSeries(scan.nextInt());
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 0);

		System.out.println("Exit");

		scan.close();
	}
}
