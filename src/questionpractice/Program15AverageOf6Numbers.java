package questionpractice;

import java.util.Scanner;

public class Program15AverageOf6Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Number");
		int num3 = sc.nextInt();
		System.out.println("Enter the Forth Number");
		int num4 = sc.nextInt();
		System.out.println("Enter the Fifth Number");
		int num5 = sc.nextInt();
		System.out.println("Enter the Sixth Number");
		int num6 = sc.nextInt();
		double average = ((num1+num2+num3+num4+num5+num6)/6);
		System.out.println("The Average of Given Six Numbers is "+average);
		
	}

}
