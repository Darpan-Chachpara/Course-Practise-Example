#include<stdio.h>
main()
{
	int num;
	printf("\nENTER THE NUMBER\n\n");
	scanf("%d",&num);
	
	if(num==1)
	{
		printf("\n JANUARY (31 DAYS)");
	}
	else if(num==2)
	{
		printf("\n FEBRUARY (28 0R 29 DAYS)");
	}
	else if(num==3)
	{
		printf("\n MARCH (31 DAYS)");
	}
	else if(num==4)
	{
		printf("\n APRIL (30 DAYS)");
	}
	else if(num==5)
	{
		printf("\n MAY (31 DAYS)");
	}
	else if(num==6)
	{
		printf("\n JUNE (30 DAYS)");
	}
	else if(num==7)
	{
		printf("\n JULY (31 DAYS)");
	}	
	else if(num==8)
	{
		printf("\n AUGUST (31 DAYS)");
	}
	else if(num==9)
	{
		printf("\n SEPTEMBER (30 DAYS)");
	}
	else if(num==10)
	{
		printf("\n OCTOBER (31 DAYS)");
	}
	else if(num==11)
	{
		printf("\n NOVEMBER (30 DAYS)");
	}
	else if(num==12)
	{
		printf("\n DECEMBER (31 DAYS)");
	}
	else
	{
		printf("\n%d INVALID NUMBER");
	}
}
