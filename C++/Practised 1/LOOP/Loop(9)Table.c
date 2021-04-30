#include<stdio.h>
main()
{
	int i,num;
	printf("\n ENTER THE NUMBER WHOSE MULTIPLICATION IS TO BEEN DONE \n\n");
	scanf("%d",&num);
	printf("\n THE MULTIPLICATION IS\n");
	for(i=1;i<=12;i++)
	{
		//num=num*i;
		printf("\n%d*%d=%d",num,i,num*i);
	}
}
