#include<stdio.h>
main()
{
	int row,column,i,j,arr[20][20],count=0;
	long determinant;
	printf("\n ENTER THE NUMBER OF ROW : \n\n");
	scanf("%d",&row);
	printf("\n ENTER THE NUMBER OF COLUMN : \n\n");
	scanf("%d",&column);
	printf("\n ENTER THE ELEMENTS IN THE MATRIX : \n\n");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			printf("\n ENTER ELEMENT a [%d][%d]: ",i+1,j+1);
			scanf("%d",&arr[i][j]);
		}
	}
	
	printf("\n THE MATRIX\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("%d\t",arr[i][j]);
	}
	printf("\n\n");
	}
	
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		if(arr[i][j]==0)
		{
			count++;
		}	
	}
	}
	
	if(count>=((i*j)/2))
	{
		printf("\n THE GIVEN MATRIX IS SPARSE MATRIX \n\n");
	}
	else
	{
		printf("\n THE GIVEN MATRIX IS NOT SPARSE MATRIX \n\n");

	}
}
