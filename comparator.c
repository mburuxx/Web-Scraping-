#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b;
    printf("Enter two 3-bit signed numbers in 2's complement format: ");
    scanf("%d %d", &a, &b);

    // Perform subtraction
    int diff = a - b;

    // Compare result to 0
    if (diff > 0)
        printf("g = 1\n");
    else
        printf("g = 0\n");

    return 0;
}