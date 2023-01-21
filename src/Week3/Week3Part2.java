package Week3;

import java.util.function.Function;

public class Week3Part2 {
	public static void main(String [] args) {
		
		//write & test a method that takes a string name and print greeting, method returns nothing
		String name="Hi";
		printString(name);
		
		//write & test a method that takes a string name and return greeting, do not print in method
		String name1=returnString(name);
		System.out.println(name1);
		
		//analyze diff between these two methods . what do you find and how they are different ?
		/**First method didnt have a return stmt and its a void Function.
				Second method had a return stmt which was captured on the call.
		**/
		
		//write and test a method that takes a string and an int and returns true , if nbr of letters in string is greater than int
		String test="Tonyy";
		int count =25;
		boolean result= cmpStrInt(test,count);
		System.out.println(result);
		
		//write and test a method that takes an array of string and a string and returns true if string passed exists in array
		String[] nameList= {"Mike","Will","Gary","Tony","Jim"};
		result = identifyString(nameList,test);
		System.out.println(test +"Is present in Array:" +result);
		
		
		//write and test a method that takes an array of int and returns smallest number in array
		int [] numbers= {25,60,34,56,78,90,12,43};
		int smallnbr= identifySmallNbr(numbers);
		System.out.println(smallnbr);
		
		// write and test a method that takes an array of double and returns average
		double [] numD= {1.4,2.6,3.0,4.8,5.9};
		double avg=averageCalc(numD);
		System.out.println("Average value is " +avg);
		
	}
	
	private static double averageCalc(double[] numD) {
		int sum=0;
		for(double d:numD) {
			sum += d;
		}
		return sum/numD.length;
	}

	public static void printString(String print) {
		System.out.println(print +" Greeting");
	}

	public static String returnString(String greeting) {
		String greet=greeting + " Greeting";
		return greet;
	}
	
	public static boolean cmpStrInt(String s,int x) {
		boolean cmpresult = false;
		if(s.length() > x) {
			cmpresult=true;
		}
		return cmpresult;	
	}
	
	public static boolean identifyString(String[] sArray,String sString) {
		boolean stringResult=false;
		for(String s:sArray) {
			if(s.equals(sString))
				stringResult=true;
		}
		
		return stringResult;
	}
	
	public static int identifySmallNbr(int[] x) {
		int smallnbr=0;
		for(int i=0;i<x.length;i++) {
			if(i==0) {
				smallnbr=x[i];
			}
			if(x[i]<smallnbr) {
				smallnbr=x[i];
			}
				
		}
		
		return smallnbr;
	}
}

