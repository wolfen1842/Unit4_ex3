package it391.unit4.exer;

import java.util.Scanner;

public class BinarySearchExercise {

	public static void main(String[] args) {
		int i, first, last, middle, n, search, array[];
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n = in.nextInt();
		array = new int[n];
		
		System.out.printf("Enter %d integers\n",n);
		
		for(i=0; i<n; i++) {
			array[i]=in.nextInt();
		}
		
		System.out.println("Enter value you want to find");
		search=in.nextInt();
		
		first = 0;
		last = n-1;
		middle = (first + last)/2;
		
		while(first<=last) {
			if(array[middle]<search)
				first=middle+1;
			else if (array[middle]==search)
			{
				System.out.printf("%d found at location %d.\n", search, (middle+1));
				break;
			}
			else
				last = middle-1;
			
			middle = (first + last)/2;
		}
		
		if(first>last)
			System.out.printf("%d is not present in the list.\n", search);
		
		in.close();
	}

}
