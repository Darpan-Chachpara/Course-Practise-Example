#include<stdio.h>
main()
{
	double Radius,Diameter,Circumference,Area;
	printf("\nENTER THE RADIUS\n");
	scanf("%lf",&Radius);
	
	Diameter=2*Radius;
	Circumference=2*3.14*Radius;
	Area=3.14*(Radius*Radius);
	
	printf("Diameter of circle=.2lf\n",Diameter);
	printf("Circumference of circle.2lf\n",Circumference);
	printf("Area of circle.2lf\n",Area);
return 0;
}
