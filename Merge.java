package sort;

import java.io.File;
import java.util.Scanner;
/**
 * This class sorts Comparable data types by implementing the Comparable class and using
 * Merge sort to sort through the array. This algorithm also uses auxillary algorithms that 
 * can be found in the Helper.java file.
 * @author Immanuel Odisho
 * @see sort.Helper
 */
public class Merge extends Helper{
	
	private static Comparable[] aux;
	
	
	/**
	 * Merge sort using Comparable. The algorithm used the link below as a reference to implement the sort.
	 * @param x - the input array containing jobs that need to be sorted.
	 * @param n - the size of the input array
	 * @see <a href="https://algs4.cs.princeton.edu/22mergesort/">https://algs4.cs.princeton.edu/22mergesort/</a> 
	 */
	public static void sortMerge ( Comparable[] x, int n ) {
		aux = new Comparable[n];
		sort(x,0,n-1);
	}
	
	private static void sort(Comparable[] a, int lo, int hi)
	{
		if (hi <= lo) 
			return;
		
		int mid = lo + (hi -lo)/2;
		
		sort(a,lo,mid);
		
		sort(a,mid+1,hi);
		
		merge(a,lo,mid,hi);
	}
	
	private static void merge(Comparable[] a, int lo, int mid, int hi)
	{
		int i = lo,j = mid+1;
		
		for (int p = lo; p <= hi; p++)
			aux[p] = a[p];

		for (int p = lo; p <= hi; p++)
		{
			if (i > mid) 
			{a[p] = aux[j++];}
			
			else if (j > hi) 
			{a[p] = aux[i++];}
			
			else if (less(aux[j],aux[i])) 
			{a[p] = aux[j++];}
			
			else {a[p] = aux[i++];}
		}
	}
	
	

	}
	

