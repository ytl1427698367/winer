 //反转字符串
 public class Reverse{
	 public static void main(String[] args){
		 reverse();
	 }
	 static void reverse(){
		 String str = "i am winner";
		 System.out.println("反转前的字符串为"+str);
		 //StringBuffer str1 = new StringBuffer(str);
		 System.out.println("反转之后的字符串为");
       StringBuffer str1 = new StringBuffer(str);
	   System.out.println(str1.reverse());
	String str2 =str.replaceAll(" ","");//把里面的空格去掉；
	System.out.println("去掉空格的str 为：");
	System.out.println(str2);
	System.out.println("反转之后str2为：");
	StringBuffer str3 =new StringBuffer(str2);
	System.out.println(str3.reverse());
	 }
 }