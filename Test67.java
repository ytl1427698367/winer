package longjava;

/**
 * Author：TaiLong
 * created:2019/1/14
 */
class Gril {
    private String name;
    private String weight;
    private int age;

    public void setName(String na) {
        this.name = na;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return this.age;
    }

    public void setWeight(String m) {
        this.weight = m;
    }

    public String getWeight() {
        return this.weight;
    }

    public String Gril(String name, String weight, int age) {
        return "姓名" + this.name + "年龄" + this.age + "体重" + this.weight;
    }

    public String Gril(String name, String weight) {
        return "姓名" + this.name + "体重" + this.weight;
    }

}
class GirlFriend extends Gril{
        private String natture;
        public void setNatture(String natture){
            this.natture=natture;
        }
        public String getNatture(){
            return  this.natture;
        }
        }

public class Test67 {
    public static void main(String[] args) {

        GirlFriend girlFriend=new GirlFriend();
        girlFriend.setAge(23);
        girlFriend.setNatture("开朗");
        girlFriend.setName("凯皇");
        girlFriend.setWeight("43kg");
        System.out.println("姓名"+girlFriend.getName()+"年龄"+girlFriend.getAge()+"体重"+girlFriend.getWeight()+"性格"+girlFriend.getNatture());
        System.out.println(girlFriend.Gril("凯皇","43kg",23));
    }
}
