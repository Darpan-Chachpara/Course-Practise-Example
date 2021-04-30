#include<stdio.h>
main()
{
	int side1,side2,side3;
	printf("\nENTER THE THREE SIDE OF TRIANGLE\n\n");
	scanf("%d%d%d",&side1,&side2,&side3);
	
	if(side1==side2 &&side2==side3)
	{
		printf("\nEQUILATERAL TRIANGLE");
	}
	else if (side1==side2 || side2==side3 || side1==side3)
	{
		printf("\nISOSCELES TRIANGLE");
	}
	else
	{
		printf("\nSCALENE TRIANGLE");
	}
}
