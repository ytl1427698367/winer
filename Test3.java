//使用static创建静态内部类
class Outer{
	private static String msg = "Hello World";
	static class Inner{//定义一个内部类
		public void print(){
			System.out.println(msg);
			
		}
	}
	public void fun(){
		Inner in = new Inner();//内部类对象
		in.print();//内部类提供的print（）方法
	}
}
public class Test3{
public static void main(String[] args){
	Outer.Inner in = new Outer.Inner();
	in.print();
}
}