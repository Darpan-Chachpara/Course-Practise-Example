#include<stdio.h>
main()
{
	int arr[1000],i,j,num,temp;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&num);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<num;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<num;i++)
	{
		for(j=0;j<num;j++)
		{
			if(arr[j]>arr[i])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	printf("\n\n ELEMENTS IN ASCENDING ORDER ARE \n\n");
	for(i=0;i<num;i++)
	{
		printf("%d\n",arr[i]);
	}
	printf("\n\n ELEMENTS IN DESCENDING ORDER ARE \n\n");
	for(i=num-1;i>=0;i--)
	{
		printf("%d\n",arr[i]);
	}	
}
