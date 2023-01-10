#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
	int i, sum;

	printf("argc : %d\n", argc);
	printf("Program name: %s\n", argv[0]);

	printf("Let's see what we got here...\n");
	if (argc > 1)
	{
		for (i = 1; i < argc; i++)
		{
			printf("argv[%d] : %s\n", i, argv[i]);
			sum = sum + atoi(argv[i]);
		}
		printf("Total: %d\n", sum);
	}
	return (0);
}
