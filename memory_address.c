#include <stdio.h>

/**
 * main - address of variables
 *
 * Return : 0
 */

int main(void)
{
	int c;
	char i;

	printf("The address of the 'int' is at: %p\n", &c);
	printf("The address of the 'char' is at: %p\n", &i);

	return (0);
}
