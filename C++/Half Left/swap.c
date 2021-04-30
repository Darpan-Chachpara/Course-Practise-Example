#include<stdio.h>
main()
{
	int num,last,first,temp=0;
	printf("\n ENTER THE NUMBER : \n\n");
	scanf("%d",&num);
	
	last=num%10;
	while(num>10)
	{
		num=num/10;
	}
	first=num;
	
	temp=last;
	last=first;
	first=temp;
	
	printf("\n\n AFTER SWAPPING OF FIRST AND LAST DIGIT OF THE NUMBER IS : %d %d\n\n",first,last);

}
