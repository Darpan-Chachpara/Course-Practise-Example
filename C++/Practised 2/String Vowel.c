#include<stdio.h>
main()
{
	char s[]="DARPAN chachpara";
	int i=0,count=0;
	//while(i<=__)
	while(s[i]!=NULL)
	{
		if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U')
		{
			count++;
		}
		i++;
	}
	printf("\n THE NUMBER OF VOWELS %d",count);
}
