#include<stdio.h>
main()
{
	double principle,time,rate,CompoundInterest;
	printf("\nENTER THE AMOUNT\n\n");
	scanf("%lf",&principle);
	printf("\nENTER THE TIME\n\n");
	scanf("%lf",&time);
	printf("\nENTER THE RATE\n\n");
	scanf("%lf",&rate);
	
	CompoundInterest=principle*(pow((1+rate/100),time));// time is the power
	printf("\nCOMPOUND INTEREST IS:>  %.2lf",CompoundInterest);
}
