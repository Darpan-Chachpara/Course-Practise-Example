#include<stdio.h>
main()
{
	int i,num;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	printf("\n EVEN NUMBER ARE\n");
	for(i=1;i<=num;i++)
	{
		if(i%2==0)
		{
			printf("\n%d\n",i);
		}
	}
}
