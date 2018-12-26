package lon.com;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

class  Order1 {
    private String title;
    private double price;
    private int count;

    public Order1(String title, double price, int count) {
        this.title = title;
        this.price = price;
        this.count = count;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public double getPrice() {

        return price;
    }

    public void setCount(int count) {

        this.count = count;
    }

    public int getCount() {

        return count;
    }
}

public class Test49 {
    public static void main(String[] args) {
        List <Order1> orderlist = new ArrayList <>();
        orderlist.add(new Order1("Apple", 11111.23, 10));
        orderlist.add(new Order1("小米", 9999, 32));
        orderlist.add(new Order1("华为", 8888.1, 200));
        orderlist.add(new Order1("Opple", 5555, 56));
        orderlist.add(new Order1("努比亚", 6666, 45));
        DoubleSummaryStatistics kai = orderlist.stream().mapToDouble((obj) -> obj.getPrice() * obj.getCount()).summaryStatistics();
        System.out.println("总量： " + kai.getCount());
        System.out.println("平均值" + kai.getAverage());
        System.out.println("最大值：" + kai.getMax());
        System.out.println("最小值： " + kai.getMin());
        System.out.println("总和： " + kai.getSum());
    }
}















