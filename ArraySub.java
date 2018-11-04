 public class array_max_number{
	public static int max (int[]data){
		if(data==null){
	throw new illegalargumentexception("a mudt be not null.");

		}
		int maxnumber = data[0];
		for(int i = 0;i<data.length;i++){
			if (maxnumber<data[i]){
				maxnumber = data[i];
			}
			continue;
		}
		return maxnumber;
	}

public static void main(string[]args){
	int[] arraymax = {56,26,51,45,78,25,68,52,45};
	int maxnumber = max(arraymax);
	system.out.print(maxnumber);
}
}
public class arraysum{
	public static int sum(int[]data){
		 if(data==null){
	 throw new illegalargumentexception("data must be not null.");

	}
	int sum = 0;
	for (int i = 0;i<data.length;i++){
		sum = sum+data[i];
	}
	return sum;
}
public static void main(string[]args){
	int [] arrays={52,25,3,2,2,45,56,85};
	//静态数组初始化
	int sumnumber = sum(arrays);
	system.out.print(sumnumber);
}
}
实现数组的拼接
public class arrayjoin{
	public static int[] arrayjoin(int[]a,int[]b){
		 if(a==null||b == null){
	 throw new illegalargumentexception("a or b must be not null.");
		 }
		 int len = a.length+b.length;
		 int [] c=new int[len];
		 for (int i=0 ;i<a.length;i++){
			 c[i] = a[i];
		 }
		 for(int i = a.length;i<c.length;i++){
			 c[i] = b[i-a.length];
		 }
		 return c;
	}
	public static void main (string[]args){
		int[]a = {25,25,3};
		int[]b = {52,25,3};
		int[]c = arrayjoin(a,b);
		system.out.print(c);
	}
}
 public class ArraySub{
	public static int[] arraysub(int[]a,int start,int end){
		if(a==null){
	throw new IllegalArgumentException("a  must be not null.");
		}
		if(start<0||end<0){
	throw new IllegalArgumentException("start or end must be >0.");
		}
		if(start>=a.length){
	 throw new IllegalArgumentException("start must be <a.leng.");
		}
		if(start>end){
		throw new IllegalArgumentException("start must be <end.");
		}
		int count = end-start;
		if(count>a.length){
		throw new IllegalArgumentException("count must be <=a.length.");
		}
		int [] b = new int[count];
		for(int i = start;i<end;i++){
			b[i-start]=a[i];
		}
		return b;
		}
		public static void printarry(int[]a){
			if(a==null){
				return;
			}
			for( int i = 0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
			}
		public static void main(String[]args){
			int[]a = new int[] {2,5,2,6,6,6,6,65,5};
			int []sub = arraysub(a,2,5);
			//System.out.println(sub);
			printarry(sub);
		}
		}
		
	
	
	
	