/* This program prints a name using the putchar characters */
// initiate variable
#include <stdio.h>
#include <string.h>
int main ()
{
  char name[17];
  int i;
// print variable
  name['b'];
  name['r'];
  name['i'];
  name['a'];
  name['n'];
  name['\0'];

  for (i = 0; i < strlen(name); i++)
    {
      putchar(name[i]);
    }
  putchar('\n');
}

