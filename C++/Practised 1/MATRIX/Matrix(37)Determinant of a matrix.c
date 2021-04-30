#include<stdio.h>
main()
{
	int row,column,i,j,arr[20][20];
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
	
determinant= arr[0][0]*((arr[1][1]*arr[2][2])-(arr[2][1]*arr[1][2])) 
- arr[0][1]*((arr[1][0]*arr[2][2])-(arr[2][0]*arr[1][2])) 
+ arr[0][2]*((arr[1][0]*arr[2][1])-(arr[2][0]*arr[1][1]));

printf("\n DETERMINANT OF MATRIX : %ld",determinant);
}
