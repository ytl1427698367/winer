/**
 * Author：TaiLong
 * created:2019/4/4
 */
enum Color {
    red("红色"), blue("蓝色"), black("黑色");

    private String title;

    private Color(String title) {
        this.title = title;
    }

    public String toString() {
        return this.title;
    }
}

public class EnmPractise {

    public static void main(String[] args) {
        System.out.println(Color.red + "\n" + Color.red.ordinal());
    }
}


