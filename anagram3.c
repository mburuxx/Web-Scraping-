#include <stdio.h>
#include <string.h>

int anagram(char *word);

int main()
{
    char word[8];
    printf("Enter a word: ");
    scanf("%s", word);
    anagram(word);
    char temp[9]
    return 0;
}

int anagram(char *word)
{
    int i, j, k;
    char anagrams[362880][9], temp[9];
    int n = strlen(word);
    
    if(n > 8)
    {
        printf("Error: word must be less than 8 characters");
        return 1;
    }
    
    for(i = 0; i < n; i++)
    {
        if(!((word[i] >= 'a' && word[i] <= 'z') || (word[i] >= 'A' && word[i] <= 'Z')))
        {
            printf("Error: word must only contain alphabet characters");
            return 1;
        }
        
        strcpy(anagrams[i], word);
    }
    
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n - 1; j++)
        {
            if(anagrams[j][i] > anagrams[j + 1][i])
            {
                strcpy(temp, anagrams[j]);
                strcpy(anagrams[j], anagrams[j + 1]);
                strcpy(anagrams[j + 1], temp);
            }
        }
    }
    
    for(i = 0; i < n; i++)
    {
        for(j = i + 1; j < n; j++)
        {
            if(strcmp(anagrams[i], anagrams[j]) == 0)
            {
                for(k = j; k < n - 1; k++)
                {
                    strcpy(anagrams[k], anagrams[k + 1]);
                }
                n--;
                j--;
            }
        }
    }
    
    for(i = 0; i < n; i++)
    {
        printf("%s\n", anagrams[i]);
    }
    
    return 0;
}