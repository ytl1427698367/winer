#include<iostream>
#include<stdio.h>
#include<stdlib.h>

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

	using namespace std;
	double feetTof(double furlongs);
	int main(){
		cout << "enter a distance in furlongs:";
		double furlongs;
		cin >> furlongs;
		double feet;
		feet = feetTof(furlongs);
		cout << furlongs << "furlongs=" << feet << " feet.\n";
	
	}
	double feetTof(double){
		return 220;

}


