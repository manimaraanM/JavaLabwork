package Week3;

public class Week3Part3 {
	public static void main(String[] args) {
		//write and test a method that takes an array of string and returns an array of int where each element matches the length of string at that 
		//position
		String s[]= {"William","Michael","Tony","David"};
		int len[]=stringLengthCalculator(s);
		display(s,len);
		
		
		//write and test a method that takes an array of string and returns true if sum of letters for all strings with an even amount of letters
		//is greater than sum of letters with odd amount of letters
		
		boolean result=sumLettersOddEven(s);
		System.out.println(result);
		
		//	write and test a method that returns true if string is plaindrome
		String palindromeString="malayalam";
		boolean palindrome=palindromeCheck(palindromeString);
		System.out.println(palindromeString +"is a palindrome: " +palindrome);
	}

	private static boolean sumLettersOddEven(String[] s) {
		boolean res=false;
		int sumEven=0;
		int sumOdd=0;
		for(String letters:s) {
			if(letters.length()%2==0) {
				sumEven+=letters.length();
			}
			else
				sumOdd+=letters.length();
		}
		System.out.println("Even sum is " +sumEven +" ,odd sum is " +sumOdd);
		if(sumEven>sumOdd)
			res=true;
		
		return res;
	
	}

	private static boolean palindromeCheck(String palindromeString) {
		// TODO Auto-generated method stub
		boolean ispalindrome=false;
		System.out.println(palindromeString.length());
		String s="";
		
		
		for(int i=palindromeString.length()-1;i>=0;i--) {
			//System.out.println(palindromeString.charAt(i));
			s+=palindromeString.charAt(i);
		}
		if(s.equals(palindromeString))
			ispalindrome=true;
		
		return ispalindrome;
	}

	private static int[] stringLengthCalculator(String[] s) {
		// TODO Auto-generated method stub
		int stringLength[]=new int[s.length];
		for (int i=0;i<s.length;i++) {
			stringLength[i]=s[i].length();
			
		}
		return stringLength;
	}
	
	public static void display(String[] s, int [] len) {
		for (int i=0;i<s.length;i++) {
			System.out.println(s[i] +" length is " +len[i]);
			}
	}

}
