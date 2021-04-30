#include<stdio.h>
main()
{
	int i,sum=0,a;
	printf("ENTER THE NUMBER\n");
	for(i=1;i<=3;i++)
	{
		scanf("%d",&a);
		sum=sum+a;
	}
	printf("\n%d",sum);
}
