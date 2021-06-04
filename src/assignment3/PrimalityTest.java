package assignment3;

import java.util.Scanner;
import java.io.*;

public class PrimalityTest {
	
	
	/*
	 * isPrime Method is bsaed on proof that if number A divides number 2 
	 * then number 1 is representable in form of: number 1 = factor A * factor B.
	 * 
	 *  So if we counter factor A, we already know that there is another factor B also present.
	 *  So we can shorten our traveral from N to sqrt(n).
	 *
	 */
	static boolean isPrime(long n)        //Time Complexity : O(n*sqrt(n))
	{
		int count = 0;
		
		
		for(int i=1 ; i*i <= n ; i++)        // loop: 1 -> sqrt(n)
		{
			if(n % i == 0)
			{
				if(i*i == n)         //handling cases such as 25 = 5 * 5..where both factors are equal
					count += 1;
				else
					count += 2;    //else count += 2 for 2 factors
			}
		}
		
		if(count == 2)       //Prime number must posses only 2 factors
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Primality Test");
		long no = sc.nextInt();
		
		try
		{
			if(isPrime(no) == true)
			{
				throw new InvalidNumberException("Exception: \n Number is Prime..hence Invalid");
			}
			else
			{
				System.out.println("Valid Number");
			}
		}
		catch(InvalidNumberException e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
