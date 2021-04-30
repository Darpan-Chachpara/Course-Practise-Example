#include <stdio.h>
 
int main()
{
  int i, num; 
  printf("\n ENTER THE VALUE \n");
  scanf("%d", &num);
  for (i=1;i<=num;i++)
   {
     if(num%i==0)
        {
		 printf("\n THE FACTOR ARE %d  ", i);
		}
   }
}
