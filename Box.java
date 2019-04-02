/**
 * Author：TaiLong
 * created:2018/12/3
 */
class Box1{
    double length;
    double width;
    double height;
   Box1(double l,double w,double h){
       length=l;
       width=w;
       height=h;
   }
   double volume(){
       return length*width*height;
   }
}
public class Box {
    public static void main(String[] args) {
        Box1 mybox = new Box1(20.23, 20.3, 1.2);
        mybox.volume();
        System.out.println(mybox.volume());
    }
}
