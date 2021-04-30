#include<stdio.h>
main()
{
	int month;
	printf("\nENTER THE NUMBER\n\n");
	scanf("%d",&month);
	
	switch(month)
	{
			case 1:
			printf("\n JANUARY 31 DAYS");
			break;
			case 2:
			printf("\n FEBRUARY 28 or 29 DAYS");
			break;
			case 3:
			printf("\n MARCH 31 DAYS");
			break;
			case 4:
			printf("\n APRIL 30 DAYS");
			break;
			case 5:
			printf("\n MAY 31 DAYS");
			break;
			case 6:
			printf("\n JUNE 30 DAYS");
			break;
			case 7:
			printf("\n JULY 31 DAYS");
			break;
			case 8:
			printf("\n AUGUST 31 DAYS");
			break;
			case 9:
			printf("\n SEPTEMBER 30 DAYS");
			break;
			case 10:
			printf("\n OCTOBER 31 DAYS");
			break;
			case 11:
			printf("\n NOVEMBER 30 DAYS");
			break;
			case 12:
			printf("\n DECEMBER 31 DAYS");
			break;
			default :
			printf("\n INVALID INPUT");
		}
}
