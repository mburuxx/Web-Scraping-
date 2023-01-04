// in this program, for every occurent of the outer loop, the inner loop is executed
#include <stdio.h>
int main()
{
	int o, i;
	for (o=1; o<=3; o++)
	{
		for (i=1; i<=5; i++)
		{
			printf("%d ", i);
		}
	printf("\n");
	}
	return 0;
}
