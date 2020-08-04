package com.wpro.sets;
import java.util.*;
public class Assignment3 {
public static void main(String[] args) {
	Set<String>s= new TreeSet<>(Collections.reverseOrder());
	s.add("alice");
	s.add("duck");
	s.add("chuck");
	s.add("elephant");
	s.add("rose");
	System.out.println(s);
	Iterator<String> i = s.iterator();
	String query = "chuck";
	boolean isThere = false;
	while (i.hasNext()) {
		if (query.equals(i.next())) {
			isThere = true;
			break;
		}
	}
	if (isThere) {
		System.out.println(query + " exists");
	}
	else {
		System.out.println(query + " not exists");
	}
}
}