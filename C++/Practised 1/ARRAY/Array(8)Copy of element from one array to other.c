#include<stdio.h>
main()
{
	int arr[1000],i,n,brr[1000];
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&n);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++)
	{
		brr[i]=arr[i];
	}
	printf("\n ELEMENT OF SOURCE ARRAY ARE : \n\n");
	for(i=0;i<n;i++)
	{
		printf("%d\n",arr[i]);
	}
	printf("\n ELEMENT IF DESTINATION ARRAY ARE : \n\n");
	for(i=0;i<n;i++)
	{
		printf("%d\n",brr[i]);
	}
}
