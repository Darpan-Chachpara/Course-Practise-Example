#include<stdio.h>
main()
{
	int arr[1000],i,n,position;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&n);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\n ENTER THE POSITION YOU WANT TO DELETE ELEMENT : \n\n");
	scanf("%d",&position);
	for(i=position;i<n-1;i++)
	{
		arr[i]=arr[i+1];
	}
	for(i=0;i<n-1;i++)
	{
		printf("\n AFTER DELETION %d\n",arr[i],n);
	}
}
