#include<stdio.h>
main()
{
	double x,y,z;
	printf("\nENTER THE FIRST ANGLE OF TRIANGLE\n\n");
	scanf("%lf",&x);
	printf("\nENTER THE SECOND ANGLE OF TRIANGLE\n\n");
	scanf("%lf",&y);
	
	z=180 - (x+y);
	printf("\nThird Angle is :>  %.2lf",z);
}
