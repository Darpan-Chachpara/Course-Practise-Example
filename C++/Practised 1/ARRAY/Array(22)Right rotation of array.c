#include<stdio.h>
main()
{
	int arr[1000],num,i,j,k,temp;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&num);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<num;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\n ENTER THE NUMBER OF ROTATION : \n\n");
	scanf("%d",&k);
	for(i=0;i<k;i++)
	{
		temp=arr[num-1];
		for(j=num-1;j>0;j--)
		{
			arr[j]=arr[j-1];
		}
		arr[j]=temp;
	}
	printf("\n ARRAY ELEMENTS AFTER ROTATION : \n\n");
	for(i=0;i<num;i++)
	{
		printf("%d\n",arr[i]);
	}
}
