public class Test16{
	public static void main(String[] args){
		fillBefore();
	}
public static void fillBefore(){
	String str ="hello ,world";
	char[] data1 =str.toCharArray();
	String str1="A";
	char[] data2=str1.toCharArray();
	char[] data3= data2+data1;
	int len = 30;
	char[] data4 ={'a','b'};
	for(int i=0;data3.length()<len;i++){
		data3=data2+data3;
	}
	char[] data5 =data4+data3;
	
	System.out.println(new String(data5));
}
}