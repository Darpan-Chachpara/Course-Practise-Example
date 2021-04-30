#include<stdio.h>
main()
{
	int num,c;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	c=cube(num);
	printf("\n CUBE OF %d IS %d",num,c);
}
int cube(num)
{
	return (num*num*num);
}
