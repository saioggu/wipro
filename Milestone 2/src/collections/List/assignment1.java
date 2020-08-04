package collections.List;
import java.util.*;
public class assignment1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		for (int i = 0;i < 12;i++) {
			al.add(s.nextLine());
		}
		System.out.println(al);
		s.close();
	}
	}
