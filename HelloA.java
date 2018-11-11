class HelloB{
	//构造方法
	public HelloB(){
		System.out.println("HelloA,父类构造方法");
	}
	//非静态代码块
	{
		System.out.println("父类非静态代码块");
	
	}
	//静态代码块
	static{
		System.out.println("StaticA 父类静态代码块");
	}
}

public class HelloA extends HelloB{
	//构造方法
	public HelloA(){
		System.out.println("helloB,构造方法");
	}
	//非静态代码块
	{
		System.out.println("非静态代码块");
	}
	//静态代码块
	static{
		System.out.println("srtatic B ,静态代码块");
		
	}
	public static void main(String[] args){
		System.out.println("----statr-----");
		new HelloA();
		new HelloA();
		System.out.println("------end-----");
	}
}
