package tailong;

/**
 * Author：TaiLong
 * created:2018/12/9
 */
//使用泛型定义point文件
class point<T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
public class Test30 {
    public static void main(String[] args) {
        point<String> p=new point<String>();
        p.setX("东经20度");
        p.setY("北纬30度");
        String x=p.getX();
        String y=p.getY();
        System.out.println("x="+x+","+"y="+y);
    }
}
