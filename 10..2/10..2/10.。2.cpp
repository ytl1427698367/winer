#define  _CRT_SECURE_NO_WARNINGS
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

int main(){
	int max = 0, i = 0;
	int x[10];
	printf("ÇëÊäÈë10¸öÊý");
	scanf("%d %d %d %d %d %d %d %d %d %d ", &x[0] ,& x[1], & x[2] ,& x[3], & x[4], & x[5] ,& x[6] ,& x[7] ,& x[8], & x[9]);
	max = x[0];
	for (i = 0; i <= 9; i++){
		if (max < x[i]){
			max = x[i];
		}
	}if (max>x[i]){
		max = max;

	}
	printf("%d", max);
	system("pause");
}
int main(){
	int i, num = 0, a;
	float sum = 0;
	for (i = 0; i < 10; i++){
		scanf("%d", &a);
		if (a <= 0)continue;
		num++;
		sum += a;

	}
	printf("%d", sum);
	printf("%f", sum / num);
	system("pause");
}