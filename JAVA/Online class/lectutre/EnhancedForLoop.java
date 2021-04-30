package lectutre;

public class EnhancedForLoop
{

	public static void main(String[] args)
	{
		/*
		//without enhanced for loop
		int arr[]= {100,200,300};
		for(int i=0;i<3;i++)
		{
			System.out.println("THE VALUE IS "+arr[i]);
		}*/
		// using enhanced for loop
		int arr[]= {100,200,300};
		for(int var:arr)
		{
			System.out.println("THE VALUE IS "+var);
		}
		String arr1[]= {"ONE","TWO","THREE"};
		for(String var:arr1)
		{
			System.out.println("THE VALUE IS "+var);
		}
	}

}
