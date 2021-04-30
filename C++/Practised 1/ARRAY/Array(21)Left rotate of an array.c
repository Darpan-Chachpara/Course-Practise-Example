#include<stdio.h>
main()
{
	int arr[1000],num,k,i,j,temp;
	printf("\n ENTER THE SIZE OF THE ELEMENT : \n\n");
	scanf("%d",&num);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<num;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\n ENTER NUMBER OF TIME YOU WANT TO ROTATE : \n\n");
	scanf("%d",&k);
	for(i=0;i<k;i++)
	{
		temp=arr[0];
		for(j=0;j<num-1;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[num-1]=temp;
	}
	printf("\n ARRAY ELEMENTS AFTER ROTATION ARE : \n\n");
	for(i=0;i<num;i++)
	{
		printf("\n%d",arr[i]);
	}
}
