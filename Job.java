package sort;
/**
 *This class creates Job objects that have and ID and time. It contains  methods that help the client interact with the Job object.
 * @author Immanuel Odisho
 *
 */
public class Job implements Comparable<Job>{
	
	private final String ID;
	private int time;
	/**
	 * Constructor that takes in ID and time
	 * @param ID the ID of the job
	 * @param time the time it takes to fulfill the job
	 */
	public Job(String ID, int time)
	{
		this.ID = ID;
		this.time = time;
	}
	/**
	 * returns time of object
	 * @return time
	 */
	public int getTime()
	{
		return this.time;
	}
	/**
	 * changes time of object
	 * @param x the new time of the job
	 */
	public void setTime(int x)
	{
		this.time = x;
	}
	/**
	 * returns job ID
	 * @return ID
	 */
	public String getID()
	{
		return this.ID;
	}

	@Override
	public int compareTo(Job j)
	{
		if (this.time > j.time) {return 1;}
		else if (this.time < j.time) {return -1;}
		else if (this.ID == j.ID) {return 0;}
		else if (this.ID.compareTo(j.ID) < 0) {return -1;}
		else return 1;
			
			
	}
		
	
	public String toString()
	{
		return "(" + ID + "," + time + ")";
	}
	
	public static void main(String[] args)
	{
		Job x = new Job("abcd",333);
		Job y = new Job("abcd",333);
		System.out.println(x.getID() == "hhh");
		
		
	}


	
}


