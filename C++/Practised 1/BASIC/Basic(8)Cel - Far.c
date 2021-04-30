#include<stdio.h>
main()
{
	double cel,far;
	printf("\nENTER THE TEMPERATURE\n\n");
	scanf("%lf",&cel);
	
	far=(1.8*cel)+32;
	printf("\nTemperature in far:%.2lf",far);
}
