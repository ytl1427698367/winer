class Person{
	{//定义在类中，不加任何修饰，构造块
		System.out.println("person类的构造块");
	}
	public Person(){
		System.out.println("person类的构造方法");
	}
}
public class Test1{
	public static void main(String[] args){
		new Person();
	
	}
}//构造块优先与构造方法，每产生一个新的对象就调用一次构造块