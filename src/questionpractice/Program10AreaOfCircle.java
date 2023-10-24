package questionpractice;

import java.util.Scanner;

public class Program10AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        int radius = sc.nextInt();
        double pi = 3.14;
        System.out.println("The Area of Circle is :"+(pi*radius*radius));
	}

}
