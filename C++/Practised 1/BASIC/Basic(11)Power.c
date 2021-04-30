#include<stdio.h>
#include<math.h>//for pow() function
main()
{
	double base,expo,power;
	
	printf("\nENTER THE BASE\n\n");
	scanf("%lf",&base);
	printf("\nENTER THE EXPO\n\n");
	scanf("%lf",&expo);
	
	power= pow(base, expo);
	printf("\n\n The Value is:>  %.2lf\n",power,base,expo);
} 
