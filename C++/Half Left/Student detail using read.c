#include<stdio.h>
main()
{
	int Marks;
	char Name[100];
	FILE *fptr;
	if((fptr=fopen("DC.txt","r"))==NULL)
	{
		printf("\n NO SUCH DIRECTIRY OF SUCH FILE IN THE GIVEN PATH  \n\n");
		exit(1);
	}
		fscanf(fptr,"%d%d",&Name,&Marks);
		printf("\n NAME : %s \n MARKS : %d\n",Name,Marks);
		fclose(fptr);
}
