package collections.List;
import java.util.*;

public class assignment5 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	List<String> list = new LinkedList<>();
	for (int i = 0;i < 12;i++) {
		list.add(s.nextLine());
	}
	System.out.println(list);
	s.close();
}
}