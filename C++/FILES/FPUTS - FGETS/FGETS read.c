#include<stdio.h>
main()
{
	FILE *fp;
	char text[500];
	fp=fopen("C:\\Users\\Darpan\\Desktop\\TRAINING\\FILES\\FPUTS - FGETS\\fputsfgets.txt","r");
	printf("%s",fgets(text,200,fp));
	fclose(fp);
}
