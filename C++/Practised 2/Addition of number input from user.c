#include<stdio.h>
main()
{
	int i;
	double num,sum=0.0;
	for(i=1;i<=10;i++)
	{
		printf("\nENTER THE NUMBER:");
		scanf("%lf",&num);
		if(num<0.0)
		{
			break;	
		}
		sum=sum+num;
	}
	printf("sum=%.2lf",sum);
	
}
