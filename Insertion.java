package sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * This class uses Insertion sort to sort through Comparable types and Job types. The class extends the Helper class in order
 * to use its auxillary methods.
 * @author Immanuel Odisho
 * @see sort.Helper
 */
public class Insertion extends Helper{
	/**
	 * Regular insertion sort. The algorithm used the link below as a reference to implement the sort.
	 * @param x - the input array containing jobs that need to be sorted.
	 * @see <a href="https://algs4.cs.princeton.edu/21elementary/">https://algs4.cs.princeton.edu/21elementary/</a>
	 */
	public static void sortInsert ( Job[] x ) {
		int n = x.length;
		for (int i = 1; i < n; i++)
		{
			for (int j = i; j > 0 && less(x[j],x[j-1]); j--)
				exchange(x,j,j-1);
		}

	}
	
	
	/**
	 * Insertion sort using Comparable. The algorithm used the link below as a reference to implement the sort.
	 * @param x - the input array containing jobs that need to be sorted.
	 * @param n - the size of the input array
	 * @see <a href="https://algs4.cs.princeton.edu/21elementary/">https://algs4.cs.princeton.edu/21elementary/</a>
	 */
	public static void sortComparable ( Comparable<Job>[] x, int n ) {
		
		for (int i = 1; i < n; i++)
		{
			for (int j = i; j > 0 && less(x[j],x[j-1]); j--)
				exchange(x,j,j-1);
		}
		
		
	}
	/**
	 * Insertion sort with binary search for insertions. The algorithm used the link below as a reference to implement the sort.
	 * @param x - the input array containing jobs that need to be sorted.
	 * @param n - the size of the input array
	 * @see <a href="https://www.geeksforgeeks.org/binary-insertion-sort/">https://www.geeksforgeeks.org/binary-insertion-sort/</a>
	 */
	public static void sortBinary ( Comparable[] x, int n ) {
		
		int point, i, y;
	    Comparable temp;

	    for (i = 1; i < n; i++) {
	        point = BinarySearch(x, 0, i, x[i]);
	        
	        temp = x[i];
	        
	        for (y = i - 1; y >= point; y--)
	            x[y + 1] = x[y];
	        
	        x[point] = temp;
	    }
		
	}

	private static int BinarySearch (Comparable[] a, int lo, int hi, Comparable key)
	{
	    int mid;

	    if (lo == hi)
	        return lo;

	    mid = lo+((hi - lo)/2);

	    if (key.compareTo(a[mid]) > 0)
	    	
	        return BinarySearch (a, mid + 1, hi, key);
	    
	    else if (key.compareTo(a[mid]) < 0)
	        return BinarySearch (a, lo, mid, key);
	    return mid;
	}
	

}


