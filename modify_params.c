#include <stdio.h>

/**
 * modify_params - print the value of m as 402
 * @m: - pointer to a varible
 *
 */

void modify_params(int *m)
{
	printf("The value of 'm' before the function call: %p\n", m);
	printf("The address of 'm': %p\n", &m);
	*m = 402;
}

/**
 * main- how to change the value of a paramemter from outside
 * the function it is called in using a pointer
 *
 * Return: Always 0
 */

int main(void)
{
	int n, *p;

	n = 98;
	p = &n;

	printf("The value of 'n': %d\n", n);
	printf("The address of 'n' is: %p\n", &n);
	printf("The value of 'p' is: %p\n", p);
	printf("The address of 'p' is: %p\n", &p);
	modify_params(p);
	printf("The value of 'n' after function call is: %d\n", n);

	return (0);
}
