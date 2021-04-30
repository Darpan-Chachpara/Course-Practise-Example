#include<stdio.h>
int calcum(double a,double b)
{
return a+b;
}
main()
{
	double a,b,sum;
	
	printf("\nENTER FIRST NUMBER\n\n");
	scanf("%lf",&a);
	printf("\nENTER SECOND NUMBER\n\n");
	scanf("%lf",&b);
	
	sum=calcum(a,b);
	printf("\nsum  = %.3lf",sum);
}
