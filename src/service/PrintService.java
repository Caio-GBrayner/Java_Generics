package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> {
	
	List<Type> list = new ArrayList<>();
	
	public PrintService() {
	}
	
	public void addValue(Type value) {
		list.add(value);
	}
	
	public Type fist() {
		if (list.isEmpty()) {
			throw new IllegalStateException("The list is empty");
		}
		else {
			return list.get(0);
		}
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}

}
