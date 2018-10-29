#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
//#include<cnoio.h>
#define mine_count 1
#define  ROW 10
#define  COL 10
char mine_map[ROW + 2][COL + 2];//��ͼ��ʼ��������
char show_map[ROW + 2][COL + 2];
int menu(){
	printf("********1��ʼ��Ϸ******* \n ");
	printf("********0������Ϸ*******\n");
	printf("���������ѡ��");

	int num;
	while (1)
	{

		scanf("%d", &num);
		if (num == 1)
		{
			return 1;
		}
		else if (num == 0){
			return 0;
		}
		printf("�û�ѡ������������ѡ��");
	}

}
void init()//�Ƿ�����
{
	int row;
	int col;
	for (row = 0; row < ROW + 2; row++)
	{
		for (col = 0; col < COL + 2; col++)
		{
			mine_map[row][col] = ' ';
			//0��ʾ���ǵ��ף�
			show_map[row][col] = '0';
			//*��ʾ�ǵ���
		}
	}
}
void PrtMap(int n)//������show��ͼ n=1��������mine��ͼ n=0
{
    int row;
	int col;
	//�߿�
	for (row = 0, col = 0; col < COL + 2; col++){
		show_map[row][col] = ' ';
	}
	for (row = 0, col = 0; row < ROW + 2; row++){
		show_map[row][col] = ' ';
	}
	for (row = ROW + 1, col = 0; col < COL + 2; col++){
		show_map[row][col] = ' ';
	}
	for (col = COL + 1, row = 0; row < ROW + 2; row++){
		show_map[row][col] = ' ';
	}
	//�ȴ�ӡ��һ��
	for (col = 0; col <= COL; col++){
		printf("%02d ", col);
	}
	printf("\n");
	//�ڵ�һ�������Ӧ����
	for (col = 0; col <= COL; col++){
		printf("---");
	}
	printf("\n");
	for (row = 1; row <= ROW; row++){
		//ÿһ�е�һ��Ϊ���
		printf("%02d| ", row);
		for (col = 1; col <= COL; col++){
			if (n == 1){
				printf("%c  ", show_map[row][col]);
			}
			if (n == 0){
				printf("%c  ", mine_map[row][col]);
			}
		}
		printf("\n");
	}
}
void OnePuls(int row, int col){
	int rowl;
	int coll;
	for (rowl = row - 1; rowl < row + 2; rowl++){
		for (coll = col - 1; coll < col + 2; coll++){
			if (mine_map[rowl][coll]=='*'){
				continue;
			}
			if (mine_map[rowl][coll] == ' '){
				mine_map[rowl][coll] = '1';
			}
			else{
				mine_map[rowl][coll] += 1;
			}
		}
	}
}
void PutMine(){
	//����
	for (int count = 0; count < mine_count; count++){
		int row = rand() % ROW + 1;
		int col = rand() % COL + 1;
		while (mine_map[row][col] == '*'){//����ظ�
			row = rand() % ROW + 1;
			col = rand() % COL + 1;
		}
		mine_map[row][col] = '*';
		OnePuls(row,col);
	}
}

void updateshowmap(int row, int col)
{
	show_map[row][col] = mine_map[row][col];
	if (show_map[row][col] == ' '){
		for (int rowl = row - 1; rowl < row + 2; rowl++){
			for (int coll = col - 1; coll < col + 2; coll++){
				if (show_map[rowl][coll] != ' '){
					updateshowmap(rowl, coll);
				}
			}
		}
	}
}
//��ʾ�û���������
int not_mine_count;
int playergame()
{
	
	while (1)
	{
		int row = 0;
		int col = 0;

		printf("��������һ������");
		scanf("%d %d", &row, &col);
		system("cls");
		if (row<0 || row>ROW || col<0 || col>COL)
		{
			printf("������Ĳ���ȷ������������");
			continue;
		}

		if (mine_map[row][col] == '*')
		{
			PrtMap(0);
			printf("��Ϸ����\n");
			return 1;
		}
		else
		{
		
			updateshowmap(row, col);
		}
		int nummine = 0;
		for (row = 1; row <= ROW; row++){
			for (col = 1; col <= COL; col++){
				if (show_map[row][col] == '0'){
					nummine++;
				}
			}
		}
		if ( nummine== mine_count)
		{
			PrtMap(0);
			printf("ɨ�׽���\n");
			printf("��ϲͨ��\n");
			return 1;
		}
		return 0;
	}
}
int main(){
	srand(time(0));
	//1.�ȴ�ӡ�˵����ж��Ƿ������Ϸ
	if (menu()){
		//2.��ʼ��
		init();
		//3.��������
		PutMine();
		while (1){
			//��ӡ��ͼ
			PrtMap(1);
		
			//4.���������ѡ��
			int result = playergame();
			
			//5.�ж���Ϸ�Ƿ����
			
			if (result == 1)
			{
				
				break;
			}
			//7.���û�лص����Ĳ�
		}
	}
	system("pause");
	return 0;
}