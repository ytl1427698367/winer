public class Sendflower{
	
	interface  Sendrock{
		void  send();
	}
	class Boyfriend implements Sendrock{
		private String  boyname;
		private String  grilname;
		public Boyfriend(String boyname,String grilname){
			this.boyname = boyname;
			this.grilname = grilname;
		}
		public void send(){
			System.out.println(boyname+"送玫瑰给叫"+grilfriend+"的女朋友");
			
		}
	}
	class Courier implements Sendrock{
		private final Sendrock target;
		public Courier(Sendrock target){
			this.target = target;
		}
		public void send(){
			System.out.println("快递员给客户打电话");
			this.target.send();
			System.out.println("客户签收");
		}
	}
		public static void main(String[] args){
			Boyfriend target = new Boyfriend("天羽","雪儿");
			Courier proxyObject = new Courier(target);
			proxyObject.send();
		}
	}
