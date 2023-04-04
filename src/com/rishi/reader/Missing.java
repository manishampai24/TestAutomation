package com.rishi.reader;

public class Missing {
	
	public static void main(String[] args) {
		
		
		int []number= {1,2,3,5};
		
		int sum=0;
		for(int i=0;i<number.length;i++)
		{
			sum=sum+number[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=0;j<=5;j++)//1+2+3+4+5
		{
			sum1=sum1+j;//15-11=4
			
		}
		System.out.println("missing number is "+(sum1-sum));
			
		}
}
		
		
		
		
		
		
	