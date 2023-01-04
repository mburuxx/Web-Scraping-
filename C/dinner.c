/* Program will ask users for the topping they woud want, the date, number of slices */
#include <stdio.h>

int main(){

//initialize the variables
float cost;
char topping[30];
int slices;
int month, day, year;

//obtain topping name
printf("What flavor would you like as your topping: \n");
scanf(" %s", topping);

//obtain number of slices
printf("How many slices of %s pizza would you have in one sitting: \n", topping);
scanf(" %d", &slices);

//display the cost
printf("How much does pizza cost in your area: (enter $XX.XX)\n");
scanf(" $%f", &cost);

printf("What is the day today: (enter XX/XX/XX)\n");
scanf(" %d/%d/%d", &month, &day, &year);

printf("You will get %d slices of the %s pizza at a fair cost of %.2f", slices, topping, cost);
printf(" or could wait till %d/%d/%d to get double for the same cost.\n", month, day, year);

return 0;
}
