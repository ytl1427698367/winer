class Person{
private String name ;
private int age ;
public Person(String name, int age) {
this.age = age ;
this.name = name ;
}
public String toString(){
	return "姓名"+name+"年龄"+age;
}
class Student{}
public class Test20{
public static void main(String[] args){
	fun(new Person("kai",20));
	
}
}
 public static void fun(Object obj){
	System.out.println(obj.toString());
}	
}