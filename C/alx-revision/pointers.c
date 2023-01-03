#include <stdio.h>
/**
 * modif_my_char_var - Solve me
 *
 * Return: nothing
 */

void modif_my_char_var(char *cc, char ccc)
{
	*cc = 'o'; /* '**cc == p' has memory address of c hence can assign a new value */
	printf("The value of '*cc' is: %p\n", cc);
	printf("The value of c is :%c\n", *cc);
	ccc = 'l'; /* a useless parameter */
	printf("The value of 'ccc' is: %c\n", ccc);
}

/**
 * main - Solve me
 *
 * Return: Always 0
 */

int main(void)
{
	char c;
	char *p;

	p = &c; /* p stores the memory address of c */
	printf("The memory address of 'c' is: %p\n", p);
	c = 'H'; /* c is assigned a value */
	printf("The value of 'c' is: %d('%c')\n", c, c);
	modif_my_char_var(p, c); /* passes the memory address of c and also the value of integer c */
	printf("The new value of 'c' is: %c\n", c);
	return (0);
}
