#include<stdio.h>
main()
{
	int arr[1000],i,num;
	printf("\n ENTER THE SIZE OF THE ARRAY : \n\n");
	scanf("%d",&num);
	printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n");
	for(i=0;i<num;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(i=0;i<num;i++)
	{
		printf("\n ELEMENTS NUMBER %d",i);
		printf("\n ADDRESS = %u",arr[i]);
		printf("\n %u ",arr); // prints value of variables ie base address so arr is a pointer
		printf("\n %u ",*arr); // value contained in variables arr
		printf("\n\n");
		//printf("\n %u ",*(++arr);
	}
}
