public class Num{
    public static void main(String[] args){
Num c=new Num();
String s="gf1dg1313fg6gf3g13f44464645fg4";
c.mostLong(s);
    }
    public String mostLong(String str){
        char[] data= str.toCharArray();
        System.out.println(data[2]);
        int l=0;
        for(int i=0;i<data.length;i++){
            if(data[i]>'9'){
                continue;
            }

            int[] a=new int[l+1];
            a[l]=data[i];
            l=l+1;
            System.out.println(a.length);

            }

        return "hello";
    }

}