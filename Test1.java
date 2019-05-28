import java.util.Scanner;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int A = in.nextInt();
            int B = in.nextInt();
          if(A-B==1||B-A==1){
                System.out.println(A*B);
               continue;
            }
                for(int i=1;i<=A;i++){

                    if(((i*B)/(A))%1==0){
                        System.out.println(i*B);
                        break;

                    }

                }
            }

        }
    }
