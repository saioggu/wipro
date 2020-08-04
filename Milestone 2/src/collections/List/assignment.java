package collections.List;
import java.util.*;
public class assignment {
public void printAll (List<String> list) {
	Iterator<String> it = list.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
}
public static void main(String[] args) {
	assignment a = new assignment();
	List<String> list = new ArrayList<>();
	list.add("Element 1");
	list.add("Element 2");
	list.add("Element 3");
	list.add("Element 4");
	list.add("Element 5");
	a.printAll(list);
}
}
