#include<stdio.h>
main()
{
	int num=50,i;

	printf(" %d\n",++num);
	{
		int num=1000;
		for(i=0;i<5;i++)
		{
			printf("\n %d\n",num);
		}
	}
	printf("\n %d",num);
}
