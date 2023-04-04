package com.rishi.reader;

import java.util.Arrays;

public class Second {
	public static void main(String[] args) {	
		
		//create 2variable to hold  largest and 2nd largest value
		int [] number= {10,40,678,90,89};
		 int largest =0;
		 int secondlargest=0;
		 
		 //using for loop for iteration each integer value 
		 
		 for(int i=0;i<number.length;i++)
		 {
			 if(number[i]>largest)
			 {
				 secondlargest=largest;
				 largest=number[i];
			 } else if (number[i]>secondlargest) {
				 secondlargest=number[i];
			 }
		 }
		 System.out.println(Arrays.toString(number));
		 System.out.println("the second largest element is "+secondlargest);
	}
}	