import java.util.Arrays;
public class Main
{
	public static void main(String[] args)	{
		String s1="listen";
		String s2="silent";
	
	if(s1.length()!=s2.length())
	System.out.println (false);
		else {
			char[] s11 = s1.toCharArray();
			char[] s22 = s2.toCharArray();
			Arrays.sort(s11);
			Arrays.sort(s22);
			System.out.println( Arrays.equals(s11,s22));
		}
	}
}

