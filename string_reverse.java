public class Main
{
	public static void main(String[] args) {
	String s="bob";
	String rev=" ";
	for(int i=0;i<s.length();i++){
	    rev=s.charAt(i)+rev;
	}
	System.out.println("Reverse is : "+rev);	}
}
