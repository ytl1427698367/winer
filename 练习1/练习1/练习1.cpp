//define  _CRT_SECURE_NO_WARNINGS 
//#include<stdio.h>
//#include<stdlib.h>
////两个int（32位）整数m和n的二进制表达中，有多少个位(bit)不同？
//int Dif_bits(int m, int n)
//{
//	//异或的特征：相同为0.相异为1
//	//所以先异或得到一个值，然后数出这个值中1的个数
//	int count = 0;
//	int value = m^n;
//	while (value != 0)
//	{
//		if ((value & 1) == 1)
//		{
//			count++;
//		}
//		value = value >> 1;
//	}
//	return count;
//}
//int main()
//{
//	int num1, num2;
//	scanf("%d %d", &num1, &num2);
//	int count = Dif_bits(num1, num2);
//	printf("%d", count);
//	system("pause");
//	return 0;
////int er(int n)
////{
////	if (n < 2){
////		printf("%d", n);
////		return n ;
////
////	}
////	er(n / 2);
////	  
////		
////  
////		printf("%d", n % 2);
////	
////}
////7.递归方式实现打印一个整数的每一位
////int wo_bits(int n)
////{
////	if (n <2){
////		return n ;
////		printf("%d", n);
////	} 
////	wo_bits(n/2);
////		 
////	printf("%d", n % 2);
////
////	
////}
////
////int main()
////{
////	int num = 0;
////	printf("请输入一个数");
////	scanf("%d", &num);
////	printf("%d", wo_bits(num));
////	system("pause");
////	return 0;
////}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
//用for循环和while循环分别实现n的阶乘
//int main()
//{
//	int n ;
//	int sum = 1;
//	printf("请输入一个数\n");
//	scanf("%d", &n);
//	for (; n >1; --n)
//	{
//		sum = sum*n;
//	}
//	printf("n的阶乘是%d", sum);
//	system("pause");
//}
////break语句的应用
//int main()
//{
//	int sum = 0;
//	int num = 0;
//	for (;;)
//	{
//		sum = sum + num;
//		num += 1;
//		if (num > 100)
//			break;
//	}
//	printf("前100个数的和为%d", sum);
//	system("pause");
//	return 0;
//}
//求输入十个数正数的个数，并且求其平均值
//void main()
//{
//	int num = 0, a;
//	float  sum=0 ;
//	for (int i = 0; i < 10; ++i)
//	{
//		
//		scanf("%d", &a);
//
//		if (a <= 0)
//			continue;
//			num++;
//		sum = sum + a;
//		
//	}
//	printf("正数的个数为%d\n", num);
//	printf("正数的平均值为%f", sum / num);
//	system("pause");
//	
//}
//void main()
//{
//	int i , j ;
//	for (i = 1; i < 5; i++)
//	{
//		for (j=1; j <=i;j++)
//
//	putchar('*');
//		putchar('\n');
//	}
//	system("pause");
//}
  //输出50到100之间不能被3整除的数，用while和for循环实现；
//void main()
//{
//	int num = 49;
//	while (num < 100)
//	{
//		num++;
//		if (num % 3 != 0)
//			printf("%d\n", num);
//}
//	system("pause");
//}
//void main()
//{
//	int num = 50;
//	for (; num < 100; num++)
//	{
//		if (num % 3 != 0)
//			printf("%d\n", num);
//	}
//	system("pause");
//}
//打印九九乘法口诀表
//void main()
//{
//	int i = 1, j =1;
//	for (i=1; i < 10; i++)
//	{
//		for (j=1; j<=i; j++)
//			printf("%d*%d=%2d  ", j,i,i*j);
//		putchar('\n');
//	}
//	system("pause");
//}
//输出前20个斐波那契数列
//int main()
//{
//	
//	int num1=0, num2=1, result,n;
//	for (n = 1; n < 18; n++)
//	{
//		result = num1 + num2;//这里是从第三项开始计数的
//		num1 = num2;
//		num2 = result;
//		printf("%8d", result);
//		if (n % 5 == 0)
//		printf("\n");
//	}
//	system("pause");
//
//}

