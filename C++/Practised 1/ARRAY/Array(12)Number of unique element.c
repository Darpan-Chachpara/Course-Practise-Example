#include<stdio.h>
main() 
{
 int arr[1000],n,i,j;
 printf("\n ENTER THE SIZE OF THE ELEMENT : \n\n");
 scanf("%d",&n);
 printf("\n ENTER THE ELEMENTS IN THE ARRAY : \n\n",n);
  
 for(i=0;i<n;i++)
 {
  scanf("%d",&arr[i]);
 }
 printf("\n UNIQUE ELEMENTS \n\n");
 for(i=0;i<n;i++)
  {
  for(j=0;j<i;j++)
  	   {
      if (arr[i]==arr[j])
       break;
       }
      
     if(i==j)
	 {
      printf("\n %d ",arr[i]);
  	 }
 }
}
