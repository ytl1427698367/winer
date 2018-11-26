//单例设计模式，所谓单例设计模式是指一个类只可以产生一个实例化对象
class Singlon{
public	void print(){
		System.out.println("hello world");
}	
	}
	public class Test21{
		public static void main(String[] args){
			Singlon ha = null;
			ha =new Singlon();
			ha.print();
		}
	}
