#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#define  num 12
void main()
{
	int a[10][10], i, j;
	for (i = 0; i <= num; i++)
	{
		a[i][0] = 1;//����һ�е����ͶԽ���Ԫ�ظ�ֵΪ1
		a[i][i] = 1;
	}
	for (i = 2; i < num; i++)
	{//��forѭ���������λ�õ���

		for (j = 1; j < i; j++)
		{

			a[i][j] = a[i - 1][j - 1] + a[i - 1][j];

		}
	}


			for (i = 0; i < num; i++)
			{
				for (j = 0; j <= i; j++)
	      printf("%5d", a[i][j]);
			printf("\n");
		}
	system("pause");
		}

			
	
