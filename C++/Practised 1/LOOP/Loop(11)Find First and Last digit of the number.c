#include<stdio.h>
main()
{
	int num,last,first;
	printf("\n ENTER THE NUMBER : \n\n");
	scanf("%d",&num);
	
	last=num%10;
	while(num>10)
	{
		num=num/10;
	}
	first=num;
	
	printf("\n\n FIRST DIGIT OF THE NUMBER IS : %d\n\n",first);
	printf("\n LAST DIGIT OF THE NUMBER IS : %d\n\n",last);

}
