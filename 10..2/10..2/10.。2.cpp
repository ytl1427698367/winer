#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
//
//int main()
//{
//	int i, j, k;
//	for (i = 0; i < 7; i++){
//		k = abs(i - 7 / 2);
//		printf("\n");
//		for (j = 0; j < k; j++)
//			printf(" ");
//		for (j = 0; j < (7 - 2 * k); j++)
//			printf("*");
//
//	}
//	system("pause");
//}
//
//int main(){
//	int max = 0, i = 0;
//	int x[10];
//	printf("请输入10个数");
//	scanf("%d %d %d %d %d %d %d %d %d %d ", &x[0] ,& x[1], & x[2] ,& x[3], & x[4], & x[5] ,& x[6] ,& x[7] ,& x[8], & x[9]);
//	max = x[0];
//	for (i = 0; i <= 9; i++){
//		if (max < x[i]){
//			max = x[i];
//		}
//	}if (max>x[i]){
//		max = max;
//
//	}
//	printf("%d", max);
//	system("pause");
//}
//int main(){
//	int i, num = 0, a;
//	float sum = 0;
//	for (i = 0; i < 10; i++){
//		scanf("%d", &a);
//		if (a <= 0)continue;
//		num++;
//		sum += a;
//
//	}
//	printf("%d", sum);
//	printf("%f", sum / num);
//	system("pause");
//}
//int main(){
//	int i = 0, j, k, max, min;
//	int a[5];
//	for (i = 0; i < 5; i++)
//		scanf("%d", &a[i]);
//	max = min = a[0];
//	for (i = 0; i < 5; i++){
//		if (max < a[i]){
//			max = a[i];
//			j = i;
//		}
//		else if
//			(min>a[i]){
//			min = a[i];
//			k = i;
//		}
//	}
//	printf("max%d min%d", j, k);
//	system("pause");
//}
//int main(){
//	double i=2, sum;
//	for (i = 2; i < 101;i+=2){
//		
//		sum = 1 / i;
//		
//		
//	}printf("%f", sum);
//	system("pause"
int main()//杨辉三角
{
	int a[10][10], i, j;//下面的循环将第一列的元素和对角线元素赋值为1
	for (i = 0; i < 10; i++){
		a[i][0] = 1;
		a[i][i] = 1;
	}//下面循环用于求其他元素的值，为他正上方和斜上方两元素的和
	for (i = 2; i < 10;i++)
	for (j = 1; j < i; j++)
		a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
	//下面的循环用于按行求的二维数组元素的值
	for (i = 0; i < 10; i++){
		for (j = 0; j <= i; j++)
			printf("%6d", a[i][j]);
		printf("\n");
		system("pause");
	}
}