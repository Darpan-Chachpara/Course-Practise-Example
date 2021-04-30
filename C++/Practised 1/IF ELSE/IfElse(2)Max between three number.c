#include<stdio.h>
main()
{
	double num1,num2,num3,max;
	printf("\nENTER FIRST NUMBER\n\n");
	scanf("%lf",&num1);
	printf("\nENTER SECOND NUMBER\n\n");
	scanf("%lf",&num2);
	printf("\nENTER THIRD NUMBER\n\n");
	scanf("%lf",&num3);
		
	if(num1>num2)
	{
		if(num1>num3)
		{
			max=num1;
		}
		else
		{
			max=num3;
		}
	}
		else
		{
			if(num2>num3)
			{
				max=num2;
			}
		
		else
		{
			max=num3;
		}
		printf("\nMAXIMUM AMONG THREE NUMBER IS :>  %.2lf",max,num1,num2,num3);
	}
}
