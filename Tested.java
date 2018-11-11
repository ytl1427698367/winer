class person{
	{
		//定义在类中，不任何修饰符，构造块
		System.out.println("person类中的构造块");
	}
	public person(){
		System.out.println("person类中的构造方法");
	}
	static{//定义非主类的静态块
	System.out.println("person类中的静态块");
		
	}
}
public class Tested{
	public static void main(String[] args){
		System.out.println("--------start--------");
		new person();
		System.out.println("--------end-------");
	}
}