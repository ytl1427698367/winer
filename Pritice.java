public class Pritice{
	 static String name = "hello";
	 String price;
	public Pritice(){
		
	}
	public Pritice(String price){
		this.price = price;
		
		
	}
	String haha(){
		return "名字是"+Pritice.name+"价格为"+price;
	}
	public static void main(String[] args){
		Pritice nn = new Pritice("20万");
	System.out.println(nn.haha());
	}
}