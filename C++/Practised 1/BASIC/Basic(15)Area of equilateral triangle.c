#include<stdio.h>
#include<stdio.h>//for sqrt
main()
{
	double side,area;
	printf("\nENTER SIDE OF THE EQUILATERAL TRIANGLE\n\n");
	scanf("%lf",&side);
	
	area=(sqrt(3)/4)*(side*side);
	printf("\nAREA OF EQUILITERAL TRIANGLE IS :>  %.2lf",area,side);
}
