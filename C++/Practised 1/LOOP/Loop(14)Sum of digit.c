#include<stdio.h>
main()
{
	int num,sum=0;
	printf("\n ENTER THE NUMBER : \n\n");
	scanf("%d",&num);
	while(num!=0)
	{
		sum=sum+(num%10);
		num=num/10;
	}
	printf("\n SUM OF THE DIGIT = %d",sum);
}
