#include<stdio.h>
main()
{
	double num1,num2;
	printf("\nENTER FIRST NUMBER\n\n");
	scanf("%lf",&num1);
	printf("\nENTER SECOND NUMBER\n\n");
	scanf("%lf",&num2);
	
	if(num1>num2)
	{
		printf("\nMaximum is :>  \n%.2lf",num1);//(.2 is used to get number upto decimal only)
	}
	if(num2>num1)
	{
		printf("\nMaximum is :>  \n%.2lf",num2);
	}
	if(num1==num2)
	{
		printf("\nBoth are Equal\n\n%.2lf",num1,num2);
	}
}
