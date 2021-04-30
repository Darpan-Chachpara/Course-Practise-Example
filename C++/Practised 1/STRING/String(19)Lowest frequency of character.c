#include<stdio.h>
#include<string.h>
main()
{
	char a[1000],result;
	int i,min=0;
	int fre[256]={0}; // the string will be working form 0 to 256
	
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	
	for(i=0;a[i]!='\0';i++)
	{									// in all this 3 values is going to assign [element(anything),a[i=0,1,2,3..],asci value(65,66,67..)
		fre[a[i]]++;					//  after the fre[a[i]] is been calculated the i.e thr number of time the elements is present
	}
	
	for(i=0;i<256;i++)
	{
		if(fre[i]!=0) // fre[i] where (i=65 so fre[65] = number of time that elements present(3) the value of inside array after the counting the elemnts eg:65,66,67
		{
			if(fre[min]==0 || fre[i]<fre[min]) // the value of fre[min]==0 is used if the 0 is present in between or in last
			{								  // fre[min] the value of the first number present in the string
				min=i;
			}
		}
	}
	printf("\n THE MINIMUM OCCURING CHARACTER IN A GIVEN STRING : \n\n\t\t\t'%c'\n",min);	
}

