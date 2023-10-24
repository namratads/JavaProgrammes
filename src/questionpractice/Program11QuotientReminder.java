package questionpractice;

import java.util.Scanner;

public class Program11QuotientReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		System.out.println("The Quotient is "+ (num1/num2));
		System.out.println("The Reminder is "+ (num1%num2));
		

	}

}
