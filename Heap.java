package sort;
/**
 * This class sorts through Comparable data types and extends the Helper class.
 * @author Immanuel Odisho
 * @see sort.Helper
 */
public class Heap extends Helper{
	/**
	 * Heap sort using Comparable. The algorithm used the link below as a reference to implement the sort.
	 * @param a - the input array containing jobs that need to be sorted.
	 * @param n - the size of the input array
	 * @see <a href="https://algs4.cs.princeton.edu/24pq/">https://algs4.cs.princeton.edu/24pq/</a>
	 */ 
	public static void sortHeap (Comparable[] a, int n ) 
	{
		for (int k = n/2; k >= 1; k--)
			sink(a,k,n);
		
		while(true)
		{
			if (n > 1){
				
			
			exchang(a,1,n);
			n = n -1;
			sink(a,1,n);
			}
			else {break;}
		}
		
		
		
	}
	
	private static void exchang(Comparable[] a, int i, int j) {
        Comparable temp = a[i-1];
        
        a[i-1] = a[j-1];
        
        a[j-1] = temp;
    }
	
	
	private static void sink(Comparable[] a, int x, int y)
	{
		while (true)
		{
			if (!(x*2 > y))
			{
			int j = 2*x;
			
            if (j < y && less(a,j, j+1)) j++;
            
            if (!less(a,x, j)) 
            	break;
            
            exchang(a, x, j);
            
            x = j;
			}
			else {break;}
			}
	}
	
	private static boolean less(Comparable[] a, int i, int j) {
       
		return a[i-1].compareTo(a[j-1]) < 0;
    }
	


}
