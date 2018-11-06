public class person{
	String name;
	int age;
	String personinfo(){
		return "这个人叫"+name+",年龄为"+age;
	}
	public static void main(String[] args){
		person p = new person();
		p.name="zhngsan";
		p.age = 22;
	System.out.print(p.personinfo());
	}
}