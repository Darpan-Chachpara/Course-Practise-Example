#include<stdio.h>
main()
{
	int i,num,sum=0;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	
	for(i=2;i<=num;i=i+2)
	{
		sum=sum+i;
	}
	printf("\nSUM OF ALL EVEN NUMBER ARE %d\n",sum);
}
