#include<stdio.h>
main()
{
	int arr[1000],i,n;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&n);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=n-1;i>=0;i--)
	{
		printf("\n ARRAY IN REVERSE ORDER ARE %d",arr[i]);
	}
}
