#include<stdio.h>
#define PI 3.1415
main()
{
	float Area,Radius;
	printf("\n ENTER THE RADIUS : \n\n");
	scanf("%f",&Radius);
	
	Area=PI*Radius*Radius;
	printf("\n AREA IS = %.3f",Area);
}
