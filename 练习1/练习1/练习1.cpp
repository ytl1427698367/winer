//define  _CRT_SECURE_NO_WARNINGS 
//#include<stdio.h>
//#include<stdlib.h>
////����int��32λ������m��n�Ķ����Ʊ���У��ж��ٸ�λ(bit)��ͬ��
//int Dif_bits(int m, int n)
//{
//	//������������ͬΪ0.����Ϊ1
//	//���������õ�һ��ֵ��Ȼ���������ֵ��1�ĸ���
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
////7.�ݹ鷽ʽʵ�ִ�ӡһ��������ÿһλ
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
////	printf("������һ����");
////	scanf("%d", &num);
////	printf("%d", wo_bits(num));
////	system("pause");
////	return 0;
////}
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
//��forѭ����whileѭ���ֱ�ʵ��n�Ľ׳�
//int main()
//{
//	int n ;
//	int sum = 1;
//	printf("������һ����\n");
//	scanf("%d", &n);
//	for (; n >1; --n)
//	{
//		sum = sum*n;
//	}
//	printf("n�Ľ׳���%d", sum);
//	system("pause");
//}
////break����Ӧ��
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
//	printf("ǰ100�����ĺ�Ϊ%d", sum);
//	system("pause");
//	return 0;
//}
//������ʮ���������ĸ�������������ƽ��ֵ
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
//	printf("�����ĸ���Ϊ%d\n", num);
//	printf("������ƽ��ֵΪ%f", sum / num);
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
  //���50��100֮�䲻�ܱ�3������������while��forѭ��ʵ�֣�
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
//��ӡ�žų˷��ھ���
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
//���ǰ20��쳲���������
//int main()
//{
//	
//	int num1=0, num2=1, result,n;
//	for (n = 1; n < 18; n++)
//	{
//		result = num1 + num2;//�����Ǵӵ����ʼ������
//		num1 = num2;
//		num2 = result;
//		printf("%8d", result);
//		if (n % 5 == 0)
//		printf("\n");
//	}
//	system("pause");
//
//}

