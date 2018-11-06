public class Car{
	private String brand;
	private int number;
	private  String price;
	private  String size;
	public Car(String brand,int number){
		this.brand = brand;
		this.number = number;
	}
	public Car(){

	}
	public Car(String brand,int number,String price,String size){
		this(brand,number);//构造方法的重载
		this.price = price;
		this.size = size;
	}
	String cars(){
		return "品牌是"+brand+"车牌号是"+number+"价格为"+price+"尺寸为"+size+".";
		
	}
	String getBrand(){
		return brand;
	}
	String getPrice(){
		return price;
	}
	String getSize(){
		return size;
	}
	int getNumber(){
		return number;
	}
void setNumber(int number){
	this.number = number;
}
	void setPrice(String price){
		this.price = price;
	}
	public static void main(String[] args){
		Car car =new Car();
		car.brand ="霸道";
		car.number = 5201314;
		car.size ="小";
		car.price ="88万";
		System.out.println(car.cars());
	}
		
	}
	
