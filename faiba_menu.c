/* This program creates a display menu used in faiba mobile when you press *111# */

#include <stdio.h>
#include <stdlib.h>

int main ()
{
	// initialize choice
	int choice;

	// print the initial balance message
	printf("Your balance is Ksh. %.2f\n", 0.02);

	// display the choices to the user
	printf("1. Buy bundles\n");
	printf("2. Mobile plans\n");
	printf("3. Fisi hour\n");
	printf("4. Airtime Transfer\n");
	printf("5. My number\n");
	printf("6. AOC\n");
	printf("7. Data Manager\n");
	printf("8. Exit\n");

	do
	{
		// ask the user for their choice
		printf("Enter your choice: ");
		scanf(" %d", &choice);

		// display a message of what will happen based on their choice

	
		switch (choice)
		{
			case(1) : printf("Buy Bundles\n");
					  printf("1. Daily Bundles\n");
					  printf("2. 3Days Bundles\n");
					  printf("3. Weekly Bundles\n");
					  printf("*3 MORE\n");
					  break;

			case(2) : printf("1. Buy Chui for Ksh. %d valid for 30 days?\n", 500);
					  printf("2. Buy Kifaru for Ksh %d valid for 30 days?\n", 700);
					  printf("3. Buy Ndovu for Ksh. %d valid for 30 days?\n", 1500);
					  printf("*4 MORE");
					  break;

			case(3) : printf("1. Buy Fisi Hour for Ksh. %d valid for %d minutes?\n", 150, 60);
					  printf("2. Main menu\n");
					  break;

			case(4) : printf("Enter number.\n");
					  printf("Use the format 07XX-XXX-XXX\n");
					  break;

			case(5) : printf("Sorry, your request couldn\'t be completed at this moment. ");
					  printf("Please try again later.\n");
					  break;

			case(6) : printf("1. Subscribe to AOC offer?\n");	
					  printf("2. Unsubscribe from AOC offer?\n");
					  printf("3. Main menu\n");
					  break;

			case(7) : printf("1. Activate DataMngr?\n");
					  printf("2. De-Activate DataMngr\n");
					  printf("3. Check status?\n");
					  printf("4. Main menu\n");
					  break;
					
			case(8) : exit(1);
					  default : printf("\n%d is an invalid choice.\n", choice);
					  printf("Try Again!\n");
					  break;
		}
	} while ((choice < 1) || (choice > 8));

	// terminate the program
	return 0;
}