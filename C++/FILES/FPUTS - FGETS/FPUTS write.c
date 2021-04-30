#include<stdio.h>
main()
{
	FILE *fp;
	fp=fopen("C:\\Users\\Darpan\\Desktop\\TRAINING\\FILES\\FPUTS - FGETS\\fputsfgets.txt","w");
	fputs("DARPAN CHACHPARA _126_111 WELCOMES YOU \n\n",fp);
	fclose(fp);
}
