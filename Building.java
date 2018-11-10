public class Building{
	private String size;
	private String locate;
	private String price;
	public Building(){
		
	}
	public Building(String size,String locate){
		this.size = size;
		this.locate = locate;
	}
	public Building(String size,String locate,String price){
		this(size,locate);
		this.price = price;
	}
	String Build(){
		return "房子的大小为"+size+"\n"+"房子的地理位置在"+locate+"\n"+"房子的价格为"+price;
	}
	 String getSize(){
		return size;
	}
	String getLocate(){
		return locate;
	}
	String getPrice(){
		return price;
	}
	void setSize(String size){
		this.size = size;
	}
	void setLocate(String locate){
		this.locate = locate;
	}
	void setPrice(String price){
		this.price = price;
	}
	public static void main(String[] args){
		Building build = new Building();
			build.price = "108万";
			build.size = "120平方米";
			build.locate = "西安未央区";
			System.out.println(build.Build());
			Building build1 = new Building("100平方米","西安未央区","100万");
			System.out.println(build1.Build());
		
	}
}