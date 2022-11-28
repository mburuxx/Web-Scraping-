/* In this program, I will demonstrate the use of getchar and putchar */
// initiate variables
#include <stdio.h>
#include <string.h>

int main()
{
  char message[30];
  int i;
  
  // print a statement to the user for instructions
  printf("Type not more than 30 characters then press Enter... \n");
  
  // iterate through the variable so as to get the characters
  for (i= 0; i < 30; i++)
    {
      message[i] = getchar();
      //terminate the loop
      if (message[i] == '\n')
	{
	  i--;
	  break;
	}
    }
  putchar('\n');
  // iterate through the variable to output the characters
  for ( ; i >= 0; i--)
    {
      putchar(message[i]);
    }
  putchar('\n');

  return(0); //terminate program
}
