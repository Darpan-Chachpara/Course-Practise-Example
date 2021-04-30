#include<stdio.h>
main()
{
	int angle1,angle2,angle3,sum;
	printf("\nENTER THE FIRST ANGLE OF TRIANGLE\n\n");
	scanf("%d",&angle1);
	printf("\nENTER THE SECOND ANGLE OF TRIANGLE\n\n");
	scanf("%d",&angle2);
	printf("\nENTER THE THIRD ANGLE OF TRIANGLE\n\n");
	scanf("%d",&angle3);
		
	sum=angle1+angle2+angle3;
	
	if(sum==180)
	{
		printf("\nTRIANGLE IS VALID");
	}
	else
	{
		printf("\nTRIANGLE IS INVALID");
	}
}
