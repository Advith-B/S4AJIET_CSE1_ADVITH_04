import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) 
	{
	    LinkedList<Integer>CSE=new LinkedList<>();
	   CSE.add(10);
	   CSE.add(20);
	   CSE.addFirst(5);
	   CSE.addLast(4);
	System.out.println(CSE);
	System.out.println("First element is  "+CSE.getFirst() );
}
}
