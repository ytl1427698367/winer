//移除字符串中所有给定字符串
public class removeAll{
	public static void main(String[] args){
		remove();
	}
	static void remove(){
		String str ="  hello,world"  ;
		System.out.println("移除前的字符串为"+str);
		System.out.println("移除指定的字母0");
		System.out.println("移除l后的字符串为：");
		String str1=str.replaceAll("0", "");//将l移除,其实替换，不过替换的内容为空，如果将引号中给一个内容，就会替换
	    System.out.println("["+str1.trim()+"]");//将str两边的空格删掉
		//我们再次移除一个字母d
		System.out.println("移除一个字母d后的字符串为：");
		String str2=str1.replaceAll("d","");
		System.out.println(str2);
		//再将o字母替换为i like you
		System.out.println("替换后的字符串为：");
		String str3 =str2.replaceAll("o","i like you");
		System.out.println(str3);
	}
}