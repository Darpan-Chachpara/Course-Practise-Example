#include<stdio.h>
main()
{
	int arr[1000],i,j,k,n;
	printf("\n ENTER THE SIZE OF THE ELEMENT : \n\n");
	scanf("%d",&n);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;)
		{
			if(arr[i]==arr[j])
			{
				for(k=j;k<n;k++)
				{
					arr[k]=arr[k+1];
				}
				n--;
			}
			else
			{
				j++;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		printf("\n AFTER THE DELETION OF DUPLICATE ELEMENT WE GET : %d\n",arr[i]);
	}
}
