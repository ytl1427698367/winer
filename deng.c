//���۰���ҷ��ҵ������е�һ����
#include<stdio.h>
int  main(){
	int arr[] = { 2, 2, 3, 5, 6, 5, 6, 1, 8, 9, 7 };
	int left = 0;
	int right = sizeof(arr) / sizeof(arr[0]) - 1;
	int key = 8;
	int mid = 0;
	while (left <= right){
		mid = (right + left) / 2;
		if (arr[mid] > key){
			right = mid - 1;
		}

		else if (arr[mid] < key){
			left = mid + 1;
		}
		else
			break;
	}
	if (left <= right)
		printf("�ҵ��ˣ��±�Ϊ%d\n", mid);
	
	else{
		printf("û�ҵ�\n");
	}
	system("pause");
	return 0;
	}


