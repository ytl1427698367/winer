//使用抽象类
abstract class Person{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public abstract void getpersoninfo();//抽象方法没有方法体方法体
	
}
class  Student extends Person{
	public  void getpersoninfo(){
		//方法的覆写
		System.out.println("i am a student");
		
}
}
public class Text6{
public static void main (String[] args){
	Person per = new Student();//实例化子类
	per.getpersoninfo();//被子类所覆写的方法
}
}
