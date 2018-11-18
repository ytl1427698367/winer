//实现向上转型和向下转型
class Person{
	public void print(){
		System.out.println("我是父类");
	}
	}
	class Student extends Person{
		public void print(){
			System.out.println("我是子类");
		}
		public void ou(){
			System.out.println("只有子类有这个方法");
		}
	}
	public class Test10{
		public static void main(String[] args){
			Person per = new Student();//向上转型
			per.print();
			Student stu = (Student)per;//向下转型
			stu.ou();
		}
	}