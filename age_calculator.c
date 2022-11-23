/* This program asks the user for their birth year and calculates
how old they will be in the current year. (it also checks to make
sure a future year has not been entered.) It then tells the user if
they were born in a leap year. */

#include <stdio.h>
#define CURRENTYEAR 2022 // define current year

int main ()
{
	int birthYear; // initialize year of birth
	int age, numPears; // initialize age
	//char name  = 'B'; 
	printf("Enter your year of birth: "); // ask user to enter year of birth
	scanf(" %d", &birthYear);

	// if year of birth is greater than current year, enter year again
	if (birthYear > CURRENTYEAR) {
		printf("It is not possible to be born during this year.\n");
		printf("Please enter the year of birth once again: ");
		scanf(" %d" ,&birthYear);
	}

	// calculate the age
	age = CURRENTYEAR - birthYear;
	printf("Your current age is %d years.\n", age);

	// check if birth year is a leap year
	if (birthYear % 4 == 0) {
		printf("You were born in a leap year!\n");
	}

/* The section below demonstrates the use of a conditional operator to replace the if statement */
	printf("Enter number of pears: ");
	scanf(" %d", &numPears);
	printf("You have %d pear%s\n", numPears, (numPears > 1)? ("s."):("."));
	//printf("The size in memory occupied is %d. bytes.", &sizeof(name));
	return 0;
}
