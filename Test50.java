import java.util.ArrayList;
import java.util.List;

/**
 * Author：TaiLong
 * created:2018/12/29
 */
public class Test50 {
    static class OOMObject {

        public static void main(String[] args) {
            List <OOMObject>
                    list = new ArrayList <>();
            while (true) {
                list.add(new OOMObject());
            }
        }
    }
}
