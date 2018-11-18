import java.util.Scanner;
public class Randoms{
	private final int value;
	public Randoms(){
		java.util.Random random = new java.util.Random();
            this.value = random.nextInt(100);
			}
public void play(){
	System.out.println("开始游戏");
           Scanner scanner = new Scanner(System.in);
                      while(true){
					System.out.println("请输入你猜的数字");
				int number = scanner.nextInt();

            if(number>this.value){
	            System.out.println("大了，往小");
              }
                 else if(number<this.value){
	                System.out.println("小了，往高");
                }
           else
                          {
	              System.out.println("恭喜你答对了");
	                        break;
						  }
                        }
	                   }
	public static void main(String[] args){
	Randoms number = new Randoms();
	number.play();
	         }
                         }