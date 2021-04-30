#include<stdio.h>
main()
{
	int i,num,sum=0;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	
	for(i=1;i<=num;i++)
	{
		sum=sum+i;
	}
	printf("\nSUM OF NATURAL NUMBER ARE %d\n",sum);
}
