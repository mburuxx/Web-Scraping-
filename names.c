/* A program that prompts the user for their initials, their age and favourite number */
#include <stdio.h>

int main ()
{
	//define variables to be used
	char first_initial;
	char last_initial;
	int age;
	int favourite_number;

	printf("Enter your first initial: ");
	scanf(" %c", &first_initial);

	printf("\nEnter your second initial: ");
	scanf(" %c", &last_initial);

	printf("\nEnter your age: ");
	scanf(" %d", &age);

	printf("\nEnter your favourite number: ");
	scanf(" %d", &favourite_number);

	printf("\nAt %d years of age, %c %c\'s favourite number is %d\n", age, first_initial, last_initial, favourite_number);
	return 0;
}
