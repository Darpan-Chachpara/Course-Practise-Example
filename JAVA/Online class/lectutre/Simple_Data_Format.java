package lectutre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple_Data_Format
{

	public static void main(String[] args)
	{
		Date date=new Date();
		java.text.SimpleDateFormat sf=new SimpleDateFormat("dd/mm/yy");
		System.out.println(sf.format(date));
	}

}
