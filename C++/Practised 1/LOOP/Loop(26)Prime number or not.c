#include<stdio.h>
main()
{
	int i,num,Prime=0;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	for(i=2;i<num/2;i++);
	{
		if(num%i==0)
		{
			Prime=1;
			exit(1);
		}
	}
	if(num==1)
	{
		printf("\n%d  IS NITHER PRIME OR COMPOSITE");
	}
	else if(Prime==0)
	{
		printf("\n%d THE NUMBER IS PRIME\n",num);
	}
	else
	{
		printf("\n%d THE NUMBER IS NOT A PRIME\n",num);
	}
}
