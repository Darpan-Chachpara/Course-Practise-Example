#include <stdio.h>
int main()
 {
    int num1,num2,i;
    printf("\n ENTER THE FIRST NUMBER\n\n: ");
    scanf("%d",&num1);
    printf("\n ENTER THE SECOND NUMBER\n\n: ");
    scanf("%d",&num2);
    i=(num1 > num2) ? num1 : num2;

    while (1) 
	{
        if (i % num1 == 0 && i % num2 == 0) 
		{
            printf("\n\nThe LCM of %d and %d is %d.",num1,num2,i);
            break;
        }
        ++i;
    }
}

			// 15=3*5
			// 20=2*10(2*(2*5)
			// 15  3  5			
			// 20  2  2  5 
			// common number will be taken only one time
			// 3  5  2  2=====(5)will be taken one time
