#include <stdio.h>
/**
 * main - gets data from user for an array and prints it
 *
 * Return: Always 0
 */

int main(void)
{
	int disp[5][4];
	int i, j;

	for (i = 0; i < 5; i++)
	{
		for (j = 0; j < 4; j++)
		{
			printf("Enter elements of the array: disp[%d][%d]:", i, j);
			scanf("%d", &disp[i][j]);
		}
	}
	printf("----Printing the elements---\n");

	for (i = 0; i < 5; i++)
	{
		for (j = 0; j < 4; j++)
		{
			printf("%d ", disp[i][j]);
			if (j == 3)
				printf("\n");
		}
	}

	return (0);
}
