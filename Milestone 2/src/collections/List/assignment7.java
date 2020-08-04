package collections.List;
import java.util.*;
public class assignment7 {
public static void main(String[] args) {
	List<Employee> list = new Vector<>();
	list.add(new Employee(101, "Raju", "rajubh@i.com", "M", 85000));
	list.add(new Employee(102, "Ram", "Rambh@i.com", "M", 80000));
	list.add(new Employee(103, "Rahim", "Rahimbh@i.com", "M", 200000));
	list.add(new Employee(104, "Robert", "Roberto.com", "M", 850000));
	Iterator<Employee> it = list.iterator();
	while (it.hasNext()) {
				System.out.println(it.next());
	}
}
}
