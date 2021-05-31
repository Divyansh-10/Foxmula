package assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class hashSetTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of Elements: ");
		int no = sc.nextInt();
		
		System.out.println("Enter numbers: ");
		for(int i=0 ; i<no ; i++)
		{
			set.add(sc.nextInt());
		}
		
		Iterator itr = set.iterator();                  //Using Iterator class
		while(itr.hasNext())                      
		System.out.println(itr.next());

	}

}
