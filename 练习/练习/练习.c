#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
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
////	printf(" ��ʼ��Ϸ  ������Ϸ\n");
////	printf("**************************\n");
////	printf("���������ѡ��:\n");
////	int choice = 0;
////	scanf("%d", &choice);
////	return choice;
////}
////void game(){
////	int result = rand()%100 + 1;
////	while (1)
////	{
////		printf("������һ�����֣�");
////		int num = 0;
////		scanf("%d", &num);
////		if (num < result)
////		{
////			printf("����\n");
////		}
////		else if (num>result)
////		{
////			printf("����\n");
////		}
////		else
////		{
////			printf("��ϲ�㣬�����\n");
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
////			printf("�������������������������\n");
////		}
////	}
////	system("pause");
////	return 0;
////
////}
////         //ʵ��һ���������������
////void Swape(int*x, int*y)
////{
////	int temp = *x;
////	*x = *y;
////	*y = temp;
////}
////void bobblesort(int arr[], int size)
////{
////	int board = 0;          //����һ���߽�
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
////�Ƚ����������������У��ж��ٸ�λ��ͬ��
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
////	printf("������������num1��num2");
////	int num1 = 0, num2 = 0;
////	scanf("%d %d", &num1,&num2);
////		printf("%d %d", two_bits(num1, num2));
////		system("pause");
////				return 0;
////}
//	
////дһ���������ز����������� 1 �ĸ���
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
////��ȡһ�������������������е�ż��λ������λ���ֱ�������������С�
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
//// ���һ��������ÿһλ��
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
//	printf("������һ����");
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
//	printf("��������Ϊ��");
//	for (i = 31; i >= 0; i -= 2)  //Ҳ�ǿ���32�Σ�ÿ����������32λ���㣩��ֻ�Ǵ�31λ��ʼ�ƶ�  
//	{
//		printf("%d ", (num >> i) & 1);  //��һ�������ƶ�31λ��1��õ���һλ�����ÿ�α仯2λ�����ɵõ�����λ���  
//	}
//	printf("\n");
//	printf("ż������Ϊ��");
//	for (i = 30; i >= 0; i -= 2)  //�����ƶ�30λ������1���ý����ԭ�����ֵĵڶ�λ������28λ...  
//	{
//		printf("%d ", (num >> i) & 1);  
//	}
//	printf("\n");
//	system("pause");
//	return 0;
//}
//#define ROW 5
//#define COL 5
//
//
//
//char g_chess_board[ROW][COL];//�����ά��������ʾ���̣�
//void init()
//{//�����̽��г�ʼ����
//	for (int row = 0; row <= ROW; ++row)
//	{
//		for (int col = 0; col <= COL; ++col)
//		{
//			g_chess_board[row][col] =' ';
//		}
//	}
//}
//void print()
//{
////�ȴ�ӡһ�����̣�
//	for (int row = 0; row <ROW; ++row)
//	{
//		printf("| %c | %c | %c | %c | %c |\n", g_chess_board[row][0],
//			g_chess_board[row][1], g_chess_board[row][2], 
//			g_chess_board[row][3],g_chess_board[row][4]);
//		if (row != ROW -1)
//		{
//			printf("|---|---|---|---|---|\n");
//		}
//
//	}
//	}
//void playear()
//{
//	while (1)
//	{
//		//������ӣ������Ϸ�Ƿ������
//		//1��ʾ���ӣ�
//		printf("���������,����Ϊ��row��col\n");
//		//2.��ȡ��ҵ����룻
//		int row = 0;
//		int col = 0;
//		scanf("%d %d", &row, &col);
//		//3.��������ӽ����жϣ������Ƿ���ȷ
//		if (row < 0 || row >= ROW || col < 0 || col >= COL)
//		{
//			printf("������Ӳ���ȷ������������");
//			continue;
//		}
//		if (g_chess_board[row][col] != ' ')
//		{
//			printf("��ǰλ�����ӣ���������");
//			continue;
//		}
//		else if (g_chess_board[row][col] == ' ')
//		{
//			g_chess_board[row][col] = 'x';
//	}	
//		break;
//
//	}
//}
//
//
//
//	void computermove()
//	{
//		printf("��������\n");
//		int row = 0;
//		int col = 0;
//		while (1){
//			row = rand() % ROW;
//			col = rand() % COL;
//			if (g_chess_board[row][col] == ' ')
//			{
//				g_chess_board[row][col] = 'o';
//				break;
//			}
//		}
//	}
//	//���˷���1��û�з���0
//	int isfull()
//	{
//		for (int row = 0; row < ROW; ++row)
//		{
//			for (int col = 0; col < COL; ++col)
//			{
//				if (g_chess_board[row][col]== ' ')
//				{
//					return 0;
//				}
//			}
//		}
//		return 1;
//	}
//	//�����Ϸ�Ƿ������
//	char checkwinner()
//	{
//		//������Ƿ�һ��
//		for (int row = 0; row < ROW; ++row)
//		{
//			if (g_chess_board[row][0] == g_chess_board[row][1] &&
//				g_chess_board[row][0] == g_chess_board[row][2] &&
//				g_chess_board[row][0] == g_chess_board[row][3] &&
//				g_chess_board[row][0] == g_chess_board[row][4] &&
//				g_chess_board[row][4] != ' ')
//			{
//					return  g_chess_board[row][0];
//				}
//		}
//		//������Ƿ�һ��
//		for (int col = 0; col < COL; ++col)
//		{
//			if (g_chess_board[0][col] == g_chess_board[1][col] &&
//				g_chess_board[0][col] == g_chess_board[2][col] &&
//				g_chess_board[0][col] == g_chess_board[3][col] &&
//				g_chess_board[0][col] == g_chess_board[4][col] &&
//				g_chess_board[0][col] != ' ')
//			{
//				return  g_chess_board[0][col];
//			}
//		}
//		//���Խ���
//		if (g_chess_board[0][0] == g_chess_board[1][1] &&
//			g_chess_board[0][0] == g_chess_board[2][2] && 
//			g_chess_board[0][0] == g_chess_board[3][3] &&
//			g_chess_board[0][0] == g_chess_board[4][4] &&
//			g_chess_board[0][0] != ' ')
//		{
//			return  g_chess_board[0][0];
//		}
//		if (g_chess_board[0][4] == g_chess_board[1][3] &&
//			g_chess_board[0][4] == g_chess_board[2][2] && 
//			g_chess_board[0][4] == g_chess_board[3][1] &&
//			g_chess_board[0][4] == g_chess_board[4][0] &&
//			g_chess_board[0][4] != ' ')
//		{
//			return  g_chess_board[0][4];
//		}
//		//������
//		if (isfull())
//		{
//			return 'q';
//		}
//		return ' ';
//	}
//	int main()
//	{
//		
//		
//		
//		char winner = ' ';
//		init();
//		while (1)
//		{
//			print();
//			playear();
//		
//			computermove();
//			winner = checkwinner();
//			if (winner != ' ')
//			{
//				//��Ϸ����
//				break;
//			}
//			system("cls");
//		}
//		system("cls");
//		print();
//		if (winner == 'x')
//		{
//			printf("��һ�ʤ\n");
//		}
//		else if (winner == 'o')
//		{
//			printf("���Ի�ʤ\n");
//		}
//		else if (winner == 'q')
//		{
//			printf("����\n");
//		}
//		system("pause");
//	}
//
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
//	printf("������һ������");
//	scanf("%d", &num);
//	 er(num);
//	 system("pause");
//	return 0;

