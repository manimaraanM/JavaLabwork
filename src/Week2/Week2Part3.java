package Week2;

public class Week2Part3 {
	public static void main(String[] args) {

		//write for loop that prints numbers from 1 to 9
		System.out.println("Print from 1 to 9");
		for (int i=1;i<10;i++){
			System.out.print(i +",");
		}
		//for loop to print from 10 to 0 backwards
		System.out.println("");
		System.out.println("Print from 10 to 0");
		for (int j=10;j>=0;j--) {
			System.out.print(j +",");
		}
		//for loop to print every other number from 0 to 100\
		System.out.println("");
		System.out.println("Print from 0 to 100");
		for (int k=0;k<=10;k+=2) {
			System.out.print(k +",");
		}
		//for loop that iterats from 0 to 100 and prints even if nbr is ever and odd if nbr is odd
		for(int x=0;x<=10;x++) {
			if(x%2==0) {
				System.out.println(x +"even");
			}
			else {
				System.out.println(x +"odd");
			}
		}
		
		int y=10;
		//System.out.println(x +"odd");
		//while loop that starts at 100 and iterates backwars by 1 untill it reaches 0
		//divide each number by 3 and print remainder to console
		while(y >=0) {
						System.out.println(y +" divide by 3 remainder is "+y%3);
						y --;
		}
		
		
		
	}

}
