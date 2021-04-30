#include<stdio.h>
main()
{
	int arr[1000],brr[1000],i,j,n,count=0;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&n);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++)
	{
		count=1;
		if(arr[i]!=-1)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
			}
			brr[i]=count;
		}
	}
	for(i=0;i<n;i++)
	{
		if(arr[i]!=-1)
		{
			printf("\n NO OF %d is %d \n",arr[i],brr[i]);
		}
	}
}
