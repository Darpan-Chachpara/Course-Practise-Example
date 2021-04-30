#include<stdio.h>
main()
{
	int arr1[1000],arr2[1000],arr3[1000],num,i,j,k;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&num);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<num;i++)
	{
		scanf("%d",&arr1[i]);
	}
	j=0;
	k=0;
	for(i=0;i<num;i++)
	{
		if(arr1[i]%2==0)
		{
			arr2[j]=arr1[i];
			j++;
		}
		else
		{
			arr3[k]=arr1[i];
			k++;
		}
	}
	for(i=0;i<j;i++)
	{
		printf("\n THE EVEN ELEMNTS ARE %d\n",arr2[i]);
	}
	for(i=0;i<k;i++)
	{
		printf("\n THE ODD ELEMNTS ARE %d\n",arr3[i]);

	}
}
