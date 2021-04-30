# include <stdio.h>
void fun1();
void fun2();
void fun3();
main()
{
  printf("\nI am in Main\n");
  fun1();
  printf("\nI am Finally Back in Main BYE BYE\n");
}
void fun1()
  {
    printf("\nI am in function 1\n");
    fun2(1);
    printf("\nback in function 1\n");
  }
void fun2(int a)
  {
    printf("\nI am in Function 2\n");
   fun3(420);
   printf("\nback in function2 and the values is %d \n",a);
  }
  void  fun3(int a)
  {
   printf("\nWe can't have nested function definition but nested call\n");
   printf("This is in function3 having value %d\n",a);
  }
  
  
