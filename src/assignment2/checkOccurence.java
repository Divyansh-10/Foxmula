package assignment2;

import java.util.*;

public class checkOccurence {

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
	
		System.out.println("Enter no to check its occurence: ");
		int occ = sc.nextInt();
		
		int occurence = 0;
		
		Iterator itr = arr.iterator(); 
		
		while(itr.hasNext())  
		{
			
		if(itr.next().equals('\0'))
			break;
		
		 if(itr.next().equals(occ))
			 occurence ++ ;
	 
		}
		
		System.out.println("The no of occurences of number " +occ+ ": "+occurence);

		
		

	}

}
