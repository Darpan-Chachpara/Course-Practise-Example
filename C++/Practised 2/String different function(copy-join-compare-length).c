#include<stdio.h>
#include<string.h>
main()
{
	char str1[20]="DARPAN";
	char str2[20]=" CHACHPARA";
	char str3[20];
	int length;
	
	//copy str1 into str3
	strcpy(str3,str1);
	printf("strcpy(str3,str1) : %s\n",str3);
	
	//concatenates(join) str1 and str2
	strcat(str1,str2);
	printf("strcat(str1,str2) : %s\n",str1);
	
	//total length of str1 after the concatenates(join)
	length=strlen(str1);
	printf("strlen(str1) : %d\n",length);

}
