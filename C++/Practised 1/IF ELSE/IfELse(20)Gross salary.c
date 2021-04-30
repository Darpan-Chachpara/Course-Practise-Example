#include<stdio.h>
main()
{
	double basic,gross,da,hra;
	printf("\nENTER BASIC SALARY OF EMP\n\n");
	scanf("%lf",&basic);
	
	if(basic<=1000)
	{
		da=basic*0.8;
		hra=basic*0.2;
	}
	else if(basic<=20000)
	{
		da=basic*0.9;
		hra=basic*0.25;
	}
	else
	{
		da=basic*0.95;
		hra=basic*0.3;
	}
	gross=basic+hra+da;
	printf("GROSS SALARAY OF EMP %.3lf",gross);
}
