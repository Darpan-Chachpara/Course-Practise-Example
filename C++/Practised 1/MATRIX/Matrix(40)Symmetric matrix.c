#include<stdio.h>
main()
{
	int row,column,i,j,arr1[20][20],arr2[20][20],count=0;
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
			scanf("%d",&arr1[i][j]);
		}
	}
	
	printf("\n THE MATRIX\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("%d\t",arr1[i][j]);
	}
	printf("\n\n");
	}
	
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			arr2[j][i]=arr1[i][j];
		}
	}
	
	printf("\n THE TRANSPOSE OF MATRIX\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("%d\t",arr2[i][j]);
	}
	printf("\n\n");
	}
	
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		if(arr1[i][j]!=arr2[i][j])  //compare 2 matrix
		{
		count=1; //value is not same
		break;
	}
	}
	}
	
	if(count==0)
	{
		printf("\n MATRIX IS SYMMETRIC \n\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("%d\t",arr1[i][j]);
	}
	printf("\n\n");
	}
	}
	else
	{
		printf("\n MATRIX IS NOT SYMMETRIC \n\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("%d\t",arr1[i][j]);
	}
	printf("\n\n");
	}

	}
}
