#include<stdio.h>
main()
{
	struct Address
	{
		char City[20];
		char Street[20];
		int Pin;
	};
	
	struct Employee
	{
		char Name[20];
		struct Address add;
	};
	
	struct Employee emp={"DAR","PAN","DC_126_111",101};
	
	printf("\n Name = %s \tCity = %s \tStreet = %s \tPin = %d \n\n",
	emp.Name,emp.add.City,emp.add.Street,emp.add.Pin);
}

