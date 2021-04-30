#include<stdio.h>
void fun(int arr[]); // no arr needed
main()
{
	int arr[]={1000,2000,3000,4000,5000,6000};
	//printf("\n The base address is %u\n",&arr); //u is for unsigned
	fun(arr);
}

void fun(int arr[])
{
	int i;
	for(i=0;i<=5;i++)
	{
		printf("\n The value of arr[%d] is %d\n",i,arr[i]);
		//printf("\n The address of arr[%d] is %u\n",i,arr[i]);
	}
}
