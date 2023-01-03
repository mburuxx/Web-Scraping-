#include <stdio.h>

/**
 * main - Solve me
 *
 * Return: Always 0
 */

int main(void)
{
	int a[5];
	int *p;
	int *p2;

	*a = 98;
	*(a + 1) = 198;
	printf("The value of a[1] is:%d\n", *(a + 1));
	printf("The memory address of a[1] is: %p\n", (a + 1));
	*(a + 2) = 298;
	a[3] = 398;
	printf("The value of a[3] is:%d\n", a[3]);
	printf("The memory address of a[3] is: %p\n", &a[3]);
	a[4] = 498;
	p = a + 1; /* p has been assigned memory address of a[1] */
	printf("The value of p is: %p\n", p);
	*p = 98; /* assigns a value of 98 to a[1] */
	printf("*p: %d\n", *p);
	printf("The new value of a[1] is:%d\n", a[1]);
	p2 = a + 3; /* pointer variable p2 has been assigned memory address of a[3] */
	printf("The value of p2 is: %p\n", p2);
	*p2 = *p + 1337; /* assigns new value to a[3] */
	printf("The new value of a[3] is:%d\n", *p2);
	return (0);
}
