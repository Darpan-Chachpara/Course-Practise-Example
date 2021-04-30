#include<stdio.h>
main()
{
	char Name[1000];
	int Marks,i,Num;
	printf("\n ENTER NUMBER OF STUDENTS : \n\n");
	scanf("%d",&Num);
	FILE *fptr;
	fptr=fopen("C:\\Users\\Darpan\\Desktop\\TRAINING\\FILES\\NAME-MARKS OF STUDENTS USING WRITE APPEND READ\\student detail using write append read.txt","a");
	if(fptr==NULL)
	{
		printf("\n NO SUCH DIRECTIRY OF SUCH FILE IN THE GIVEN PATH  \n\n");
		exit (1);
	}
	for(i=0;i<Num;++i)
	{
		printf("\n FOR STUDENTS :   '%d' \n\n ENTER NAME : \t",i+1);
		scanf("%s",&Name);
		printf("\n ENTER MARKS : \t");
		scanf("%d",&Marks);
		
		fprintf(fptr,"\n NAME : %s \n MARKS : %d\n",Name,Marks);
	}
	fclose(fptr);
}
