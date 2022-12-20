#include <stdio.h>

/**
 * main - accessing elements of an array
 *
 * Return: Always 0
 */

int main(void)
{
	int t[5];

	t[0] = 98;
	t[1] = 402;
	t[2] = 76;
	t[3] = 33;
	t[4] = 209;

	printf("The value of 't[3]' is: %d\n", t[3]);
	printf("The value of 't[0] is: %d\n", t[0]);
	printf("The address of 't[1] is: %p\n", &(t[1]));
	printf("The address of 't[4] is: %p\n", &(t[4]));

	// value of first element is address of first element
	printf("'t': %p\n", t);
	printf("'t[0]': %p\n", &t[0]);
	return (0);
}
