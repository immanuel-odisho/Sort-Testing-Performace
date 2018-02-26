package sort;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This test class will test the sorting algorithms sortInsert, sortBinary, sortHeap, sortMerge and sortComparable and check if they 
 * all pass and sort arrays of various input sizes.
 * @author Immanuel Odisho
 * @see sort.Helper
 */
public class SortTest extends Helper{

	public Job[] jobs1 = new Job[16];
	public Job[] jobs2 = new Job[64];
	public Job[] jobs3 = new Job[256];
	public Job[] jobs4 = new Job[1024];
	public Job[] jobs5 = new Job[4096];
	public Job[] jobs6 = new Job[16384];
	public Job[] jobs7 = new Job[65536];
	public Job[][] jobs = {jobs1,jobs2,jobs3,jobs4,jobs5,jobs6,jobs7};
	
	
	
	@Before
	public void setUp() throws Exception {
		
		try {
		File file = new File("data/a1_in.txt");
		Scanner s = new Scanner(file);
		int q = 0;
		

			while (s.hasNext())
			{
			String line = s.next();
			String[] result = line.split("[{,}]");
			int i = 0;
			for (int x=0; x<result.length-1; x++)
			if (!result[x].isEmpty() && !result[x+1].isEmpty())  
				 i++;
			
			i = 0;
			for (int x=0; x<result.length-1; x++)
				if (!result[x].isEmpty() && !result[x+1].isEmpty())
				{    jobs[q][i] = new Job(result[x],Integer.parseInt(result[x+1]));
					 i++;
				}

			q++;
		} }catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
 

	@After
	public void tearDown() throws Exception {

	}
	/**
	 * This method will test if Merge sort sorts various arrays
	 * @throws Exception
	 */
	@Test
	public void testMerge() throws Exception
	{
		long time6 = System.nanoTime();
		Merge.sortMerge(jobs[6], jobs[6].length);
		time6 = (System.nanoTime() - time6);
		long time5 = System.nanoTime();
		Merge.sortMerge(jobs[5], jobs[5].length);
		time5 = (System.nanoTime() - time5);
		long time4 = System.nanoTime();
		Merge.sortMerge(jobs[4], jobs[4].length);
		time4 = (System.nanoTime() - time4);
		long time3 = System.nanoTime();
		Merge.sortMerge(jobs[3], jobs[3].length);
		time3 = (System.nanoTime() - time3);
		long time2 = System.nanoTime();
		Merge.sortMerge(jobs[2], jobs[2].length);
		time2 = (System.nanoTime() - time2);
		long time1 = System.nanoTime();
		Merge.sortMerge(jobs[1], jobs[1].length);
		time1 = (System.nanoTime() - time1);
		long time0 = System.nanoTime();
		Merge.sortMerge(jobs[0], jobs[0].length);
		time0 = (System.nanoTime() - time0);
		System.out.println("Merge sort results:");
		System.out.println("Time for size 2^4 (seconds):  " + time0/1e9);
		System.out.println("Time for size 2^6 (Seconds):  " + time1/1e9);
		System.out.println("Time for size 2^8 (seconds):  " + time2/1e9);
		System.out.println("Time for size 2^10 (seconds): " + time3/1e9);
		System.out.println("Time for size 2^12 (seconds): " + time4/1e9);
		System.out.println("Time for size 2^14 (seconds): " + time5/1e9);
		System.out.println("Time for size 2^16 (seconds): " + time6/1e9);
		System.out.println();
		assertTrue(isSorted(jobs[6]));
		assertTrue(isSorted(jobs[5]));
		assertTrue(isSorted(jobs[4]));
		assertTrue(isSorted(jobs[3]));
		assertTrue(isSorted(jobs[2]));
		assertTrue(isSorted(jobs[1]));
		assertTrue(isSorted(jobs[0]));
			
			

			System.out.println();
	}
	/**
	 * This method will test if sortBinary sorts various arrays
	 * @throws Exception
	 */
	@Test
	public void testInsertBinary() throws Exception
	{
		long time6 = System.nanoTime();
		Insertion.sortBinary(jobs[6], jobs[6].length);
		time6 = (System.nanoTime() - time6);
		long time5 = System.nanoTime();
		Insertion.sortBinary(jobs[5], jobs[5].length);
		time5 = (System.nanoTime() - time5);
		long time4 = System.nanoTime();
		Insertion.sortBinary(jobs[4], jobs[4].length);
		time4 = (System.nanoTime() - time4);
		long time3 = System.nanoTime();
		Insertion.sortBinary(jobs[3], jobs[3].length);
		time3 = (System.nanoTime() - time3);
		long time2 = System.nanoTime();
		Insertion.sortBinary(jobs[2], jobs[2].length);
		time2 = (System.nanoTime() - time2);
		long time1 = System.nanoTime();
		Insertion.sortBinary(jobs[1], jobs[1].length);
		time1 = (System.nanoTime() - time1);
		long time0 = System.nanoTime();
		Insertion.sortBinary(jobs[0], jobs[0].length);
		time0 = (System.nanoTime() - time0);
		System.out.println("Binary insertion sort results:");
		System.out.println("Time for size 2^4 (seconds):  " + time0/1e9);
		System.out.println("Time for size 2^6 (Seconds):  " + time1/1e9);
		System.out.println("Time for size 2^8 (seconds):  " + time2/1e9);
		System.out.println("Time for size 2^10 (seconds): " + time3/1e9);
		System.out.println("Time for size 2^12 (seconds): " + time4/1e9);
		System.out.println("Time for size 2^14 (seconds): " + time5/1e9);
		System.out.println("Time for size 2^16 (seconds): " + time6/1e9);
		assertTrue(isSorted(jobs[6]));
		assertTrue(isSorted(jobs[5]));
		assertTrue(isSorted(jobs[4]));
		assertTrue(isSorted(jobs[3]));
		assertTrue(isSorted(jobs[2]));
		assertTrue(isSorted(jobs[1]));
		assertTrue(isSorted(jobs[0]));
		}

	

	
	/**
	 * This method will test is Heapsort sorts various arrays
	 * @throws Exception
	 */
	@Test
	public void testHeapSort() throws Exception
	{
		long time6 = System.nanoTime();
		Heap.sortHeap(jobs[6], jobs[6].length);
		time6 = (System.nanoTime() - time6);
		long time5 = System.nanoTime();
		Heap.sortHeap(jobs[5], jobs[5].length);
		time5 = (System.nanoTime() - time5);
		long time4 = System.nanoTime();
		Heap.sortHeap(jobs[4], jobs[4].length);
		time4 = (System.nanoTime() - time4);
		long time3 = System.nanoTime();
		Heap.sortHeap(jobs[3], jobs[3].length);
		time3 = (System.nanoTime() - time3);
		long time2 = System.nanoTime();
		Heap.sortHeap(jobs[2], jobs[2].length);
		time2 = (System.nanoTime() - time2);
		long time1 = System.nanoTime();
		Heap.sortHeap(jobs[1], jobs[1].length);
		time1 = (System.nanoTime() - time1);
		long time0 = System.nanoTime();
		Heap.sortHeap(jobs[0], jobs[0].length);
		time0 = (System.nanoTime() - time0);
		System.out.println("Heap sort results:");
		System.out.println("Time for size 2^4 (seconds):  " + time0/1e9);
		System.out.println("Time for size 2^6 (Seconds):  " + time1/1e9);
		System.out.println("Time for size 2^8 (seconds):  " + time2/1e9);
		System.out.println("Time for size 2^10 (seconds): " + time3/1e9);
		System.out.println("Time for size 2^12 (seconds): " + time4/1e9);
		System.out.println("Time for size 2^14 (seconds): " + time5/1e9);
		System.out.println("Time for size 2^16 (seconds): " + time6/1e9);
		assertTrue(isSorted(jobs[6]));
		assertTrue(isSorted(jobs[5]));
		assertTrue(isSorted(jobs[4]));
		assertTrue(isSorted(jobs[3]));
		assertTrue(isSorted(jobs[2]));
		assertTrue(isSorted(jobs[1]));
		assertTrue(isSorted(jobs[0]));
		System.out.println();
		}


	/**
	 * This method will test is sortComparable sorts various arrays
	 * @throws Exception
	 */
	@Test
	public void testInsertComparable() throws Exception
	{
		long time6 = System.nanoTime();
		Insertion.sortComparable(jobs[6], jobs[6].length);
		time6 = (System.nanoTime() - time6);
		long time5 = System.nanoTime();
		Insertion.sortComparable(jobs[5], jobs[5].length);
		time5 = (System.nanoTime() - time5);
		long time4 = System.nanoTime();
		Insertion.sortComparable(jobs[4], jobs[4].length);
		time4 = (System.nanoTime() - time4);
		long time3 = System.nanoTime();
		Insertion.sortComparable(jobs[3], jobs[3].length);
		time3 = (System.nanoTime() - time3);
		long time2 = System.nanoTime();
		Insertion.sortComparable(jobs[2], jobs[2].length);
		time2 = (System.nanoTime() - time2);
		long time1 = System.nanoTime();
		Insertion.sortComparable(jobs[1], jobs[1].length);
		time1 = (System.nanoTime() - time1);
		long time0 = System.nanoTime();
		Insertion.sortComparable(jobs[0], jobs[0].length);
		time0 = (System.nanoTime() - time0);
		System.out.println("sortComp sort results:");
		System.out.println("Time for size 2^4 (seconds):  " + time0/1e9);
		System.out.println("Time for size 2^6 (Seconds):  " + time1/1e9);
		System.out.println("Time for size 2^8 (seconds):  " + time2/1e9);
		System.out.println("Time for size 2^10 (seconds): " + time3/1e9);
		System.out.println("Time for size 2^12 (seconds): " + time4/1e9);
		System.out.println("Time for size 2^14 (seconds): " + time5/1e9);
		System.out.println("Time for size 2^16 (seconds): " + time6/1e9);
		assertTrue(isSorted(jobs[6]));
		assertTrue(isSorted(jobs[5]));
		assertTrue(isSorted(jobs[4]));
		assertTrue(isSorted(jobs[3]));
		assertTrue(isSorted(jobs[2]));
		assertTrue(isSorted(jobs[1]));
		assertTrue(isSorted(jobs[0]));
		System.out.println();
		}
		


	
	/**
	 * This method will test is sortInsert sorts various arrays
	 * @throws Exception
	 */
	@Test
	public void testSortInsert() throws Exception
	{

		long time6 = System.nanoTime();
		Insertion.sortInsert(jobs[6]);
		time6 = (System.nanoTime() - time6);
		long time5 = System.nanoTime();
		Insertion.sortInsert(jobs[5]);
		time5 = (System.nanoTime() - time5);
		long time4 = System.nanoTime();
		Insertion.sortInsert(jobs[4]);
		time4 = (System.nanoTime() - time4);
		long time3 = System.nanoTime();
		Insertion.sortInsert(jobs[3]);
		time3 = (System.nanoTime() - time3);
		long time2 = System.nanoTime();
		Insertion.sortInsert(jobs[2]);
		time2 = (System.nanoTime() - time2);
		long time1 = System.nanoTime();
		Insertion.sortInsert(jobs[1]);
		time1 = (System.nanoTime() - time1);
		long time0 = System.nanoTime();
		Insertion.sortInsert(jobs[0]);
		time0 = (System.nanoTime() - time0);
		System.out.println("Basic insertion Sort results:");
		System.out.println("Time for size 2^4 (seconds):  " + time0/1e9);
		System.out.println("Time for size 2^6 (Seconds):  " + time1/1e9);
		System.out.println("Time for size 2^8 (seconds):  " + time2/1e9);
		System.out.println("Time for size 2^10 (seconds): " + time3/1e9);
		System.out.println("Time for size 2^12 (seconds): " + time4/1e9);
		System.out.println("Time for size 2^14 (seconds): " + time5/1e9);
		System.out.println("Time for size 2^16 (seconds): " + time6/1e9);
		System.out.println();
		assertTrue(isSorted(jobs[6]));
		assertTrue(isSorted(jobs[5]));
		assertTrue(isSorted(jobs[4]));
		assertTrue(isSorted(jobs[3]));
		assertTrue(isSorted(jobs[2]));
		assertTrue(isSorted(jobs[1]));
		assertTrue(isSorted(jobs[0]));
	}
	
	
	
}

