package questionpractice;

import java.util.Scanner;

public class Program13PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Any Number");
		int num = sc.nextInt();
		int num1 = num;
		System.out.println("Enter of Power");
		int power = sc.nextInt();
		for(int i=1; i<+power; i++) {
			num = num*num1;
		}
		System.out.println("The Power of Given Number is "+num);

	}

}
