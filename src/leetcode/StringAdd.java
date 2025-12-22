package leetcode;


public class StringAdd {

	public static void main(String[] args) {
	String s1 = "99";
	String s2 = "99";
	
	int n = s1.length();
	int m = s2.length();
	
	int i=n-1;
	int j=m-1;
	int carry =0;
	String res = "";
	while(i>0 || j>=0) {
		int d1=0;
		int d2=0;
		
		if(i>=0)
			d1 = s1.charAt(i) -'0';
		if(j>=0)
			d2 = s2.charAt(j) -'0';
		int val=d1+d2+carry;
		int add = val % 10;
		carry = val/10;
		res = (char)(add+'0')+res;
		i--;
		j--;
	}
	 if (carry > 0)              
         res = carry + res;

		System.out.println(res);
	}

}
