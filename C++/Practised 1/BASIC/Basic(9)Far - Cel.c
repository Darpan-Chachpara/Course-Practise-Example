#include<stdio.h>
main()
{
	double cel,far;
	printf("\nENTER THE TEMPERATURE\n\n");
	scanf("%lf",&far);
	
	cel=(far-32)*5/9;
	printf("\nTemperature in cel:%.2lf",cel);
}
