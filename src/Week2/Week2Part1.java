package Week2;

public class Week2Part1 {
	public static void main(String [] args) {
	//var named age and assign 14
	int age=18;
	
	//print boolean expression age >=16 to console and note results
	
	System.out.println(age>=16);
	// change age to 18 and run again
	
	//use condition and print "You can drive if age is >= 16 
	//"You cannot driver" oterhwise
	//change age value adn re-run
	
	if(age >=16) {
		System.out.println("You can drive if age is >= 16");
	}
	else
	{
		System.out.println("You cannot drive");
	}
	
	//add new vari hasLicence before condition 
	//change boolean expression to include need for hasLicense to be true
	//change age and hasLicense values and re-run
	Boolean hasLicence=true;
	System.out.println(hasLicence);
	
	if(age >=16 && hasLicence) {
		System.out.println("You can drive");
	}
	else
	{
		System.out.println("You cannot drive");
	}
	
	//var costOfMilk and thirstLevel
	//conditoon to print "Milk Please" if cost is less than 2.50 or if thirstlevel grater than 6
	//print Nothanks otherwise
	//change values and not diff
	double costOfMilk=4.50;
	int thirstLevel=4;
	if(costOfMilk<2.50 || thirstLevel>6) {
		System.out.println("Milk Please");
	}
	else
	{
		System.out.println("No thanks");
	}
	//var numberOfCookies and numberOfchildren
	//evenly distribute all cookies to children and as adult keep get to keep yourself remaining cookies
	//use condition to print following for remaining:
	//if there are 0 cookies ,print Sad Face
	//less than 2 cookies , print Yes
	// less than 5 , print Wohoo
	//5 or more , Jackpot
	int numberOfCookies=7;
	int numberOfChildren=2;
	int perChild=numberOfCookies/numberOfChildren;
	int adult=numberOfCookies%numberOfChildren;
	System.out.println(perChild);
	if(adult ==0)
			System.out.println("Sad Face");
			else if(adult>0 && adult<2)
				System.out.println("Yes");
			else if (adult>=2 && adult<5)
				System.out.println("Wohoo");
			else 
				System.out.println("Jackpot");
	
	System.out.println(adult);
	
}

}