
#include <stdio.h>

int main()
{
    int number_of_stars;

    printf("Enter n (must be greater than 0): ");
    scanf("%d", &number_of_stars);

    if (number_of_stars <= 0)
    {
        printf("Invalid Entry!");
    }

    for (int num = 0; num < number_of_stars; num++)
    {
        for (int star = 0; star <= num; star++)
        {
            if (star == 0 || star == num || num == number_of_stars - 1)
            {
                printf("* ");
            }
            else
            {
                printf("  ");
            }
        }
        printf("\n");
    }

    return 0;
}