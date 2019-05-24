/**
 * Author：TaiLong
 * created:2019/5/23
 */
public class DelectDecptionStr {
    public static void main(String[] args) {
        DelectDecptionStr v = new DelectDecptionStr();
        v.ChoiseAry("acnb", "ac");
    }

    public String ChoiseAry(String str1, String str2) {
        char data[] = str1.toCharArray();
        char data1[] = str2.toCharArray();
int l=0;
        char[] b=new char[l+1];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data1.length; j++) {
                if (data[i] == data1[j]) {
                data[i]=data[i++];



























                l++;
                    }

            }

            System.out.println(data[i]);

            }
        String str = new String(data);
        return str;
    }
//
}