#include<stdio.h>
main()
{
	int arr1[1000],arr2[1000],arr3[1000],i,j,k,n2,n1;
	printf("\n ENTER THE SIZE OF ARRAY 1 : \n\n");
	scanf("%d",&n1);
	printf("\n ENTER THE ELEMMENTS OF ARRAY 1 : \n\n");
	for(i=0;i<n1;i++)
	{
		scanf("%d",&arr1[i]);
	}
	printf("\n ENTER THE SIZE OF ARRAY 2 : \n\n");
	scanf("%d",&n2);
	printf("\n ENTER THE ELEMENTS OF ARRAY 2 : \n\n");
	for(i=0;i<n2;i++)
	{
		scanf("%d",&arr2[i]);
	}
	
	i=0;
	j=0;
	k=0;
	
	while(i<n1 && j<n2)
	{
		if(arr1[i]<arr2[j])
		{
			arr3[k]=arr1[i];
			i++;
		}
		else
		{
			arr3[k]=arr2[j];
			j++;
		}
		k++;
	}
	if(i>=n1)
	{
		while(j<n2)
		{
			arr3[k]=arr2[j];
			j++;
			k++;
		}
	}
	if(j>=n2)
	{
		while(i<n1)
		{
			arr3[k]=arr1[i];
			i++;
			k++;
		}
	}
	printf("\n AFTER MERGING : \n\n");
	for(i=0;i<n1+n2;i++)
	{
		printf("\n %d",arr3[i]);
	}
}
