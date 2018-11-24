public class Test17{
	public static void main(String[] args){
		System.out.println(fillBefore("avsg",'t',8));
	}
	public static String fillBefore(String str, char filledChar, int len) {
	
		if(str.length() >= len){
			return str;
		}
		else{
			StringBuffer sb = new StringBuffer(str);
			for(int i = sb.length();i < len;i++){
				sb.insert(sb.0,filledChar);
			}
			return sb.toString();
			
		}
	}
}
  /**
     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串
     * 字符填充于字符串前
     *
     * 例如： 
     * "abc" 'A' 5  => "AAabc"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
  
    