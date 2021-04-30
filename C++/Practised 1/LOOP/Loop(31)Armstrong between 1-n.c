#include <stdio.h>
main() 
{
   int num1, num2, i, originalNumber, rem, count = 0;
   double result = 0;
   printf("\n ENTER THE FIRST NUMBER\n\n");
   scanf("%d",&num1);
   printf("\n ENTER THE SECOND NUMBER\n\n");
   scanf("%d",&num2);	

   for(i=num1+1;i<num2;i++) 
   {
     	originalNumber=i;
      	while(originalNumber!=0)
	{
        originalNumber=originalNumber/10;
        count++;
    }
		originalNumber=i;
		while(originalNumber!=0) 
	{
         rem=originalNumber%10;
         result=result+pow(rem,count);
         originalNumber=originalNumber/10;
    }
      if (result==i) 
	{
        printf("\n THE ARMSTRONG NUMBER BETWEEN THE GIVEN INTERVAL ARE %d ",i);
    }
    /*else
    {
    	printf("\n THERE IS NO ARMSTRONG BETWEEN THE GIVEN INTERVAL %d",i);
	}*/
      count = 0;
      result = 0;
   }
}
