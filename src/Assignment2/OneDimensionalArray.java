package Assignment2;

import java.util.Scanner;

public class OneDimensionalArray {


		public static void main(String[] args) { // main method
			int c, n, t, a[], first, last, middle;

			Scanner in = new Scanner(System.in); // Taking user input
			System.out.println("Enter number of elements in array:");
			n = in.nextInt();

			a = new int[n]; //Instantiating an array of int using new operator

			System.out.println("Enter the integers");

			for (c = 0; c < n; c++) // Loop to store numbers in array
				a[c] = in.nextInt();

			System.out.println("\nEnter the integer to be search:");
			t = in.nextInt();

			first = 1;
			last = a.length; // find the length of array and assign into high

			middle = first + ((last - first) / 2); // find the middle position and assign into mid
												
			

			for (first = 1; first < last; first++) // for loop

			{
				if (a[middle] < c) // if t > a[mid] increase one in the middle value

				
					middle = middle + 1;
				 else if (a[middle] > t)// if t < a[mid] decrease 1 in the middle  value
										

				{
					middle = middle - 1;
				} else if (a[middle] == t) { // Here searching element in the array
					System.out.println("Integer is found");
					break; // if there element will found break this loop
				} else 
					last = middle - 1;
				
				middle = (first + last) / 2;
			}
			if (first > last)
				System.err.println("Integer is not found");
		}
	}

