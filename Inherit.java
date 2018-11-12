//继承的实现

class person {
	private String name;
	private String age;
	private String gender;
	public  String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAge(){
		return age;
	}
	public void setAge(String age){
		this.age = age;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
}
class Student extends person{
	private String school;
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school = school;
	}
}
public class Inherit{
	public static void main(String[] args){
		Student stud = new Student();
		stud.setGender("男");
		stud.setName ("泰隆");
		stud.setAge("20");
		stud.setSchool("西安工业大学");
		System.out.println("你的姓名叫"+stud.getName()+"\n"+"性别为"+stud.getGender()+"\n"+"你的年龄为"+stud.getAge()+"\n"+
		"你所在的大学为"+stud.getSchool());
	}
}