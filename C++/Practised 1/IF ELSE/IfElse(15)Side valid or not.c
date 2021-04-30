#include<stdio.h>
main()
{
	int side1,side2,side3;
	printf("\n ENTER THE SIDES OF THE TRIANGLE\n\n");
	scanf("%d%d%d",&side1,&side2,&side3);
	
	if((side1+side2)>side3)
	{
		if((side2+side3)>side1)
		{
			if((side3+side1)>side2)
			{
				printf("TRIANGLE IS VALID");
			}
			else
			{
				printf("TRIANGLE IS NOT VALID");
			}
		}
			else
			{
				printf("TRIANGLE IS NOT VALID");
			}
		}
			else
			{
				printf("TRIANGLE IS NOT VALID");
			}
	
}
