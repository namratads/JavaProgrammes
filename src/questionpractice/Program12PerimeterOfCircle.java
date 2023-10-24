package questionpractice;

import java.util.Scanner;

public class Program12PerimeterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Radius of Circle");
       int radius = sc.nextInt();
       double pie = 3.14;
       System.out.println("The Perimeter of Circle is "+(2*pie*radius));
	}

}
