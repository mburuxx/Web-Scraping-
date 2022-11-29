#include <stdio.h>
#include <stdlib.h>

/* This function is used by qsort to compare two array elements and determine how they should be sorted. */
int compare_int(const void *elem1, const void *elem2)
{
    int f = *((int*)elem1);  /* first element to compare */
    int s = *((int*)elem2);  /* second element to compare */
    if (f % 2 != 0 && s % 2 == 0)  /* if first element is odd and second element is even */
        return -1;  /* first element should come before second element in sorted array */
    if (f % 2 == 0 && s % 2 != 0)  /* if first element is even and second element is odd */
        return 1;  /* second element should come before first element in sorted array */
    return (f - s);  /* elements are neither both odd or both even, so sort in ascending order */
}

int main()
{
    int i, n, array[10];
    printf("Enter 10 values: ");
    for (i = 0; i < 10; i++)
        scanf("%d", &array[i]);

    printf("\nBefore sorting:\n");
    for (i = 0; i < 10; i++)
        printf("%d ", array[i]);

    qsort(array, 10, sizeof(int), compare_int);  /* sort array using compare_int function */

    printf("\nAfter sorting:\n");
    for (i = 0; i < 10; i++)
        printf("%d ", array[i]);
    return 0;
}