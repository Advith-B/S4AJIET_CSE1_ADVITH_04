import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) 
	{
	    ArrayList<String>list=new ArrayList<>();
	    list.add("Java");
	    list.add("python");
	    list.add("Java");
	    list.add(0,"Advith");
	    list.set(2,"ada");
	System.out.println(list);
	System.out.println(list.get(1));
	list.remove(1);
	System.out.println(list);
	System.out.println("size is "+ list.size());
}
}
