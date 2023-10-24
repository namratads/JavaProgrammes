package questionpractice;

import java.util.Scanner;

public class Program9Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Alphabet");
        char alpha = sc.next().charAt(0);
        if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u' || alpha=='A' || alpha=='E' || alpha=='I' || alpha=='O' || alpha=='U') {
        	System.out.println("The Given Alphabet : "+alpha+" is Vowel");
        }
        else {
        	System.out.println("The Given Alphabet : "+alpha+" is not Vowel");
        }
	}

}
