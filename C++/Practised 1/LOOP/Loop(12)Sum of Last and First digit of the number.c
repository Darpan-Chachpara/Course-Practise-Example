#include<stdio.h>
main()
{
	int num,last,first,sum=0;
	printf("\n ENTER THE NUMBER : \n\n");
	scanf("%d",&num);
	
	last=num%10;
	while(num>10)
	{
		num=num/10;
	}
	first=num;
	sum=last+first;
	
	printf("\n\n SUM OF FIRST AND LAST DIGIT OF THE NUMBER IS : %d\n\n",sum);

}
