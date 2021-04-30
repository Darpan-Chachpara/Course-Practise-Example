#include<stdio.h>
double max(double num1,double num2);
double min(double num1,double num2);
main()
{
	double num1,num2,maximum,minimum;
	printf("\n ENTER FIRST NUMBER\n\n");
	scanf("%lf",&num1);
	printf("\n ENTER SECOND NUMBER\n\n");
	scanf("%lf",&num2);
	
	maximum=max(num1,num2);
	minimum=min(num1,num2);
	
	printf("\n MAXIMUM : %.3lf\n",maximum);
	printf("\n MINIMUM : %.3lf\n",minimum);
}

double max(double num1,double num2)
{
	return(num1>num2) ? num1:num2;
}

double min(double num1,double num2)
{
	return(num1>num2) ? num2:num1;
}