//}
//�����ͼ
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
void init()
{
	int row;
	int col;
	for ( row = 0; row < ROW + 2; row++)
	{
		for (col = 0; col < COL + 2; col++)
		{
			 mine_map[row][col] = '0';
		//0��ʾ���ǵ��ף�
		 show_map[row][col] = '0';
		//*��ʾ�ǵ���
		}
	}
}
void PrtMap(int n){//������show n=1��������mine n=0
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
int not_mine_count = 0;//���㲻���׵ĸ���
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
		show_map[row][col] = '0' + mine;
	}
}
//��ʾ�û���������
int playergame()
{
	while (1)
	{
		int row = 0;
		int col = 0;

		printf("��������һ������");
		scanf("%d %d", &row, &col);

		if (row<0 || row>ROW || col<0 || col>COL)
		{
			printf("������Ĳ���ȷ������������");
			continue;
		}

		if (mine_map[row][col] == '*')
		{
			printf("��Ϸ����\n");
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
	//1.�ȴ�ӡ�˵����ж��Ƿ������Ϸ
	if (menu()){
		//2.��ӡshow��ͼ
		PrtMap(1);
		//3.��������
		PutMine();
		while (1){
			PrtMap(1);
		//4.���������ѡ��
		int result = playergame();
		//5.�ж���Ϸ�Ƿ����
		if (result == 1){
			break;
		}
		//7.���û�лص����Ĳ�
	}
}
















































{






















	srand(time(0));
	if (menu()){
		init();
		PrtMap(1);
		//����
		PutMine();
		PrtMap(0);
	}
	system("pause");
	return 0;
}