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
void simon(int);
int main(){
	using namespace std;
	simon (3);	
	cout << "pick an integer;";
	int count;
	cin >> count;
	simon(count);
	cout << "done\n";
	return 0;
}
		void simon(int n)	
		{
			using namespace std;
			cout << "simon saystouch your toes" << n << "times.\n";

			system("pause");
		}


