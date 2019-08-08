import java.util.Scanner;

public class ConvertDaysInToYearsWeeksWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter days");
		int days=sc.nextInt();
		 int years = (days / 365);
	        int weeks = (days % 365) / 7;
	            days  = (days % 365) % 7;

	        
	        System.out.println("Year/s = " + years);
	        System.out.println("Week/s = " + weeks);
	        System.out.println("Day/s  = " + days);
	    

	}

}
