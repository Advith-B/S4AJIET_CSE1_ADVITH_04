import java.util.HashMap;
public class Main
{
	public static void main(String[] args)	{
		HashMap<Integer,String>m = new HashMap<>();
		m.put(101,"Alice");
		m.put(102,"Alex");
		System.out.println(m);
		System.out.println("Size = "+m.size());
		m.remove(102);
		System.out.println(m);
		System.out.println("Size = "+m.size());
		System.out.println(m.get(101));
	}
}
