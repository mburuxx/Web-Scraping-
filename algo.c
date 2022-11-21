/* This program calculates the amount of fuel needed for a journey */

#include <stdio.h>
int main()
{
	//initialie the variables
	int kilometres;
	int amount_fuel = 0;

	//prompt the user for the distance
	printf("Please enter the distance of the journey in kilometres: ");
	scanf(" %d", &kilometres);

	//coontinue only if kilometres is not zero
	if (kilometres > 0) {
		amount_fuel = 100 * kilometres;
		if (amount_fuel < 1500) {
			amount_fuel = 1500;
		}
		printf("Amount of fuel needed is %d litres\n", amount_fuel);
	}
	return 0;
}
