//#include<stdafx.h>
//#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#define_CRT_SECURE_NO_WARNINGS
//using namespace std;


//int main(){
//using namespace std;
//	cout<<"好好学习\n";
//	cout << " \n";
//	cout << "天天向上";
//	system("pause");
//	 return 0;
//	 }
//int main(){
//	using namespace std;
//	int carrots;
//	cout << "how many carrots do you have\n";
//	cin >>carrots;
//	cout << "here are two more\n";
//	carrots = carrots + 2;
//	cout << "now you have"
//		<< carrots << "carrots.";
//	system("pause");
//	return 0;
//}
//void simon(int);
//int main(){
//	using namespace std;
//	simon (3);	
//	cout << "pick an integer;";
//	int count;
//	cin >> count;
//	simon(count);
//	cout << "done\n";
//	return 0;
//}
//		void simon(int n)	
//		{
//			using namespace std;
//			cout << "simon saystouch your toes" << n << "times.\n";
//
//			system("pause");
//		}
//int main(){
//	using namespace std;
//	char name;
//	char address;
//	cout << "请输入你的名字：\n";
//     cin >> name;
//     cout << "你的名字是" << name;
//	cout << "你家地址是\n";
//	cin >> address;
//	
//	 cout<<"你的地址是" << address;
//		
//	system("pause");
//	return 0;
//
//
//}

//	using namespace std;
//	double feetTof(double);
//	int main(){
//		cout << "enter a distance in furlongs:";
//		double furlongs;
//		cin >> furlongs;
//		double feet;
//		feet = feetTof(furlongs);
//		cout <<  "furlongs is" << feet ;
//		system("pause");
//		return 0;
//	}
//	double feetTof(double feet){
//		double k;
//		k = 220;
//		return k;
//
//}
//
//
//
////using namespace std;
////int main()
////{
////	
////	void printmice();
////	void printrun();
////	printmice();
////	printmice();
////	printrun();
////	printrun();
////	system("pause");
////	return 0;
////}
////void printmice(){
////	cout << "three blind mice\n";
////}
////	void printrun(){
////		cout << "see how they run\n";
////	}
////	
//int good(int);
//int main()
//{
//	
//	int year;
//	cout << "输入你的年龄:";
//    cin >> year;
//  cout << "你的年龄月数是" << good(year);
//	system("pause");
//	return 0;
//}
//int good(int year){
//	int month;
//	month = 12 * year;
//	return month;
//}

////double tailong(double);
////int main(){
////	using namespace std;
////			double c;
////			cout << "please enter a celsius value:";
////			cin >> c;
////			cout << " 20 degresss celsius is" << tailong(c) << "degress fahrenheit.\n";
////			system("pause");
////			return 0;
////}
////		double tailong(double c)
////		{
////			double f;
////			f = 1.8*c + 32.0;
////			return f;
////		}
//double haha(double);
//int main(){
//	double  lightyear;
//	cout << "enter the numbers of years:";
//	cin >> lightyear;
//	double lon;
//	lon = haha(lightyear);
//	cout << lightyear << "light years is" << double(lon) << "astromical	units";
//	system("pause");
//	return 0;
//}
//double haha(double lightyear){
//	double l;
//	l = 63240 * lightyear;
//	return l;
////}
//void love(int, int);
//int main(){
//	int h, m;
//	cout << "输入小时：";
//	cin >> h;
//	cout << "输入分钟";
//	cin >> m;
//	love(h, m);
//	system("pause");
//	return 0;
//}
//void love(int h, int m){
//	cout << "time" << h << ":" << m;
//
//}
int main()
{
	int a[] = { 2, 5, 3, 8, 4, 3, 25, 45, 65 };//d定义一个一维数组
	int i = 0;
	int left = 0;
	int right = sizeof(a) / sizeof(a[0]);
	printf("输入想要查找的数字：");
		scanf("%d", &a);
	while (Find(left, right, i, a) != -1)
	{
		printf("找到了，下标是：%d\n"，Find(left, right, i, a));
		break;
	}
	while (Find(left, right, i, a) == -1)
	{
		printf("没找到，目标不存在\n")
			break;
		system("pause");
		return 0;
	}
}
