#include <stdio.h>
  main ()
{
    int arr[20][20],i,j,row,column,temp;
 
    printf("\n ENTER THE NUMBER OF ROW :  \n\n");
    scanf("%d",&row);
    printf("\n ENTER THE NUMBER OF COLUMN :  \n\n");
    scanf("%d",&column);
    if(row == column)
    {
        printf("\n ENTER THE ELEMENTS IN THE MATRIX : \n\n");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
            	printf("\n ENTER ELEMENT a [%d][%d]: ",i+1,j+1);
                scanf("%d", &arr[i][j]);
            }
        }
        printf("\n THE MATRIX IS  \n\n");
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                printf("%d\t", arr[i][j]);
            }
            printf("\n");
        }
        for(i=0;i<row;i++)
        {
        	//for(j=0;j<column;j++)
        	//{
            temp=arr[i][i];
            arr[i][i]=arr[i][column-i-1];
            arr[i][column-i-1]=temp;
        //}
        }
        
        printf("\n");
        for(i=0;i<column;i++)
        {
            for(j=0;j<row;j++)
            {
                printf("%d\t",arr[i][j]);
            }
            printf("\n");
        }
    }
    else
        printf("\n THE GIVEN ORDER IS NOT A MATRIX\n");
}
