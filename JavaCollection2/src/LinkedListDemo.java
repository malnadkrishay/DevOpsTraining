import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> c=new LinkedList<String>();
	c.add("Sampath Mandava");
	c.add("Abdelmounaim Hafid");
	c.add("Alex");
	c.add("Brain Snow");
	c.add("Cristian");
	System.out.println("Collection"+c);
	c.addFirst("Bryan");
	System.out.println("Add First"+c);
	c.addLast("Trevor");
	System.out.println("Add Last"+c);
	c.peek();
	System.out.println("Peek Operation"+c);
	c.poll();
	System.out.println("Poll Operation"+c);
	c.pollLast();
	System.out.println("Poll Operation towards Last"+c);
}
}
