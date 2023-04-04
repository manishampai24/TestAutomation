package com.rishi.reader;

public class Fizz {
	
	public static void main(String[] args) {
		
		int n=100;
		
		for(int i=0;i<=n;i++)
		{
			if(i%15==0)
			
				System.out.print("FizzBuzz"+" ");
				
				else if(i%5==0)
				
					System.out.print("Buzz"+ " ");
					
					else if (i%3==0) 
						System.out.print("Pizz" + " ");
					else
						System.out.println(i+" ");
		}
	}
}