import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Question1Test {
	public static LinkedList sortByFreq(int[]input1 ,int size) {
		
		int[] array =input1;
		
		//step1.count  frequency need map 
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> outputArray = new ArrayList<>();

		// add in map key(value),val(freq) 1.find freq
		for (int current : array) {
			int count = map.getOrDefault(current, 0);
			map.put(current, count + 1);
			outputArray.add(current);
		}

		LinkedList<Integer> item = new LinkedList<Integer>(map.keySet());
		LinkedList<Integer> freq = new LinkedList<Integer>(map.values());
		LinkedList<Integer> out = new LinkedList<Integer>();
		//sort freq of item in descending order
		Collections.sort(freq);
		java.util.Iterator<Integer> i = freq.descendingIterator();
		int sortFreq[] = new int[freq.size()+1];
		
		int j = 0;
		while (i.hasNext()) {
			sortFreq[j]=(int)i.next();
			j++;
		}

		// Traversing the list of elements in freq order
		j = 0;
		int fr;
		while(j<sortFreq.length&&out.size()<=array.length) {
			
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			fr = (int) entry.getValue();
			
			if (fr == sortFreq[j]) {
				if(sortFreq[j] == sortFreq[j+1])
					j++;
					for (int i1 = 1; i1 <=fr&&out.size()<=array.length; i1++) {
					out.addLast(entry.getKey());
					}
					
					
							}
			
			
		}
		j++;
		
		System.out.println("out" + out);
		
		}
		
		
		
		
		
		return out;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1
		

	}

}
