#include<stdio.h>
main()
{
	int arr[100],i,n,max,min;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&n);
	printf("\n ENTER ELEMENTS IN ARRAY : \n\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	min=max=arr[0];
	for(i=1;i<n;i++)
	{
		if(min>arr[i])
		min=arr[i];
		if(max<arr[i])
		max=arr[i];
	}
	printf("\n MINIMUM OF ARRAY IS : %d",min);
	printf("\n MAXIMUM OF ARRAY IS : %d",max);
	
}
