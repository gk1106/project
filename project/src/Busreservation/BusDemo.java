package Busreservation;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) {
		int userOpt = 1;
		Scanner sc=new Scanner(System.in);
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to Exit");
			userOpt =sc.nextInt();

			
			if (userOpt==1)
			{
				System.out.println("Booking.....");
			}
		}
		
	}

}
