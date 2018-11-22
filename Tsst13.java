public class Tsst13{
	public static void kj(){
		String Str = "hello";
		String Str1 =new String("hello");//开辟了两个堆空间
		String Str2 = "hello";
		String Str3 =new String("hello").intern();
		//==比较的是字符串的地址，==会记录内容，等下次两个内容相等时，不用开辟新的堆空间
		System.out.println(Str==Str1);//false
		System.out.println(Str==Str2);//true
		//equals比较的是内存里的内容
		System.out.println(Str.equals(Str1));//true
		System.out.println(Str==Str3);//true 
		System.out.println(Str3 ==Str);//true
		System.out.println(Str3==Str1);//false
	}
	public static void hh(){
		String Str = "hello";
		Str+="world";
		Str = Str +"hello 凯";
		System.out.println(Str);
	}
	/*public static void winner(){
		//字符和字符串的转换
		String ll ="hello word";
		char[] l =ll.toCharArray();//字符串转换为字符
		for(int i=0;i<ll.length;i++){
			System.out.print(l[i]+" ");

		}
		
		System.out.println(new String (l));//字符数组全部转换为字符串
		System.out.println(new String (l,1,5));//字符部分转换字符串
	}*/

	
    public static  boolean isName(String str){
			char[] data= str.toCharArray();
			for(int i=0;i<data.length;i++){
				if (data[i]>'9'||data[i]<'0'){
			return false;
				}
				
			}
				return true;
			}
	public static void main(String[] args ){
 	//判断一个字符串是否由数字组成
		String  n ="12345678";
		System.out.println(isName(n));
		}
}			