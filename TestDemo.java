/**
 * Author：TaiLong
 * created:2018/12/8
 */
enum color {
    RED, GREEN, BLUE;
}

enum colors {
    red("红色"), bule("蓝色");
    private String title;

    private colors(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class TestDemo {
    public static void main(String[] args) {
        System.out.println(color.RED.ordinal() + color.RED.name() + "\n" + color.BLUE.name());
        System.out.println(colors.bule);
        for (color temp : color.values()) {
            System.out.println(temp.ordinal() + temp.name());
        }
    }
}

