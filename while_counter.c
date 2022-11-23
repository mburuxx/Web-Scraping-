#include <stdio.h>
int main ()
{
	int ctr = 0;
	while (ctr <= 5) {
		printf("Count is at %d\n", ctr++);
	}
	while (ctr >= 1) {
		printf("Count is at %d\n", --ctr);
	}
	return 0;
}
