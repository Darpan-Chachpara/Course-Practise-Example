#include<stdio.h>
main()
{
	int num,year,day,month,week;
	printf("\nENTER THE NUM\n\n");
	scanf("%d",&num);
	
	year=num/365;
	month=num/30;
	week=num/7;
	day=num-(week*7);
	
	printf("\nYear is::%d \nMonth is::%d \nWeek is::%d \nDay is::%d",year,month,week,day);
}
