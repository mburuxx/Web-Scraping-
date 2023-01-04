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

	/* Pointer adresses */
	printf("The address of the 'int' is at: %p\n", &c);
	printf("The value of the 'c' is: %d\n", c);
	printf("The value of the variable 'p' is : %p\n", p);

	/* Dereferencing */
	*p = 108;
	printf("The new value of 'c' is: %d\n", c);
	return (0);
}
