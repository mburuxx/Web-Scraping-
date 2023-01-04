/* This program aims at incrementing a value and printing the value at certain instances */
#include <stdio.h>
int main()
{
// initiate the variable
int counter = 0;
// while variable is less than 10
while (counter <= 10) {
	// print a message
	printf("Count is %d\n", counter);
	// increment the value
	counter += 1;
	}
return 0;
}
