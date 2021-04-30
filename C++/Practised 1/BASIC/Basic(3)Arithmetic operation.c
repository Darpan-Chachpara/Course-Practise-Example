#include<stdio.h>
main()
{
	
	double num1,num2,addition,subtraction,multiplication,divide;
	printf("\nENTER THE TWO NUMBER\n");
	scanf("%lf%lf",&num1,&num2);
	
	addition=num1+num2;
	subtraction=num1-num2;
	multiplication=num1*num2;
	divide=num1/num2;
	
	printf("\nSum=%.2lf\n",addition);
	printf("\nDifference=%.2lf\n",subtraction);
	printf("\nMultiplication=%.2lf\n",multiplication);
	printf("\nDivision=%.2lf\n",divide);

}
