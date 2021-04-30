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
	for(i=0;i<num;i++)
	{
		if(arr[i]%2==0)
		{
				printf("\n THE EVEN ELEMNTS ARE %d\n",arr[i]);
		}
	}
	
	for(i=0;i<num;i++)
	{
	if(arr[i]%2!=0)
	{
		printf("\n THE ODD ELEMNTS ARE %d\n",arr[i]);

	}
}
}

