//ģ��ʵ�ֵ�½���������3��������½�������������
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int i = 0;;
	for (i = 0; i < 4; ++i)
	{

	
	char password[1024] = { 0 };
	printf("���������룺");
		scanf("%s", password);
		if (strcmp(password, "12346==0"))
		{
			printf("��½�ɹ�\n");
			break;
		}
		}
	if (i == 3)
	{
		printf("���γ��Զ�ʧ�ܣ���ֹ��½\n");
	}
	else{
		printf("��½�ɹ�\n");
	}
}

