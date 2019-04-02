/**
 * Author：TaiLong
 * created:2019/3/27
 */
class Out {//定义一个外部类
    private String talk = "王小娜，我喜欢你";

    class In {//定义一个内部类
        public void pront() {//定义一个普通方法
            System.out.println(talk);//调用Out的属性
        }
    }

    public void fun() {//在外部类定义一个方法
        In in = new In();
        in.pront();
    }
}

public class Outer {
    public static void main(String[] args) {
        Out out = new Out();
        out.fun();
    }
}
