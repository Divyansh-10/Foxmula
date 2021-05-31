package assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class checkKSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of Elements: ");
		int no = sc.nextInt();
		
		System.out.println("Enter numbers: ");
		for(int i=0 ; i<no ; i++)
		{
			arr.add(sc.nextInt());
		}
		
		System.out.println("Enter value of K: ");
		int k = sc.nextInt();
		
		Iterator itr = arr.iterator(); 
	
		while(itr.hasNext())  
		{
			
		if(itr.next().equals('\0'))
			break;
		
		System.out.println("The pair value is: ");
		
		 
		}
		
		

	}

}
