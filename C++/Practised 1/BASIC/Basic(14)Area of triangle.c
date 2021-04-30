#include<stdio.h>
main()
{
	double base,height,area;
	printf("\nENTER BASE OF THE TRIANGLE\n\n");
	scanf("%lf",&base);
	printf("\nENTER THE HEIGHT OF GTHE TRIANGLE\n\n");
	scanf("%lf",&height);
	
	area=(base*height) /2;
	printf("\nAREA OF TRIANGLE IS :>  %.2lf",area,base,height);
}
