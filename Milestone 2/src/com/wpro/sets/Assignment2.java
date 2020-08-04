package com.wpro.sets;
import java.util.*;
public class Assignment2 {
public static void main(String[] args) {
	Set<String> emp = new HashSet<>();
	emp.add("RAM");
	emp.add("RAHIM");
	emp.add("ROBERT");
	emp.add("RAJU");
	emp.add("KHAJA");
	Iterator<String>i= emp.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());
	}
}
}