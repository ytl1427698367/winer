//模拟实现登陆场景，如果3次连续登陆错误，则退出程序
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//#include<string.h>
//#include<stdlib.h>
//int main()
//{
//	int i = 0;
//	for (i = 0; i < 3; ++i)
//	{
//
//
//		char password[1024] = { 0 };
//		printf("请输入密码：");
//		scanf("%s", password);
//		if (strcmp(password, "12346==0"))
//		{
//			printf("登陆成功\n");
//			break;
//		}
//	}
//
//		if (i == 3)
//		{
//			printf("三次尝试都失败，禁止登陆\n");
//		}
//		else{
//			printf("登陆成功\n");
//		}
//		system("pause");
//	}

//
//#include<stdio.h>
//#include<stdlib.h>
//#include<string.h>
//int main()
//{
//	int arr[] = { 6, 6, 2, 9, 1, 3, 4 };
//	int to_find = 5;
//	int i = 0;
//	for (i = 0; i < sizeof(arr) / sizeof(arr[0]); ++i)
//	{
//		if (to_find == arr[i])
//		{
//			break;
//		}
//	}
//	if (i == 7) {
//		printf("没找到相关元素");
//
//	}
//	else
//	{
//		printf("找到了，下标为%d\n", i);
//	}
//	system("pause");
//}
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//#include<stdlib.h>
//                                                                                  
//void main(){
//	int result = rand() % 100 + 1;
//	while (1){
//		printf("请输入一个数：");
//			int num = 0;
//			scanf("%d", &num);
//			if (num<result)
//			{
//				printf("低了\n");
//			}
//			else if (num>result)
//			{
//				printf("高了\n");
//			}
//			else{
//				printf("恭喜你，答对了\n");
//				break;
//			}
//			}
//	system("pause");
//			}

//#include<stdio.h>
//#include<stdlib.h>
//
//int isprime(int x) {
//	int num = 2;
//	while (num < x){
//		if (x % num == 0){
//			return 0;
//		}
//		num = num + 1;
//	}
//	return 1;
//}
//int main(){
//	int i = 100;
//	while (i < 200){
//		if (isprime(i) == 1)
//			printf("%d\n", i);
//		i = i + 1;
//	}
//	system("pause");
//}
//#include<stdio.h>
//#include<stdlib.h>
//int main(){
//	int line = 1;
//	while (line < 10){
//		int col = 1;
//		while (col <= line){
//			printf("%d*%d=%d", col, line, col*line);
//			col += 1;
//
//		}
//		printf("\n");
//		line += 1;
//	}
//       system("pause");
//	
//}
#include<stdio.h>
#include<stdlib.h>
int   isleapyear(int year)
{
	if (year % 100 == 0)
	{
		if (year % 400 == 0){
			return 1;
		}

		else{
			return 0;
		}
	}
	else{
		if (year % 4 == 0){
			return 1;
		}
		else{
			return 0;
		}
	}
}
int main(){
	int year = 100;
	while (year <= 2000){
		if (isleapyear(year) == 1){
		printf("%d\n", year);	
		}
         year += 1;
	}
	
	system("pause");
}