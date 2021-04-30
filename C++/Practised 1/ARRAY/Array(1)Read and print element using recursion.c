#include<stdio.h>
main()
{
	int arr[100],i,n;
	printf("\n ENTER THE SIZE OF THE ARRAY\n\n");
	scanf("%d",&n);
	printf("\n ENTER %d ELEMENTS IN THE ARRAY : \n\n",n);
	for(i=0;i<n;i++)
	{
		scanf("\n%d",&arr[i]);
	}
	printf("\n ELEMENT IN THE ARRAY ARE : \n\n");
	for(i=0;i<n;i++)
	{
	printf("\n\n %d",arr[i]);
	}
}
