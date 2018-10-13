//查找一个字符数组的长度
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int Strlen(char*str)
{
	int count = 0;
	while (*str !='\0')
	{
		++count;
		++str;
	}
	return count;
}
int main()
{
	printf("%d\n", Strlen("hello"));
	system("pause");
	return 0;
}
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