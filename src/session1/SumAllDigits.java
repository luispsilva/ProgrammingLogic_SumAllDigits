package session1;

import java.util.Scanner;

public class SumAllDigits {

	public static void main(String[] args) {
		
		String numbers;
		int total = 0;
		int stop = -1;
		
		Scanner sc = new Scanner(System.in);
		
		while(stop != 0) {
			
			System.out.println("Type numbers:");
			numbers = sc.nextLine();
			
			try {
				stop = Integer.parseInt(numbers);
			} catch (NumberFormatException e) {
				System.out.println("The program allows integer number only");
			}
			
			for (char c: numbers.toCharArray()) {
				total = total + Integer.parseInt(String.valueOf(c));
			}
			
			System.out.println("The result of the sum is:" + total);
		}
		
		sc.close();

	}

}
