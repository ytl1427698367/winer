//在抽象类中定义构造方法
abstract class Person{
	private String name;
	public Person(){
	System.out.println("hello,jack");
}

public String getName(){
	return name;
}
public void setName(String name){
	this.name = name;
}
public abstract void getPersoninfo();
}
class Student extends Person(){
	public Student(){
		System.out.println("helllo,tom");
	}
	public void getPersoninfo(){
		}
	}
	
     public class Test8(){
	public static void main(String[] args){
		Person per = new Person();
	  per.Person();
      Student stu = new Student();
       stu.Student();
	}
}

