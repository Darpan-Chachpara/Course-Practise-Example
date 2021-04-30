#include<stdio.h>
main()
{
	int arr[1000],i,n,j,count=0;
	printf("\n ENTER THE SIZE OF THE ELEMENTS : \n\n");
	scanf("%d",&n);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;i++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				break;
			}
		}
	}
	printf("\n TOTAL NUMBER OF DUPLICATE ELEMENTS FOUND IN ARRAY = %d",count);
}
