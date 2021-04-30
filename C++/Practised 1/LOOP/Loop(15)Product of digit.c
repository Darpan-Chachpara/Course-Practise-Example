#include<stdio.h>
main()
{
	int num,prod=1,rem;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	
	while(num!=0)
	{
		rem=num%10; //get the last digit of the number//
		prod=prod*rem;
		num=num/10; //to remove the last digit of the number//
	}
	printf("\n THE PRODUCT IS %d",prod);
}
