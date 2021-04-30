#include<stdio.h>
main()
{
	int row,column,i,j,arr1[20][20],sum=0;
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
	
	printf("\n THE MATRIX\n");
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
		if(i==j)
		/*for(row1=0;row1=row;row1++)
		{
		sum=sum+arr1[row1][row1];
		}*/
		{
			sum=sum+arr1[i][j];
		}
	}
	}
	printf("\n THE SUM OF DIAGONAL ELEMENTS OF A MATRIX : \t%d \n\n",sum);
}
