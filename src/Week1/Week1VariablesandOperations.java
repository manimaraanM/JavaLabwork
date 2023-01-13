package Week1;

public class Week1VariablesandOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a variable to hold qty of available seats in plane
		int availablePlaneSeats=10;
		
		// variable to hold cost of groceries at checkout
		double costGrocery=45.24;
		// var to hold persons middle initial
		char middleIntial='N';
		
		// variable to hold true if hot outside and false for cold outside
		boolean outsideTemperatureHot=true;
		// variable to hold customers first name
		String firstName="Manimaran";
		// variable to hold street address
		String address="Bentonville, Arkansans";
		
		// print all variable to console
		System.out.println("Available seats left on Plan: " +availablePlaneSeats);
		System.out.println("Total cost of grocery: " +costGrocery);
		System.out.println("Weather is hot outside: " +outsideTemperatureHot);
		System.out.println("Customer First name: " +firstName);
		System.out.println("Customer Middle Intial: " +middleIntial);
		System.out.println("Customer address : " +address);

		//customer booked 2 plain seats and removed 2 seats from the available seat variable
		int bookedPlaneSeats=2;
		System.out.println("Seats Booked on Plane: " +bookedPlaneSeats);
		//availablePlaneSeats=availablePlaneSeats-bookedPlaneSeats;
		availablePlaneSeats -= bookedPlaneSeats;
		System.out.println("Available seats left on Plan after new Booking: " +availablePlaneSeats);
		
		//candy bar purchase add 2.15 to grocery total 
		double candy =2.15;
		System.out.println("Candy price: " +candy);
		//costGrocery=costGrocery+candy;
		costGrocery += candy;
		System.out.println("Total cost of grocery after candy purchase: " +costGrocery);
		
		//birth certificate incorrect, change intial
		middleIntial='M';
		System.out.println("Customer New Middle Intial: " +middleIntial);
		
		//season change update weather
		outsideTemperatureHot = !outsideTemperatureHot;
		System.out.println("Weather is hot outside: " +outsideTemperatureHot);
		
		//create a var full name with customer first name, intial, last name
		String lastName="Muthuswamy";
		String fullName= firstName + " "+ middleIntial +" " + lastName ;
		
		System.out.println("Customer Full Name: " +fullName);
		
		//print a line to console that introduce customer and say they live in this address
		System.out.println("Our customer " +fullName +" is residing in address " +address);
		
	}

}
