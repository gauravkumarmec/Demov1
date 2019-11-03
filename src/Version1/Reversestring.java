package Version1;

public class Reversestring {

	public static void main(String[] args) {
		String s="Selenium";// string is immutable
		// 1) Using for loop
		int len=s.length();//8
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);//mui...
		}
        System.out.println(rev);
        
        // 2) Using string buffer class      Muttable
        StringBuffer sf=new StringBuffer(s);
       System.out.println( sf.reverse());
	}

}
