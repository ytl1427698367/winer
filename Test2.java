//内部类的简单定义
class Outer{
	private String msg = "Hello world";
	class Inner{//定义一个内部类
		public void print(){
			System.out.println(msg);//调用msg的属性
		}
	}
	public void fun(){//定义一个外部类
		Inner in = new Inner();//内部类对象
		in.print();//内部类提供的方法
	}
}
public class Test2{
public static void main(String[] args){
	Outer out = new Outer();//外部类对象
	out.fun();//外部类方法
}
}

	