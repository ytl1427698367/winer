#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<cnoio.h>
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
 /*求n的阶乘
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
//	int arr[] = { 2, 5, 3, 8, 4, 3, 25, 45, 65,10 };//定义一个一维数组
//	int element = 0;
//	int left = 0;
//	int right = sizeof(arr) / sizeof(arr[0]);
//	printf("输入想要查找的数字：");
//	scanf("%d", &element);
//	int location = binart_research(arr, left, right, element);
//
//	if (location >= 0)
//		printf("找到了，值为%d\n", location);
//	else
//	{
//		printf("没找到，目标不存在\n");
//
//		system("pause");
//		return 0;
//
//	}
//}
//求第n项斐波那契数列,递归法
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
//非递归法
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
////int  DigitSum(int n)
////{
////	int   m=0;
////	if (n == 0){
////		return 0;
////	}
////	 
////		m = n % 10;
////		return  m + DigitSum(n/10);
////}
////	
////
////int main()
////{
////    printf("%d\n", DigitSum(1168));
////	system("pause");
////	return 0;
////}
////void reverse_string(char*str)
////{
////	if (*str == '\0')
////	{
////		printf("%c", *str);
////	}
////	else
////	{
////		reverse_string(++str);
////		printf("%c", *(--str));
////		system("pause");
////	}
////}
////int main()
////{
////	char st[] = "hfgfkiotyrvg";
////	reverse_string(st);
////	return 0;
////}
////int memu(){
////	printf("**********************************\n");
////	printf(" 开始游戏  结束游戏\n");
////	printf("**************************\n");
////	printf("请输入你的选择:\n");
////	int choice = 0;
////	scanf("%d", &choice);
////	return choice;
////}
////void game(){
////	int result = rand()%100 + 1;
////	while (1)
////	{
////		printf("请输入一个数字：");
////		int num = 0;
////		scanf("%d", &num);
////		if (num < result)
////		{
////			printf("低了\n");
////		}
////		else if (num>result)
////		{
////			printf("高了\n");
////		}
////		else
////		{
////			printf("恭喜你，答对了\n");
////
////			break;
////		}
////	}
////}
////int main()
////{
////	srand(time(NULL));
////	while (1)
////	{
////		int choice = memu();
////		if (choice == 1)
////		{
////			game();
////		}
////		else if (choice == 0)
////		{
////			break;
////		}
////		else
////		{
////			printf("你输入的数字有误，请重新输入\n");
////		}
////	}
////	system("pause");
////	return 0;
////
////}
////         //实现一个数组的排序问题
////void Swape(int*x, int*y)
////{
////	int temp = *x;
////	*x = *y;
////	*y = temp;
////}
////void bobblesort(int arr[], int size)
////{
////	int board = 0;          //定义一个边界
////	for (; board < size; ++board)
////	{
////		int cur = size - 1;
////		for (; cur>board; cur--)
////		{
////			if (arr[cur]<arr[cur-1])
////			{
////				Swape(&arr[cur], &arr[cur - 1]);
////			}
////		}	
////				
////	}
////
////}
////int main()
////{
////	int arr[] = { 9, 5, 6, 3, 7, 56, 2 };
////	int lep = sizeof(arr) / sizeof(arr[0]);
////	bobblesort(arr, lep);
////	for (int i = 0; i < lep; i++)
////	{
////		printf("%d ", arr[i]);
////
////	}
////	system("pause");
////	return 0;
////}
//
////比较两个整数二进制中，有多少个位不同；
////int two_bits(int n, int m)
////{
////	int count = 0;
////	int x = n^m;
////	while (x != 0)
////	{
////		if ((x & 1)== 1)
////		{
////		count++;
////		}
////		x=x >>1;
////	}
////		return count;
////	
////}
////int main()
////{
////	printf("请输入两个数num1和num2");
////	int num1 = 0, num2 = 0;
////	scanf("%d %d", &num1,&num2);
////		printf("%d %d", two_bits(num1, num2));
////		system("pause");
////				return 0;
////}
//	
////写一个函数返回参数二进制中 1 的个数
//
//int count_one_bits(unsigned int value)
//{
//	int count = 0;
//	while (value)
//	{
//		if (value % 2 == 1)
//		{
//			count++;
//		}
//		value = value / 2;
//	}
//	return count;
//}
//int main()
//{
//	printf("%d", count_one_bits(15));
//	system("pause");
//}
////
////获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列。
////
//int two_system(int num)
//{
//	if (num >1)
//	{
//		two_system(num/2);
//	
//	printf("%d", num % 2);
//
//		
//		
//
//	}
//}
//int main()
//{
//	printf("%d", two_system(15));
//	system("pause");
//}
//// 输出一个整数的每一位。
//int count(int n)
//{
//	if (n <= 1)
//	{
//		printf("%d", n);
//	}
//	else
//	{
//		count(n / 2);
//		printf("%d", n % 2);
//      
//	}
//	}
//int main()
//{
//	int num = 0;
//	printf("请输入一个数");
//	scanf("%d", &num);
//	count(num);
//	system("pause");
//	return 0;
//}
//
//int main()
//{
//	int num = 0, i = 0;
//	scanf("%d", &num);
//	printf("奇数序列为：");
//	for (i = 31; i >= 0; i -= 2)  //也是控制32次（每个整型数按32位来算），只是从31位开始移动  
//	{
//		printf("%d ", (num >> i) & 1);  //第一次向右移动31位和1与得到第一位情况，每次变化2位，即可得到奇数位情况  
//	}
//	printf("\n");
//	printf("偶数序列为：");
//	for (i = 30; i >= 0; i -= 2)  //向右移动30位，再与1所得结果是原来数字的第二位，再移28位...  
//	{
//		printf("%d ", (num >> i) & 1);  
//	}
//	printf("\n");
//	system("pause");
//	return 0;
//}
#define ROW 5
#define COL 5



char g_chess_board[ROW][COL];//定义二维数组来表示棋盘；
void init()
{//对棋盘进行初始化；
	for (int row = 0; row <= ROW; ++row)
	{
		for (int col = 0; col <= COL; ++col)
		{
			g_chess_board[row][col] =' ';
		}
	}
}
void print()
{
//先打印一下棋盘；
	for (int row = 0; row <ROW; ++row)
	{
		printf("| %c | %c | %c | %c | %c |\n", g_chess_board[row][0],
			g_chess_board[row][1], g_chess_board[row][2], 
			g_chess_board[row][3],g_chess_board[row][4]);
		if (row != ROW -1)
		{
			printf("|---|---|---|---|---|\n");
		}

	}
	}
void playear()
{
	while (1)
	{
		//玩家落子，检查游戏是否结束；
		//1提示落子；
		printf("请玩家落子,坐标为：row，col\n");
		//2.读取玩家的输入；
		int row = 0;
		int col = 0;
		scanf("%d %d", &row, &col);
		//3.对玩家落子进行判断，看其是否正确
		if (row < 0 || row >= ROW || col < 0 || col >= COL)
		{
			printf("玩家落子不正确，请重新落子");
			continue;
		}
		if (g_chess_board[row][col] != ' ')
		{
			printf("当前位置有子，重新输入");
			continue;
		}
		else if (g_chess_board[row][col] == ' ')
		{
			g_chess_board[row][col] = 'x';
	}	
		break;

	}
}



	void computermove()
	{
		printf("电脑落子\n");
		int row = 0;
		int col = 0;
		while (1){
			row = rand() % ROW;
			col = rand() % COL;
			if (g_chess_board[row][col] == ' ')
			{
				g_chess_board[row][col] = 'o';
				break;
			}
		}
	}
	//满了返回1，没有返回0
	int isfull()
	{
		for (int row = 0; row < ROW; ++row)
		{
			for (int col = 0; col < COL; ++col)
			{
				if (g_chess_board[row][col]== ' ')
				{
					return 0;
				}
			}
		}
		return 1;
	}
	//检查游戏是否结束；
	char checkwinner()
	{
		//检查行是否一致
		for (int row = 0; row < ROW; ++row)
		{
			if (g_chess_board[row][0] == g_chess_board[row][1] &&
				g_chess_board[row][0] == g_chess_board[row][2] &&
				g_chess_board[row][0] == g_chess_board[row][3] &&
				g_chess_board[row][0] == g_chess_board[row][4] &&
				g_chess_board[row][4] != ' ')
			{
					return  g_chess_board[row][0];
				}
		}
		//检查列是否一致
		for (int col = 0; col < COL; ++col)
		{
			if (g_chess_board[0][col] == g_chess_board[1][col] &&
				g_chess_board[0][col] == g_chess_board[2][col] &&
				g_chess_board[0][col] == g_chess_board[3][col] &&
				g_chess_board[0][col] == g_chess_board[4][col] &&
				g_chess_board[0][col] != ' ')
			{
				return  g_chess_board[0][col];
			}
		}
		//检查对角线
		if (g_chess_board[0][0] == g_chess_board[1][1] &&
			g_chess_board[0][0] == g_chess_board[2][2] && 
			g_chess_board[0][0] == g_chess_board[3][3] &&
			g_chess_board[0][0] == g_chess_board[4][4] &&
			g_chess_board[0][0] != ' ')
		{
			return  g_chess_board[0][0];
		}
		if (g_chess_board[0][4] == g_chess_board[1][3] &&
			g_chess_board[0][4] == g_chess_board[2][2] && 
			g_chess_board[0][4] == g_chess_board[3][1] &&
			g_chess_board[0][4] == g_chess_board[4][0] &&
			g_chess_board[0][4] != ' ')
		{
			return  g_chess_board[0][4];
		}
		//检查和棋
		if (isfull())
		{
			return 'q';
		}
		return ' ';
	}
	int main()
	{
		
		
		
		char winner = ' ';
		init();
		while (1)
		{
			print();
			playear();
		
			computermove();
			winner = checkwinner();
			if (winner != ' ')
			{
				//游戏结束
				break;
			}
			system("cls");
		}
		system("cls");
		print();
		if (winner == 'x')
		{
			printf("玩家获胜\n");
		}
		else if (winner == 'o')
		{
			printf("电脑获胜\n");
		}
		else if (winner == 'q')
		{
			printf("和棋\n");
		}
		system("pause");
	}

//void er(int n)
//{
//	if (n < 2){
//		printf("%d", n);
//		return ;
//
//	}er(n / 2);
//	  
//		
//  
//		printf("%d", n % 2);
//	
//}
//int main()
//{
//	int num;
//	printf("请输入一个数字");
//	scanf("%d", &num);
//	 er(num);
//	 system("pause");
//	return 0;
//
//}
