#include<stdio.h>
main()
{
	double i,base,power,result=1;
	printf("\n ENTER THE BASE\n\n");
	scanf("%lf",&base);
	printf("\n ENTER THE EXPONENT\n\n");
	scanf("%lf",&power);
	
	for(i=1;i<=power;i++)
	{
		result=result*base;
	}
	printf("\n THE VALUE IS %.5lf",result);
} 
