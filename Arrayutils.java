public class Arrayutils{
	 //1.计算数组中最大值
	 		int[] data=new int[]{25,52,65,25,45,45,78};

    public static int arrayMaxElement(int [] data){
		if(data==null){
			thow new IllegalArgumentExtion("a mudt be not null.");
		}
		int max=data[0];
		for(i=0;i<7;i++){
		if(max<data[i]){
			max=data[i];
		}
		continue;
		}

        return max;
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int [] data){
		if(data==null){
						thow new IllegalArgumentExtion("a mudt be not null.");

		}		
		int min=a[0];
		for(i=0;i<data.length;i++){
			if(min[i]<data[i]){
			min=data[i];}
			continue;
		}
        return min;
    }
    
    
    //3.计算数组值之和
    public static int arrayElementSum(int [] data){
					thow new IllegalArgumentExtion("a mudt be not null.");
					
	}
		if(data==null){
			
		int sum=0;
		for(i=0;i<date.length;i++){
			sum=sum+data[i];
		}
			
        return sum;
    }
    
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
		if(a==null){
						thow new IllegalArgumentExtion("a mudt be not null.");

		}
		if(b=null){			
		thow new IllegalArgumentExtion("a mudt be not null.");

		}
		int len=a.leng+b,length;
	int[] c=new int[len];
	for(int i=0;i<a.length;i++){
		c[i]=a[i];
	}
	for(i=a.length;i<c.length;i++){
		c[i]=b{i-a.length);
		}
		 return c;
    }

    //5.数组截取
    //[start, end)
    public static int[] arrayJoin(int[] a, int start , int end){
        return new int[]{};
    }
    
    
    public static void main(String[] args){
	}

public static void main(String[]args){
	int[] all=new int[]{20,25,23,14,25,45};
	int max =arrayMaxElement(all)
	System.out.print(max);
}
}