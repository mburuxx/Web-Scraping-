#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main()
{
    FILE *fp;
    char ch, filename[100];

    printf("Enter a filename :");
    scanf("%s", filename);

    fp = fopen(filename, "r");

    if (fp == NULL)
    {
        perror("Error while opening the file.\n");
        exit(EXIT_FAILURE);
    }

    printf("The contents of %s file are :\n", filename);

    while ((ch = fgetc(fp)) != EOF)
    {
        if (islower(ch))
        {
            ch = toupper(ch);
        }

        printf("%c", ch);
    }

    fclose(fp);
    return 0;
}