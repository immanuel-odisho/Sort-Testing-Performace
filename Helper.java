package sort;
/**
 * This class contains many auxillary methods that are found and used in other classes and was created in order to make the program more understandable 
 * and modular. 
 * @author Immanuel Odisho
 * 
 */
public class Helper {
	/**
	 * This method will check if one Job type is less than the other
	 * @param a - Job data type
	 * @param b - Job data type
	 * @return - returns true if a is less than b, else it will return false
	 */
	public static boolean less(Job a, Job b)
	{
		int x = -1;
		if (a.getTime() > b.getTime())
			return false;
		else if (a.getTime() < b.getTime())
			return true;
		else if (a.getID() == b.getID()) {x = 0;}
		
		else
		{
			int len = (a.getID().length() < b.getID().length() ? a.getID().length() : b.getID().length());
			
			int i = 0;
			while (i != len)
			{
				if (a.getID().charAt(i) < b.getID().charAt(i)) {return true;}
				else if (a.getID().charAt(i) > b.getID().charAt(i)){return false;}
				else i++;
				
				
			}
			
			if (len == a.getID().length()) {x = -1;}
			else x = 1;
			
			return x == -1 ? true : false;
			
			
		}
		return false;
	}
	/**
	 * This method exchanges two elements in a Job[] array using their indices
	 * @param a -  an array of Job data type
	 * @param i - the index of the first element
	 * @param j - the index of the second element
	 */
	public static void exchange(Job[] a, int i, int j)
	{
		Job t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	/**
	 * This method is an overload method and will check if one Comparable type is less than another
	 * @param a - a comparable type
	 * @param b - the other comparable type
	 * @return - will return true if a is less than b, else it will return false
	 */
	public static boolean less(Comparable a, Comparable b)
	{return a.compareTo(b) < 0;}
	
	/**
	 * This method will exchange two elements in a Comparable[] array using their indices
	 * @param a - an array of Comparable types
	 * @param i - the index of the first comparable element
	 * @param j - the index of the second comparable element
	 */
	public static void exchange(Comparable[] a, int i, int j)
	{
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	/**
	 * This method will check if an array of Comparable types is sorted
	 * @param a - the array to be checked
	 * @return - will return true if the array is sorted, else false
	 */
	public static boolean isSorted(Comparable a[])
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			if (a[i].compareTo(a[i+1]) > 0) {return false;}
		}
			return true;
	}
	
	
	
}
