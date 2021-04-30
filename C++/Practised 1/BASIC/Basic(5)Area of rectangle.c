#include<stdio.h>
main()
{
	double length,breadth,Area;
	
	
	printf("\nENTER THE LENGTH\n\n");
	scanf("%lf",&length);
	printf("\nENTER THE BREADTH\n\n");
	scanf("%lf",&breadth);
	
	Area=length * breadth;
	printf("\nArea of rectangle\n\n%.2lf",Area);
}
