/**
 * Author：TaiLong
 * created:2018/12/3
 */
class Box1{
    double length;
    double width;
    double height;
    double volume(){
        System.out.println(length*width*height) ;
return length*width*height;
        }
}
public class Box {
    public static void main(String[] args) {
        Box1 mybox = new Box1();
        mybox.length = 20.3;
        mybox.width = 31.3;
        mybox.height = 20.3;
        mybox.volume();
    }
}
