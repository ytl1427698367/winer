//模拟实现登陆场景，如果3次连续登陆错误，则提出程序
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int i = 0;;
	for (i = 0; i < 4; ++i)
	{

	
	char password[1024] = { 0 };
	printf("请输入密码：");
		scanf("%s", password);
		if (strcmp(password, "12346==0"))
		{
			printf("登陆成功\n");
			break;
		}
		}
	if (i == 3)
	{
		printf("三次尝试都失败，禁止登陆\n");
	}
	else{
		printf("登陆成功\n");
	}
}

