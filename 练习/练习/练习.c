//����һ���ַ�����ĳ���
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<CoreWindow.h>
#include<string.h>
#include<time.h>
//int Strlen(char*str)
//{
//	int count = 0;
//	while (*str !='\0')
//	{
//		++count;
//		++str;
//	}
//	return count;
//}
//int main()
//{
//	printf("%d\n", Strlen("hello"));
//	system("pause");
//	return 0;
//}
//int Strlen(char*str)
//{
//	
//	if (*str == '\0'){
//		
//		return 0;
//	}
//	return 1 + Strlen(str + 1);
//}
//int main()
//{
//	char a[] = "hello" ;
//	
//	int i = Strlen(a);
//	printf("%d\n", i);
//	system("pause");
//	return 0;
//
//}
// int strlen(char*str)
//{
//	int count = 0;
//	while (*str != '\0')
//	{
//		++count;
//		++str;
//	}
//	return count;
//}
//int strlen(char*str)
//{
//	if (*str == '\0')
//	{
//		return 0;
//	}
//	return 1+strlen(str+1);
//}
//int main()
//{
//	printf("%d", strlen("I love you"));
//	system("pause");
//	return 0;
//}
 /*��n�Ľ׳�
int factor(int n)
{
	if (n == 1)
	{
		return 1;
	}
	return n*factor(n - 1);
}
 int main()
 {
	 printf("%d\n", factor(6));
	 system("pause");
	 return 0;
 }

int factor(int n){
	int result = 1;
	for (int i = 1; i <= n; ++i)
		
{
	result *= i;
	}
	return result;
}
int main()
{
	printf("%d\n", factor(6));
	system("pause");
	return 0;
}*/
//int binart_research(int arr[], int left, int right, int element)
//{
//	while (left <= right)
//	{
//		int mid = (left + right) / 2;
//		if (arr[mid] > element)
//		{
//			right = mid - 1;
//		}
//		else if (arr[mid] < element)
//		{
//			left = mid + 1;
//		}
//		else
//		{
//		
//			return mid;
//		}
//	}
//	
//}
//int main()
//{
//	int arr[] = { 2, 5, 3, 8, 4, 3, 25, 45, 65,10 };//����һ��һά����
//	int element = 0;
//	int left = 0;
//	int right = sizeof(arr) / sizeof(arr[0]);
//	printf("������Ҫ���ҵ����֣�");
//	scanf("%d", &element);
//	int location = binart_research(arr, left, right, element);
//
//	if (location >= 0)
//		printf("�ҵ��ˣ�ֵΪ%d\n", location);
//	else
//	{
//		printf("û�ҵ���Ŀ�겻����\n");
//
//		system("pause");
//		return 0;
//
//	}
//}

//���n��쳲���������,�ݹ鷨
//int fib(int n)
//{
//	if (n == 1 || n == 2)
//	{
//		return 1;
//	}
//	return fib(n - 1) + fib(n - 2);
//}
//int main()
//{
//	printf("%d\n", fib(40));
//	system("pause");
//	return 0;
//}

//�ǵݹ鷨
//int fib(int n){
//	if (n == 1 || n == 2)
//	{
//		return 1;
//	}
//
//		int num1 = 1;
//		int num2 = 1;
//		int result = 0;
//		for (int i = 3; i <= n; ++i)
//		{
//			result = num1 + num2;
//			num1 = num2;
//			num2 = result;
//		}
//
//		return result;
//	}
//int main()
// {
//	printf("%d\n", fib(40));
//	system("pause");
//	return 0;
//}*/
//int zhishu(int n, int k)
//{
//	k--;
//	if (k == 0){
//		return n;
//	}
//	else
//	{
//
//		return n*zhishu(n, k);
//
//	}
//}
//	int main()
//{
//	int x=0, y=0;
//	scanf("%d%d", &x, &y);
//	printf("%d", zhishu(x,y));
//	system("pause");
//	return 0;
//}
//void print(int n)
//{
//	if (n / 10 == 0){
//		printf("%d", n);
//	}
//	else
//	{
//		print(n/10 );
//		printf("%d", n % 10);
//
//	}
//
//	}
//int main(){
//	int num=0;
//	printf("num=");
//	scanf("%d", &num);
//	printf("\n");
//	print(num);
//	system("pause");
//	return 0;
//
//}
//int  DigitSum(int n)
//{
//	int   m=0;
//	if (n == 0){
//		return 0;
//	}
//	 
//		m = n % 10;
//		return  m + DigitSum(n/10);
//}
//	
//
//int main()
//{
//    printf("%d\n", DigitSum(1168));
//	system("pause");
//	return 0;
//}
//void reverse_string(char*str)
//{
//	if (*str == '\0')
//	{
//		printf("%c", *str);
//	}
//	else
//	{
//		reverse_string(++str);
//		printf("%c", *(--str));
//		system("pause");
//	}
//}
//int main()
//{
//	char st[] = "hfgfkiotyrvg";
//	reverse_string(st);
//	return 0;
//}
//int memu(){
//	printf("**********************************\n");
//	printf(" ��ʼ��Ϸ  ������Ϸ\n");
//	printf("**************************\n");
//	printf("���������ѡ��:\n");
//	int choice = 0;
//	scanf("%d", &choice);
//	return choice;
//}
//void game(){
//	int result = rand()%100 + 1;
//	while (1)
//	{
//		printf("������һ�����֣�");
//		int num = 0;
//		scanf("%d", &num);
//		if (num < result)
//		{
//			printf("����\n");
//		}
//		else if (num>result)
//		{
//			printf("����\n");
//		}
//		else
//		{
//			printf("��ϲ�㣬�����\n");
//
//			break;
//		}
//	}
//}
//int main()
//{
//	srand(time(NULL));
//	while (1)
//	{
//		int choice = memu();
//		if (choice == 1)
//		{
//			game();
//		}
//		else if (choice == 0)
//		{
//			break;
//		}
//		else
//		{
//			printf("�������������������������\n");
//		}
//	}
//	system("pause");
//	return 0;
//
//}