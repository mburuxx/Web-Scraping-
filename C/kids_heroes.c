// Program that prints three kids and their favourite hero

#include <stdio.h>
#include <string.h>

int main()
{

	//kid1 holds 11 characters
	char kid1[11];
	//kid2 holds 7 characters
	char kid2[] = "Maddie";
	//kid3 holds 7 characters that ar explicitly stated
	char kid3[7] = "Bennie";

	//hero1 holds 7 characters
	char hero1[] = "Batman";
	//hero2 holds 7 characters but has an allowance for more
	char hero2[25] = "Spiderman";
	//hero3 just defined
	char hero3 [34];

	/* initialize kid1 */
	kid1[0] = 'K';
	kid1[1] = 'a';
	kid1[2] = 't';
	kid1[3] = 'i';
	kid1[4] = 'e';
	kid1[5] = '\0';

	/* initialize hero3 */
	//strcpy (hero3, "The Incredible Hulk");

	//print statements
	printf ("%s\'s favourite hero is %s", kid1, hero1);
	printf ("\n%s\'s favourite hero is %s", kid2, hero2);
	printf ("\n%s\'s favourite hero is %s\n", kid3, hero3);

	return 0;
}
