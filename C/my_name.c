/* This program prints a name using the putchar characters */
// initiate variable
#include <stdio.h>
#include <string.h>
int main ()
{
  char name[57]= "buda yangu ni mnoma";
  int i;
// print variable
// the putchar will iterate through the above string
// then print character by character
  for (i = 0; i < strlen(name); i++)
    {
      putchar(name[i]);
    }
  putchar('\n');
}

