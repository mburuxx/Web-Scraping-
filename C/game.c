/* This program will multiply two numbers and display the result for
as long as the user wants. Answering 'N' will break the loop. */

#include <stdio.h>
int main()
{
	// define the floating-point variables num1, num2, result
	float num1, num2, result;
	char choice; // define choice

	do { // in the do
	// ask user for input
		printf("Enter the first number: ");
		scanf(" %f", &num1);

		printf("Enter the second number: ");
		scanf(" %f", &num2);

		result = num1 * num2; // calculate the result
		printf("%.2f multiplied by %.2f is equal to %.2f\n", num1, num2, result);// print a statement

		// ask user if they would like to repeat the process
		printf("Would you like to try other numbers? (Y/N): ");
		scanf(" %c", &choice);

		if (choice == 'n'){
			choice = 'N';
		}
	}
	while (choice != 'N');
	return 0;// terminate
}
