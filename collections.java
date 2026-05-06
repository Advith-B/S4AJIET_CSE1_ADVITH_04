import java.util.LinkedList;
import java.util.Collections;
public class Main
{
	public static void main(String[] args)	{
		LinkedList<Integer>CSE=new LinkedList<>();
		CSE.add(10);
		CSE.add(20);
		CSE.addFirst(5);
		CSE.addLast(4);
		Collections.sort(CSE);
		System.out.println("List is = "+CSE);
		Collections.sort(CSE,Collections.reverseOrder());
		System.out.println("Reverse List is = "+CSE);
		System.out.println("First element is  "+CSE.getFirst() );
	}
}
