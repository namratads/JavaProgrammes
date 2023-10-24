package questionpractice;

public class Program7LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2016;
	    
	    		if(year%100==0 && year%400==0) {
			System.out.println(year + " is Leap year");
		}
	    	
		else if(year%4==0 && year%100!=0){
			System.out.println(year + " is Leap year");			
		   }
		else {
			System.out.println(year + " is not Leap year");	
		}

	}

}
