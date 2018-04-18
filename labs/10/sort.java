//package hrlp;

import java.util.ArrayList;

public class sort {

	public static void main(String[] args) {
		//declare list
		ArrayList<Number> list = new ArrayList<>();

		// add numbers to list
		list.add(8);
		list.add(2);
		list.add(9);
		
		sort(list);

			System.out.print(list.toString());
	}
	public static void sort(ArrayList<Number> list) {
		//for loops to swap out smalest
		for (int i = 0; i < list.size() - 1; i++) {
			Number smallest = list.get(i);
			int index = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (smallest.doubleValue() > list.get(j).doubleValue()) {
					smallest = list.get(j);
					index = j;
				}
			}

			// change index i with smallest if necessary
			if (index != i) {
				list.set(index, list.get(i));
				list.set(i, smallest);
			} 
		}
	}

}
