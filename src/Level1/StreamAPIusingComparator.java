package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamAPIusingComparator {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(45);
		list.add(86);
		list.add(34);
		list.add(21);
		list.add(93);
		
		SortListElements sortCode=new SortListElements();
		Collections.sort(list, sortCode);
		
		for(int i: list) {
			System.out.print(i+" ");
		}
		
	}

}
