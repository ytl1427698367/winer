package longjava;

/**
 * Author：TaiLong
 * created:2019/1/11
 */
public class Test59 {
    public static void main(String[] args) {
        person[] per = new person[]{
                new person("张三", 22, 1427698367),
                new person("李四", 23, 1124562365)
        };
        for (int i = 0; i < per.length; i++) {
            per[i].infor();
        }
    }

    static class person {
        private String name;
        private int age;
        private int num;

        public person(String name, int age, int num) {
            this.name = name;
            this.age = age;
            this.num = num;
        }

        public void infor() {
            System.out.println("姓名" + this.name + "年龄" + this.age + "qq联系方式" +this. num);
        }

    }
}
