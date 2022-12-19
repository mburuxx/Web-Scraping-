#include <stdio.h>

/**
 * main - address of variables
 *
 * Return : 0
 */

int main(void)
{
	int c, *p;
	char i;

	c = 24;
	p = &c;

	printf("The address of the 'int' is at: %p\n", &c);
	printf("The address of the 'char' is at: %p\n", &i);
	printf("The value of the variable 'p' is : %p\n", p);

	return (0);
}
