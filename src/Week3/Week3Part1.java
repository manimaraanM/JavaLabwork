package Week3;

public class Week3Part1 {
public static void main(String[] args) {
	//create array with values 1,5,2,8,13,6
	int[] numbers= {1,5,2,8,13,6};
	

	//print first element in array
	System.out.println(numbers[0]);
	
	//print last element in array without using number 5
	System.out.println(numbers[numbers.length-1]);
	
	//print element in array at position 6. what happens?
	//System.out.println(numbers[6]); //Index out of bound error
	
	//print element in array at position -1. what happens?
	//System.out.println(numbers[-1]);//Index out of bound error
	
	//write traditional for loop that prints each element in array
	System.out.println("Traditional For Loop");
	for(int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
	}
	
	//write enhanced for loop that prints each element in array
	System.out.println("Enhanced For Loop");
	for(int num:numbers) {
		System.out.println(num);
	}
	
	//create new var called sum , write a loop that adds each element in array to sum
	int sum=0;
	int looper=0;
	while(looper<numbers.length) {
		sum+=numbers[looper];
		looper++;
	}
	System.out.println(sum);
	
	//create var called average and assign average value of array to it
	double average=sum/numbers.length;
	System.out.println(average);
	
	//write enhanced for loop that prints each number in array only if number is odd
	System.out.println("Enhanced For Loop");
	for(int num:numbers) {
		if(num%2==0)
		System.out.println(num);
	}
	
	//create an array that includes "Sam","Sally","Thomas","Robert"
	String[] names=new String[4];
	names[0]= "Sam";
	names[1]="Sally";
	names[2]="Thomas";
	names[3]="Robert";
	System.out.println(names[3]);
	
	//calculate sum of all letter in new array
	int sumString=0;
	for(String sumletters:names) {
		sumString +=sumletters.length();
		System.out.println(sumletters);
	}
	System.out.println(sumString);
	
	
}
}
