package day6;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms in the fibonacci series: ");
		int terms = scanner.nextInt();
		int a=0, b=1;
		System.out.println("Fibonacci Sequence: ");
		scanner.close();
		
		for(int i=1; i<=terms; i++) {
			
			System.out.println(a + " ");
			int nextNum = a+b;
			a = b;//replacing the value of a with the second number(b)
			b = nextNum; //replacing the value of b with the next number(nextNum)
			
		}

	}

}
