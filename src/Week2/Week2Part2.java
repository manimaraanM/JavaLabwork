package Week2;
import java.util.Scanner;

public class Week2Part2 {
	public static void main(String [] args) {
		
		//create var loyalityMemberStatus and assign SILVER
		//loyalityMemberDiscount and assign 0.0
		//use Switch to set loyalityMemberDiscount based on loyalityMemberStatus
		//Silver is 0.10 , GOLD is 0.15,PLATINUM is 0.25
		
		String loyalityMemberStatus="Silver";
		double loyalityMemberDiscount=0.0;
		
		switch(loyalityMemberStatus) {
			case "Silver":
				loyalityMemberDiscount=0.10;
				break;
			case "Gold":	
				loyalityMemberDiscount=0.15;
				break;
			case "Platinum":
				loyalityMemberDiscount=0.25;
				break;
			default:
				loyalityMemberDiscount=0.00;
				break;				
		}
			
		System.out.println(loyalityMemberStatus +" " +loyalityMemberDiscount);
		
		//var billTotal and assign value
		//var adjustedTotal and assgin the billtotal minus 	loyalityMemberDiscount percent of billTotal
		//if adjustedTotal > 500, then upgrade loyalityMemberStatus from silver to Gold or Gold to Platinum
		
		double billTotal=800.00;
		double adjustedTotal = billTotal - (loyalityMemberDiscount * billTotal);
		
		billTotal = billTotal - adjustedTotal;
		System.out.println("billTotal is : " +billTotal +" adjusted Total : " +adjustedTotal);
		//adjustedTotal=billTotal - 
		if(billTotal > 500) {
			if(loyalityMemberStatus.equals("Silver")) {
				loyalityMemberStatus="Gold";
			}
			else if (loyalityMemberStatus.equals("Gold"))
			{
				loyalityMemberStatus="Platinum";
			}
		}
		
		System.out.println("Upgraded loyalityMemberStatus :" +loyalityMemberStatus);
		
		//two var username and password
		//create condition that prints "login successful" , if username is "Tommy123" and password is "12345"
		//else print "access denied"
		//String username="Tommy123";
		//String password="12345";
		Scanner s=new Scanner(System.in);
		System.out.print("Enter username: ");
		String username= s.nextLine();
		System.out.print("Enter password: ");
		String password=s.nextLine();
		s.close();
		
		
		if(username=="Tommy123" && password=="12345") {
			System.out.println("login successfull");
		}
		else
		{
			System.out.println("access denied");
		}
			
		
		
		
		
		
	}

}
