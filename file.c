#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
int main(){
	printf("hello world\n");
	system("pause");
	return 0;
}
求输入十个数，正数的个数及其平均值
void main()
{
	
	int a, i, sum = 0, count=0;
	printf("请输入十个数\n");
	
	for (i = 0; i < 10; i++)
	{
		scanf("%d", &a);
		if (a < 0){
			continue;
		}
		else if (a>0)
		{
			count++;
			sum = sum + a;

		}
	}
	printf("正数的个数为%d", count);//输出正数的个数
		printf("正数的和为%d", sum);//输出所有正数的和
		printf("\n");
		printf("正数的平均值为%d\n", sum / count);//求均值
		system("pause");
}
//要求输出图案
//此题要用到两重循环，外循环和内循环
void main()
{
	int i = 0, j = 0;
	for (i = 0; i <= 10; i++)//外循环
	{
		for (j = 0; j <= i; j++)//内循环
			putchar('*');
		printf("\n");
	}
	system("pause");
}
void main()
{
	int i, j;
	for (i = 1; i <= 9; i++)
	{
		for (j = 1; j <= i; j++){

			printf("%d*%d=%d  ", i, j, i*j);
		}
			printf("\n");
		}
	
	system("pause");
}