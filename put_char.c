// this program prints the characters of a string
#include <stdio.h>
#include <string.h>

int main ()
{

	// create a character variable
	char messg[] = "print the characters";
	int i;
	// iterate through the letters
	for (i = 0; i < strlen(messg); i++)
	{
		putchar(messg[i]);
	}
	putchar('\n');
	// print a character

	// terminate the program
	return 0;
}
