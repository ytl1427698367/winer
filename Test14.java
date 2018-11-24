//字节与字符串的相互转换
 public class Test14{
		// static void ha(){
		// String str ="Hello world";
		// byte[] he =str.getBytes();//将字符串变为字节
		// for(int i =0;i<he.length;++i){
			// System.out.println(he[i]+".");
		// }
		// System.out.println( new String(he,2,5));//将部分字节转换为字符串
		// System.out.println(new String(he));//将字节变为字符串
		// }
	//字符串的比较
	/*static void com(){
		String str ="hello world";
		String str1 ="HELLLO WORLD";
		String str2= "hello world";
		String str3="i am winner";
		String str4=new String("hello world");
		System.out.println(str==str2);//比较的地址 false
		System.out.println(str==str1);
		System.out.println(str.equals(str1));//比较的是内容 ，但区分大小写
		System.out.println(str.equalsIgnore(str1));//不区分大小写
		System.out.println(str.compareTo(str1));//小写转换为大写
	}*/
	//字符串查找，看一个子字符串是否在母字符串中
	// static void find(){
		// String str="hello world";
		// System.out.println(str.contains("world"));
		// //使用indexOf()实现位置的查找
		// System.out.println(str.indexOf("ll"));//2开始索引
		// System.out.println(str.indexOf("long"));
		// //判断开头和结尾
		// System.out.println(str.startsWith("he"));
		// System.out.println(str.startsWith("ll",2));
		// System.out.println(str.endsWith("ld"));
		// }
		static void brea(){
			//实现字符串的拆分
			String str1 ="i am winner hello liukai";
			String[] result = str1.split(" ",2);//按照空格拆分
			for(String s:result	){
				System.out.println(s);		
			}
			
		}
	public static void main(String[] args){
		//com();
		//find();	
		brea();
		
	}
	
}













