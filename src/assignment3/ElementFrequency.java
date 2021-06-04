/*Java Program to calculate frequency of each 
 * Element of an array and then sort by value and then printing it.
 */
package assignment3;

import java.util.*;

public class ElementFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedMap<Integer, Integer> sm = new TreeMap<>(); // Declaring HashMap with key-value pair
		Set set = null; // Initializing Set s with null
		Scanner sc = new Scanner(System.in);
		int[] arr = null; // Array Initialization

		boolean b = true;

		while (b) {
			System.out.println(
					"Enter 1 to create Array \nEnter 2 for calculating frequency \nEnter 3 for printing sorted list");
			System.out.println("Enter 4 to Exit");

			int choice = sc.nextInt();

			switch (choice) {

			case 1: // Creating an Integer Array
				System.out.println("Enter size of the array"); // Getting size of the array
				int size = sc.nextInt();
				arr = new int[size];

				System.out.println("Enter Integers: "); // Inserting elements in the array
				for (int i = 0; i < size; i++)
					arr[i] = sc.nextInt();
				break;

			case 2: // Calculating frequency of the elements
				for (int i : arr) // adding array elements to Hashmap
				{
					if (sm.containsKey(i) == true) { // if element is present then insert (element, frequency + 1);
						sm.put(i, sm.get(i) + 1);
						continue;
					}
					sm.put(i, 1); // else insert (element , 0)
				}
				set = sm.entrySet();
				break;

			case 3: // Printing elements sorted by frequency value

				System.out.println("\n");
				System.out.println("Sorted elements by frequency are as follows: ");

				ArrayList<Integer> list = new ArrayList<Integer>();
				LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();

				for (Map.Entry<Integer, Integer> value : sm.entrySet()) {
					list.add(value.getValue());
				}

				Collections.sort(list, new Comparator<Integer>() { // Overriding default comparison function
					@Override
					public int compare(Integer i1, Integer i2) {
						if (i1 > i2)
							return (1);
						else if (i2 > i1)
							return (-1);
						else
							return (0);
					}
				});

				for (int i : list) { // Comparing list w.r.t element frequecy and adding in sortedMap
					for (Map.Entry<Integer, Integer> entry : sm.entrySet()) {
						if (entry.getValue().equals(i)) {
							sortedMap.put(entry.getKey(), i);
						}
					}
				}

				System.out.println(sortedMap);
				System.out.println();
				break;

			case 4: // Breaking switch conditional loop
				b = false;
				sc.close();
				return;

			default:
				System.out.println("Invalid choice!!!!"); // default statement
				break;

			}
		}

	}

}
