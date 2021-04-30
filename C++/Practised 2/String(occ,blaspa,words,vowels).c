#include<stdio.h>
int occ(char []);
int blaspa(char []);
int noword(char []);
int vowels(char []);

main()
{
	char string[50];
	int Occurance,BlankSpace,NoOfWords,Vowels;
	printf("\n ENTER A STRING : \n\n");
	gets(string);
	
	Occurance=occ(string);
	BlankSpace=blaspa(string);
	NoOfWords=noword(string);
	Vowels=vowels(string);
	
	printf("\n\n OCCURANCE OF A IS %d\n\n",Occurance);
	printf("\n\n BLANK SPACE ARE %d\n\n",BlankSpace);
	printf("\n\n NO OF WORDS ARE %d\n\n",NoOfWords);
	printf("\n\n VOWELS IN THE STRING ARE %d\n\n",Vowels);
}

int occ(char a[])
{
	int flag=0,i;
	for(i=0;i<=50;i++)
	{
		if(a[i]=='A') //only will check for a
		{
			flag++;
		}
	}
	return flag;	
}

int blaspa(char a[])
{
	int flag=0,i;
	for(i=0;i<=50;i++)
	{
		if(a[i]==' ')
		{
			flag++;
		}
	}
	return flag;
}

int noword(char a[])
{
	int flag=1,i;
	for(i=0;i<=50;i++)
	{
		if(a[i]==' ')
		{
			flag++;
		}
	}
	return flag;
}

int vowels(char a[])
{
	int flag=0,i;
	for(i=0;i<=50;i++)
	{
		switch (a[i])
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':	
			case 'i':	
			case 'I':	
			case 'o':	
			case 'O':	
			case 'u':	
			case 'U':
			flag++;	
		}
				
	}
		return flag;
}
