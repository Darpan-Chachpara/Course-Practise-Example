#include<stdio.h>
main()
{
	int num;
	FILE *fptr;
	
	fptr=fopen("C:\\Users\\Darpan\\Desktop\\TRAINING\\FILES\\FILE USING WRITE APPEND READ\\File using write append read.txt","w");
	if(fptr==NULL)
	{
		printf("\n NO SUCH FILE PRESNET IN THIS DIRECTORY \n\n");
		exit(1);
	}
	printf("\n ENTER THE NUMBER : \n\n");
	scanf("%d",&num);
	fprintf(fptr,"%d",num);
	fclose(fptr);
}
