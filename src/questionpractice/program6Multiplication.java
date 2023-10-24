package questionpractice;

import java.util.Scanner;

public class program6Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		int multi = 1;
		System.out.println("Multiplication table of Given number is : ");
		for(int i=1; i<11; i++) {
			multi = num * i;
			System.out.println(multi);
		}

	}

}
