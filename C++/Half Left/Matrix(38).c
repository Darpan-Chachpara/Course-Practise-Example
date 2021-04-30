#include<stdio.h>
main()
{
	int row,column,i,j,arr[20][20];
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
			if(i==j)
			{
				printf("%d1\t",arr[i][j]);
			}
			else
			{
				printf("%d0\t",arr[i][j]);
			}
		}
		printf("\n\n");
	}
}
	
	
	
	
	
	
	
	

