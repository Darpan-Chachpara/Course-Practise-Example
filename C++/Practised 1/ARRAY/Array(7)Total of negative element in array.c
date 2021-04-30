#include<stdio.h>
main()
{
	int arr[1000],i,n,count=0;
	printf("\n ENTER SISZE OF THE ARRAY : \n\n");
	scanf("%d",&n);
	printf("\n ENTER THE ELEMENT IN ARRAY : \n\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n;i++)
	{
		if(arr[i]<0)
		count++;
	}
	printf("\n COUNT OF NEGATIVE NUMBERS IN ARRAY : %d\n",count);
}
