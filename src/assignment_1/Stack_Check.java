package assignment_1;

import java.util.*;


class Stack_methods
{
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	int s1_size = 0 , s2_size = 0;
	
	void size_checker()
	{
		if(s1_size == s2_size)
		{
			System.out.println("Stack 1 size: " +s1_size);
			System.out.println("Stack 2 size: " +s2_size);	
		}
	}
	
	boolean check_Empty(int stack_no)
	{
		if(stack_no == 1)
		return s1.isEmpty();
		
		else
			return s2.isEmpty();
	}
	
	void push(int data , int stack_no)
	{
		if(stack_no == 1)
		{
			s1.push(data);
			s1_size ++;
			size_checker();
		}
		
		else if(stack_no == 2)
		{
			s2.push(data);
			s2_size ++;
			size_checker();
		}
		
		else
		{
			System.out.println("Illegal stack Selection");
		}
	}
	
	void pop(int stack_no)
	{
		if(stack_no == 1)
		{
			s1.pop();
			s1_size --;
			size_checker();
		}
		
		else if(stack_no == 2)
		{
			s2.pop();
			s2_size --;
			size_checker();
		}
		
		else
		{
			System.out.println("Illegal stack Selection");
		}
	}
}

public class Stack_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack_methods m = new Stack_methods();
		boolean flag = true;
		while(flag)
		{
			System.out.println(" ");
			System.out.println("1 to PUSH ");
			System.out.println("2 to POP ");
			System.out.println("3 to CHECK IF EMPTY");
			System.out.println("4 to EXIT");
			int choice = sc.nextInt();
			switch(choice)                             //Switch Cases
			{
				case 1:
					System.out.println("Enter integer : ");
					int i = sc.nextInt();
					System.out.println("Enter Stack Number : ");
					m.push(i,sc.nextInt());
					break;
					
				case 2:
					System.out.println("Enter Stack Number : ");
					m.pop(sc.nextInt());
					break;
					
				case 3:
					System.out.println("Enter Stack Number : ");
					System.out.println(m.check_Empty(sc.nextInt()));
					break;
					
				case 4:
					flag = false;
					sc.close();
					break;
					
					default:
						System.out.println("!!!Invalid Choice!!! ");
		    }
		
		
		

	}
	}

}
