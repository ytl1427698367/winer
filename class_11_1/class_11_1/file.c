#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
int main(){
	printf("hello world\n");
	system("pause");
	return 0;
}
������ʮ�����������ĸ�������ƽ��ֵ
void main()
{
	
	int a, i, sum = 0, count=0;
	printf("������ʮ����\n");
	
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
	printf("�����ĸ���Ϊ%d", count);//��������ĸ���
		printf("�����ĺ�Ϊ%d", sum);//������������ĺ�
		printf("\n");
		printf("������ƽ��ֵΪ%d\n", sum / count);//���ֵ
		system("pause");
}
//Ҫ�����ͼ��
//����Ҫ�õ�����ѭ������ѭ������ѭ��
void main()
{
	int i = 0, j = 0;
	for (i = 0; i <= 10; i++)//��ѭ��
	{
		for (j = 0; j <= i; j++)//��ѭ��
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