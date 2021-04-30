#include<stdio.h>
main()
{
	int i,j,k;
	char tem;
	char a[1000];
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	strrev(a);
	
	for(i=j=k=0;a[i];i++)
	{
		if(a[i]==" " || a[i+1]=="\0")
		{
			for(a[i]=="\0"?(k=i):(k=i-1);j<k;j++,k--)
			{
				tem=a[j];
				a[j]=a[k];
				a[k]=tem;
			}
			j=i+1;
		}
	}
	printf("\n THE REVERSE ORDER OF WORDS ARE : \n\n\t\t\t\t  %s",a);	
}
