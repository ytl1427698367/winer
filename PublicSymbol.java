/**
 * Author：TaiLong
 * created:2019/4/2
 */
class  p<T>{
    private T name;
    private T sex;
    public void setName(T name){
        this.name=name;
    }
    public T getName(){
        return this.name;
    }
    public void setSex(T sex){
        this.sex=sex;
    }
    public T getSex(){
        return this.sex;
    }

}
public class PublicSymbol {
    public static void main(String[] args) {
        p <String> i = new p <>();
        i.setName("王小娜");
        i.setSex("女");
        fun(i);
    }
       public static void fun(p<?> temp){//通配符的使用，他可以接受任何的数据类型
           System.out.println("姓名"+temp.getName()+"性别"+temp.getSex());

        }
    }

