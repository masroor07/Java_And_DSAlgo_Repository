package arrays;

import java.util.Scanner;

public class ArrayFunctions {
	
	public static int[] insertX(int n, int arr[],
            int x, int pos)
{
int i;

// create a new array of size n+1
int newarr[] = new int[n + 1];

// insert the elements from
// the old array into the new array
// insert all elements till pos
// then insert x at pos
// then insert rest of the elements
		for (i = 0; i < n + 1; i++) {
		if (i < pos - 1)
		newarr[i] = arr[i];
		else if (i == pos - 1)
		newarr[i] = x;
		else
			newarr[i] = arr[i - 1];
		}
		return newarr;
	}
	
		public static void display(int arr[], int n) {
		for (int i = 0; i < n; i++)
		{
			
			System.out.print(arr[i]+ " ");
		}
			System.out.println();
	}
		
		int linearSearch(int arr[], int size, int element)
		{
			for (int i = 0; i < size; i++)
			{
				if (arr[i] == element)
					return i;
			}
			return -1;
		}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int a[]= new int[n];

	System.out.println("Enter the " +n +" elements of the array: ");
		for (int i=0;i<=a.length-1;i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("Current array= ");
		for (int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println("Sum of elements of the array= ");
		int sum=0;
		for (int i=0;i<=a.length-1;i++) {
			sum= sum+a[i];
		}
		
		System.out.println(sum);
	
		System.out.println("Element to be inserted: ");
		int x= sc.nextInt();
		
		System.out.println("Index: ");
		int pos= sc.nextInt();
		
		  a = insertX(n, a, x, pos);
		  
	       System.out.println("Updated array: ");
		  for (int i=0; i<=a.length-1; i++) {
				System.out.print(a[i]+ " ");
		  }			
//				display(a, n);
//		  }
	}

}

