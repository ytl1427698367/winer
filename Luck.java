//观察简单的覆写
class person{
	public void print(){
	System.out.print("1.[person]的print方法");
}
}
class Student extends person{
	public void print(){
		System.out.println("2.[student]类中的print方法");
	}
}
public class Luck{
	public static void main(String[] args){
		new Student().print();
	}
}
