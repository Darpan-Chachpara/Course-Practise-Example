#include<stdio.h>
main()
{
	int num,rev=0,rem;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	while(num!=0)
	{
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
	}
	printf("\n REVERSED NUMBER : %d",rev);
	
}
