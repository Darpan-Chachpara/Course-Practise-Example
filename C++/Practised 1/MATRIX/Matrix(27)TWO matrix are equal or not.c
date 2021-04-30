#include<stdio.h>
main()
{
	int row,column,i,j,arr1[20][20],arr2[20][20],equal=0;
	printf("\n ENTER THE NUMBER OF ROWS : \n\n");
	scanf("%d",&row);
	printf("\n ENTER THE NUMBER OF COLUMN : \n\n");
	scanf("%d",&column);
	
	printf("\n ENTER THE ELEMENTS OF 1st MATRIX : \n\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("\n ENTER ELEMENT a [%d][%d]: ",i+1,j+1);
		scanf("%d",&arr1[i][j]);
	}
	}
	
	printf("\n ENTER THE ELEMENTS OF 2st MATRIX : \n\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("\n ENTER ELEMENT a [%d][%d]: ",i+1,j+1);
		scanf("%d",&arr2[i][j]);
	}
	}
	
	printf("\n THE FIRST MATRIX\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("%d\t",arr1[i][j]);
	}
	printf("\n");
	}
	
	printf("\n THE SECOND MATRIX\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("%d\t",arr2[i][j]);
	}
	printf("\n");
	}
	
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		if(arr1[i][j] !=arr2[i][j])
		{
		equal=1;
		break;
	}
	}
	}
	if(equal==0)
	{
		printf("\n MATRIX a IS EQUAL TO MATRIX b\n\n");
	}
	else
	{
		printf("\n MATRIX a IS  not EQUAL TO MATRIX b\n\n");

	}
}
