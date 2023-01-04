#include <stdio.h>
/**
 * main - Illustrate pointer arithmetics
 *
 * Return: 0
 */

int main(void)
{
	int a[5];

	*a = 45;
	*(a + 1) = 89;
	*(a + 2) = 75;
	*(a + 3) = 129;
	*(a + 4) = 105;

	printf("The value of a[2] is: %d\n", *(a + 2));
	printf("The value of a[5] is: %d\n", *(a + 5));
	printf("------------------------\n");
	printf("The address of the array is: %p\n", a);
	printf("The address of 'a[3]' is: %p\n", (a + 3));
	printf("The address of 'a[3]' is: %p\n", &(*(a + 3)));

	return (0);
}
