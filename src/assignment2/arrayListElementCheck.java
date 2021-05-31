package assignment2;

import java.util.*;

public class arrayListElementCheck {

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
		
		System.out.println("Enter no to be cheked in list: ");
		int check = sc.nextInt();
		
		
		System.out.println(arr.contains(check));
		sc.close();
		

	}

}
