#include<stdio.h>
main()
{
	int arr[1000],i,n;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&n);
	printf("\n ENTER ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\n ALL NEGATIVE ELEMENTS IN ARRAY ARE : \n\n",n);
	for(i=0;i<n;i++)
	{
		if(arr[i]<0)
		{
			printf("\n %d",arr[i]);
		}
	}
}
