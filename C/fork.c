#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main()
{
    int n;

    printf("Enter a number: ");
    scanf("%d", &n);

    if (fork() == 0)
    {
        if (n % 2 == 0)
            printf("Integer is Even, I'm in Child Process and Square is %d\n", n*n);
        else
            printf("Integer is Odd, I'm in Child Process and Cube is %d\n", n*n*n);
    }
    else
    {
        if (n % 2 == 0)
            printf("Integer is Even, I'm in Parent Process and Cube is %d\n", n*n*n);
        else
            printf("Integer is Odd, I'm in Parent Process and Square is %d\n", n*n);
    }

    return 0;
}
