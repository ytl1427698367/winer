#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
//#include<cnoio.h>
#define mine_count 1
#define  ROW 10
#define  COL 10
char mine_map[ROW + 2][COL + 2];//地图初始化，有雷
char show_map[ROW + 2][COL + 2];
int menu(){
	printf("********1开始游戏******* \n ");
	printf("********0结束游戏*******\n");
	printf("请输入你的选择");

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
		printf("用户选择有误，请重新选择");
	}

}
void init()//是否有雷
{
	int row;
	int col;
	for (row = 0; row < ROW + 2; row++)
	{
		for (col = 0; col < COL + 2; col++)
		{
			mine_map[row][col] = ' ';
			//0表示不是地雷，
			show_map[row][col] = '0';
			//*表示是地雷
		}
	}
}
void PrtMap(int n)//如果输出show地图 n=1；如果输出mine地图 n=0
{
    int row;
	int col;
	//边框
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
	//先打印第一行
	for (col = 0; col <= COL; col++){
		printf("%02d ", col);
	}
	printf("\n");
	//在第一行下面答应横线
	for (col = 0; col <= COL; col++){
		printf("---");
	}
	printf("\n");
	for (row = 1; row <= ROW; row++){
		//每一行第一个为序号
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
	//埋雷
	for (int count = 0; count < mine_count; count++){
		int row = rand() % ROW + 1;
		int col = rand() % COL + 1;
		while (mine_map[row][col] == '*'){//如果重复
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
//提示用户输入坐标
int not_mine_count;
int playergame()
{
	
	while (1)
	{
		int row = 0;
		int col = 0;

		printf("请你输入一个坐标");
		scanf("%d %d", &row, &col);
		system("cls");
		if (row<0 || row>ROW || col<0 || col>COL)
		{
			printf("你输入的不正确，请重新输入");
			continue;
		}

		if (mine_map[row][col] == '*')
		{
			PrtMap(0);
			printf("游戏结束\n");
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
			printf("扫雷结束\n");
			printf("恭喜通关\n");
			return 1;
		}
		return 0;
	}
}
int main(){
	srand(time(0));
	//1.先打印菜单，判断是否进入游戏
	if (menu()){
		//2.初始化
		init();
		//3.布置雷阵
		PutMine();
		while (1){
			//打印地图
			PrtMap(1);
		
			//4.让玩家做出选择
			int result = playergame();
			
			//5.判断游戏是否结束
			
			if (result == 1)
			{
				
				break;
			}
			//7.如果没有回到第四步
		}
	}
	system("pause");
	return 0;
}