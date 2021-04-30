#include<stdio.h>
main()
{
    int arr[1000],n,i,max1,max2;
    printf("\nENTER SIZE OF THE ARRAY : \n\n");
    scanf("%d", &n); 
    printf("Enter elements in the array: ");
    for(i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }

    max1 = max2 = 1000;
    for(i=0; i<n; i++)
    {
        if(arr[i] > max1)
        {
        	max2 = max1;
            max1 = arr[i];
        }
        else if(arr[i] > max2 && arr[i] < max1)
        {
            
            max2 = arr[i];
        }
    }

    printf("First largest = %d\n", max1);
    printf("Second largest = %d", max2);

    return 0;
}

