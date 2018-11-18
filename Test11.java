//抽象基类的实现
abstract class CoffeeineBeverage{
	final void prepareRecipe(){
		boilwater();
		brew();
		pourIncup();
	   addcondiments();
	}
	abstract void brew();
	abstract void addcondiments();
	   void boilwater(){
		System.out.println("将水煮沸");
	   }
		void pourIncup(){
			System.out.println("将水倒入杯子中");
		}
	}
	class Tea extends CoffeeineBeverage{
		void brew(){
			System.out.println("将茶叶放入杯子");
		}
		void addcondiments(){
			System.out.println("放入柠檬汁");
		}
	}
	class Coffee extends CoffeeineBeverage{
		void brew(){
			System.out.println("把咖啡倒入杯子中");
		}
		void addcondiments(){
			System.out.println("放点糖");
		}
	}

	public class Test11{
	public static void main (String[] args){
		CoffeeineBeverage tea = new Tea();
		CoffeeineBeverage coffee = new Coffee();
		tea.prepareRecipe();
		coffee.prepareRecipe();
	}
	}
