#include<stdio.h>
main()
{ 
	int a,b,c,i,num;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	a=0;
	b=1;
	c=0;
	for(i=1;i<=num;i++)
	{
		printf("\n THE SERIES ARE AS FOLLOWS %d",c);
		c=a+b;
		a=b;
		b=c;
	}
}
