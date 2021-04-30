#include<stdio.h>
#include<stdlib.h>
main()
{
	int num;
	FILE *fptr;
	if((fptr=fopen("C:\\Users\\Darpan\\Desktop\\TRAINING\\FILES\\FILE USING WRITE APPEND READ\\File using write append read.txt","r"))==NULL)
	{
		printf("\n NO SUCH FILE IN THIS DIRECTORY \n\n");
		exit(1);
	}
	fscanf(fptr,"%d",&num);
	printf("\n\n VALUE OF NUM = '%d'\n\n",num);
	fclose(fptr);
}
