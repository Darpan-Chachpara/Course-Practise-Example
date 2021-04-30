#include<stdio.h>
main()
{
	int row,column,i,j,arr1[20][20],num;
	printf("\n ENTER THE NUMBER OF ROWS : \n\n");
	scanf("%d",&row);
	printf("\n ENTER THE NUMBER OF COLUMN : \n\n");
	scanf("%d",&column);
	
	printf("\n ENTER THE ELEMENTS OF 1st MATRIX : \n\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("\n ENTER ELEMENT a %d%d: ",i+1,j+1);
		scanf("%d",&arr1[i][j]);
	}
	}
	
	printf("\n ENTER THE NUMBER WHICH YOU WANT TO MULTIPLY : \n\n");
	scanf("%d",&num);
	
	printf("\n THE FIRST MATRIX\n");
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		printf("%d\t",arr1[i][j]);
	}
	printf("\n");
	}
	
	for(i=0;i<row;i++)
	{
	for(j=0;j<column;j++)
	{
		arr1[i][j]=num*arr1[i][j];
	}
	}
	printf("\n SCALAR MULTIPLICATION OF MATRIX : \n\n");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			printf("%d\t",arr1[i][j]);
		}
		printf("\n");
	}

}
