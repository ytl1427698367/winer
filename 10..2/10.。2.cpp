#include<stdio.h>
#include<stdlib.h>
int main()
{
	int i, j, k;
	for (i = 0; i < 7; i++){
		k = abs(i - 7 / 2);
		printf("\n");
		for (j = 0; j < k; j++)
			printf(" ");
		for (j = 0; j < (7 - 2 * k); j++)
			printf("*");

	}
	system("pause");
}