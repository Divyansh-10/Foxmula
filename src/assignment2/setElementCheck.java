package assignment2;

import java.util.*;


public class setElementCheck {

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
		
		System.out.println("Enter no to be cheked in list: ");
		int check = sc.nextInt();
		
		
		System.out.println(set.contains(check));
		sc.close();

	}

}
