#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
  int z = 5;
  int y = 10,x;
  
  if(z>3 && y<20)
  {
  x = (z*2)+ ++y;
  
  }
  else
  { 
  x = z+y;
  
  }
  printf("O valor de x é %d", x);
  
  system("PAUSE");	
  return 0;
}
