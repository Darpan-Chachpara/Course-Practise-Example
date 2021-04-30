#include<stdio.h>
main()
{
	int i,j,Prime,Sum=0,num;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	for(i=2;i<=num;i++)
	{
		Prime=1;
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				Prime=0;
				break;
			}
		}
			if(Prime==1)
			{
				Sum=Sum+i;	
			}	
	}
	printf("\n SUM OF ALL PRIME NUMBER IS %d",Sum,num);
}
