package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintService {
	
	List<Double> list = new ArrayList<>();
	
	public PrintService() {
	}
	
	public void addValue(Double value) {
		list.add(value);
	}
	
	public Double fist() {
		if (list.isEmpty()) {
			return null;
		}
		else {
			return list.get(0);
		}
	}
	
	public void print() {
			Collections.sort(list);
			
			for(Double l : list) {
				System.out.print(l + ",");
			}
	}

}
