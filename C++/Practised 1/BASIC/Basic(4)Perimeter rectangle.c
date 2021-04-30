#include<stdio.h>
main()
{
	double length,breadth,Perimeter;
	
	
	printf("\nENTER THE LENGTH\n\n");
	scanf("%lf",&length);
	printf("\nENTER THE BREADTH\n\n");
	scanf("%lf",&breadth);
	
	Perimeter=(length + breadth)*2;
	printf("\nPerimeter of rectangle\n\n%.2lf",Perimeter);
}
