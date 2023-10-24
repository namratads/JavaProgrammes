package questionpractice;

import java.util.Scanner;

public class Program5OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("The given number : "+num+" is Even number");
		}
		else {
			System.out.println("The given number : "+num+" is Odd number");
		}

	}

}
