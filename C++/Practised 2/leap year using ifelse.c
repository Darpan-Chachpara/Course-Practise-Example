#include<stdio.h>
main()
{
	int year;
	printf("\nENTER THE YEAR\n");
	scanf("%d",&year);
	if((year%4==0)&&(year%100!=0) || (year%400==0))
	{
		
		printf("\nThe year is leap year");
	}
    else
	{
		printf("\nThe year is not a leap year");
	}
}
