#include<stdio.h>
main()
{
	int arr[5];
	int i;
	for(i=0;i<5;i++)
	{
		printf("\nENTER THE VALUE OF arr[%d]:",i);
		scanf("%d",&arr[i]);
	}
	for(i=0;i<5;i++)
	{
		printf("\nThe value of arr[%d] is \n%d",i,arr[i]);
	}
}
