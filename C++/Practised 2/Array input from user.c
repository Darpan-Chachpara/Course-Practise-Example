#include<stdio.h>
main()
{
	int arr[3][2];
	int i;
	for(i=0;i<=2;i++)
	{
		printf("\n ENTER THE ROLLNO\n");
		scanf("%d",&arr[i][0]);
		printf("\n ENTER THE MARKS\n");
		scanf("%d",&arr[i][1]);
	}
	for(i=0;i<=2;i++)
	{
		printf("\n ROLLNO %d : MARKS %d",arr[i][0],arr[i][1]);

	}
}
