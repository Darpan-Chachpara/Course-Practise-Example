#include<stdio.h>
main()
{
	int arr[1000],i,n,position,value;
	printf("\n ENTER SIZE OF THE ELEMENT : \n\n");
	scanf("%d",&n);
	printf("\n ENTER THE ELEMENT IN THE ARRAY : \n\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\n ENTER THE LOCATION WHERE YOU WISH TO INSERT AN ELEMENTS\n\n");
	scanf("%d",&position);
	printf("\n ENTER THE VALUE TO BE INSERTED : \n\n");
	scanf("%d",&value);
	for(i=n-1;i>=position;i--)
	{
	arr[i+1]=arr[i];
	arr[position]=value;
	printf("\n RESULTANT ARRAY : \n\n");
}
	for(i=0;i<=n;i++)
	{
		printf("\n%d\n",arr[i]);
	}
}
