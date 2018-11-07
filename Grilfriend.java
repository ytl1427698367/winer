public class Grilfriend{
	  private String name;
	  private String height;
	  private int age;
	  private String weight;
	  public Grilfriend(){
		  
	  }
	  public Grilfriend(String name,String height){
		  this.name = name;
		  this.height = height;
	  }
	  public Grilfriend(String name,String height,String weight){
		  this(name,height);
		  this.weight = weight;
	  }
	  public Grilfriend(String name,String height,String weight,int age){
		  this(name,height,weight);
		  this.age = age;
	  }
	   String friend(){
		   return "我的女朋友叫"+name+"\n"+"身高为"+height+"\n"+"体重为"+weight+"\n"+"年龄为"+age+".";
		   }
		 String getName(){
			   return name;
		   }
		  int getAge(){
			   return age;
		   }
		  String getWeight(){
			   return weight;
		   }
		  String getHeight(){
			   return height;
		   }
		   void setName(String name){
			   this.name = name;
		   }
		   void setWeight(String weight){
			   this.weight = weight;
		   }
		   void setAge(int age){
			   this.age = age;
		   }
		   void setHeight(String height){
			   this.height = height;
		   }
		   public static void main(String[] args){
			   Grilfriend gril = new Grilfriend();
			   gril.name = "开儿";
			   gril.age = 23;
			    gril.weight ="46kg";
			    gril.height = "163cm";
			    System.out.println(gril.friend());
			    Grilfriend gril1 = new Grilfriend("凯尔","164cm","45kg",23);
				   System.out.println(gril1.friend());
			  
		   }
		   
		   
		   
	
}











