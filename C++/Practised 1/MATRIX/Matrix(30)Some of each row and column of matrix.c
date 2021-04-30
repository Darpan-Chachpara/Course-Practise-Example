#include <stdio.h>
main()
{
	int arr1[10][10],row,column,i,j,sum=0;
 
    printf("\n ENTER THE  NUMBER OF ROWS : \n\n");
    scanf("%d",&row);
    printf("\n ENTER THE  NUMBER OF COLUMNS : \n\n");
    scanf("%d",&column);
 
    printf("\n ENTER THE ELEMENTS IN MATRIX : \n");
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
	printf("\n\n");
	}
 
    for(i=0;i<row;i++) 
    {
    for(j=0;j<column;j++) 
    {
        sum=sum+arr1[i][j] ;
    }
        printf("SUM OF THE %d ROW IS = %d\n",i,sum);
        sum=0;
    }
        printf("\n\n");
    for(j=0;j<column;j++) 
    {
    for(i=0;i<row;i++)
    {
        sum=sum+arr1[i][j];
    }
        printf("SUM OF THE %d COLUMN IS = %d\n",j,sum);
        sum=0;
    } 
}
