package lectutre.CoreJavaAssignment;

public class Assignment_4_10_Enum {

	enum weekday
	{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
	}
	public static void main(String[] args) 
	{
		for(weekday day: weekday.values())
		{
			System.out.println(day.ordinal()+ "  " +day); 
		}
	}

}
