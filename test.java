//普通代码块
public class test{
	public static void main(String[] args){
		{
			//直接使用{}，普通方法块
			int x = 10;
			System.out.println("x="+x);
		}
		int x =100;
		System.out.println("x="+x);
	}
	//如果方法中代码过长，为避免重名，使用普通代码块
}