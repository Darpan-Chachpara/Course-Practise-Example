#include<stdio.h>
main()
{
	int arr[1000],i,n,odd,even;
	printf("\nENTER SIZE OF THE ARRAY : \n\n");
	scanf("%d",&n);
	printf("\n ENTER ELEMENT IN ARRAY : \n\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	even=0;
	odd=0;
	for(i=0;i<n;i++)
	{
		if(arr[i]%2==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
	}
	printf("\n TOTAL EVEN ELEMENTS : %d\n",even);
	printf("\n TOTAL ODD ELEMENTS : %d\n",odd);

}
