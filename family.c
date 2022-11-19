/* The program lists 3 kids, their school supply needs as well as the cost to buy items */
#include <stdio.h>
#include <string.h>
#include "program.h"

int main()
{
	int age;
	float price;
	int items;
	char childname[10] = "Thomas";
	printf("%s have %d kids only.", FAMILY, KIDS);

	age = 12;
	strcpy (childname, "Brian");
	printf("\nTheir youngest son %s is aged %d years.", childname, age);

	price = 200;
	items = 4;
	printf("\nHe needs %d books each retailing at %.2f.\n", items, price);
	return 0;
}

