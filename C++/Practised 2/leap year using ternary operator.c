#include<stdio.h>
main()
{
	int year;
	printf("\nENTER THE YEAR\n");
	scanf("%d",&year);
	(year%400==0&&year%4==0?printf("LEAP YEAR"):printf("NOT A LEAP YEAR"));
}
