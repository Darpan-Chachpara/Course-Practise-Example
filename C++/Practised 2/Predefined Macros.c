#include<stdio.h>
main()
{
	printf("\n File : %s\n",__FILE__);
	printf("\n Date : %s\n",__DATE__);
	printf("\n Time : %s\n",__TIME__);
	printf("\n Line : %d\n",__LINE__);
	printf("\n ANSI : %d\n",__STDC__);
}
