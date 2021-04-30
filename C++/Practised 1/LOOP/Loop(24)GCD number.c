#include<stdio.h>
main()
{
	int i,num1,num2,gcd;
	printf("\n ENTER THE FIRST NUMBER\n\n");
	scanf("%d",&num1);
	printf("\n ENTER THE SECOND NUBER\n\n");
	scanf("%d",&num2);

	for(i=1;i<=num1 && i<=num2;i++)
	{
		if(num1%i==0 && num2%i==0)
		gcd=i;
	}
	printf("\n GCD OF %d AND %d IS %d",num1,num2,gcd);
	
}
			// 52=1*2*4*13*26
			// 65=1*5*13
			// common number starting from maximum will be the commcom factor
