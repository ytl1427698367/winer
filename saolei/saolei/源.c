#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
//#include<cnoio.h>
#define mine_count 10
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
	}
}
//void endmap()
//{
//	int row=0, col=0, row1=0, col1=0;
//	while (mine_map[row][col] == '*')
//	{
//          for (int rowl = row - 1; rowl < row + 2; rowl++)
//			{
//				for (int coll = col - 1; coll < col + 2; coll++)
//				{
//					if (rowl == row&&coll == col)
//					{
//						continue;
//					}printf("%c", mine_map[row1][col1]);
//				}
//			}
//	
//		
//	}
//}
//���ɨ��û�н�������Ҫͳ�Ƶ�ǰλ����Χ�׵ĸ���
void updateshowmap(int row, int col)
{
	int mine = 0;
	//ͳ����Χ�׵���Ŀ
	for (int rowl = row - 1; rowl < row + 2; rowl++){
		for (int coll = col - 1; coll < col + 2; coll++){
			if (rowl == row&&coll == col){
				continue;
			}
			if (mine_map[rowl][coll] == '*'){
				mine++;
			}
		}
	}
	if (mine != 0){
		show_map[row][col] = '0' + mine;
	}
	else{
		show_map[row][col] = ' ';
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

			printf("��Ϸ����\n");
			PrtMap(0);
			return 1;
		}
		else
		{
			updateshowmap(row, col);
			++not_mine_count;
		}

		if (not_mine_count == ROW*COL - mine_count)
		{
			printf("ɨ�׽���\n");
			printf("��ϲͨ��");
			PrtMap(0);
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
				//endmap();
				break;
			}
			//7.���û�лص����Ĳ�
		}
	}
	system("pause");
	return 0;
}