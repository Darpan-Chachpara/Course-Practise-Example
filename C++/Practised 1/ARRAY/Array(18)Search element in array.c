#include<stdio.h>
main()
{
	int arr[1000],num,i,SE;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&num);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<num;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\n ENTER THE ELEMENT YOU WANT TO SERACH : \n\n");
	scanf("%d",&SE);
	for(i=0;i<num;i++)
	{
		if(arr[i]==SE)
		{
			printf("\n ELEMENT FOUND %d",arr[i]);
			//return 0;
		}
	}
		
			printf("\n ELEMENT NOT FOUND %d",arr[i]);

}
