#include<stdio.h>
main()
{
	int arr[1000],num,i;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&num);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<num;i++)
	{
		scanf("%d",&arr[i]);
	}
		printf("\n SORTED ELEMENTS ARE  : \n");
	for(i=0;i<num;i++)
	{
		if(arr[i]%2==0)
		{
				printf("%d\n",arr[i]);
		}
	}
	for(i=0;i<num;i++)
	{
	if(arr[i]%2!=0)
	{
		printf("%d\n",arr[i]);

	}
}
}

