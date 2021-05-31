package assignment2;

import java.util.*;

public class treeSetTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of Elements: ");
		int no = sc.nextInt();
		
		System.out.println("Enter numbers: ");
		for(int i=0 ; i<no ; i++)
		{
			set.add(sc.nextInt());
		}
		

		Iterator itr = set.iterator();                  //Using Iterator class
		while(itr.hasNext())                      //TreeSet print elements in order
		System.out.println(itr.next());


	}

}
