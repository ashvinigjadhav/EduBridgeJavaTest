package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortByFrequency {
	
public static void sortByFreq(int[]input1 ,int size) {
		
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
					if(sortFreq[j] == sortFreq[j+1]) //skip all same freq element added once
							j++;
					for (int i1 = 1; i1 <=fr&&out.size()<=array.length; i1++) {
					out.addLast(entry.getKey());
								}
										
		}
			
		}
		j++;
		
		
		
		}
		System.out.println("");
		System.out.println("sorted By freq" + out);
		//return out;
		
		
	}
public static void main(String Arg[]) {
	Scanner in =new Scanner(System.in);
	int T,size;
	int[] input1=new int[5];
	int[] input2=new int[5];
	System.out.println("Enter number of test" );
	T=in.nextInt();
	System.out.println("Enter size of array" );
	size=in.nextInt();
	System.out.println("Enter Element array" );
	for(int i=0;i<size;i++)
	{
		input1[i]=in.nextInt();
	}
	
	System.out.println("Enter Element input 2 array" );
	for(int i=0;i<size;i++)
	{
		input2[i]=in.nextInt();
	}
	
	System.out.print("]");
	System.out.print("\n");
	System.out.print("\ninput1 [");
	for(int i=0;i<size;i++)
	{
		System.out.print(" "+input1[i]);
	}
	System.out.print("]");
	sortByFreq(input1 ,5);
	System.out.print("\n");
	System.out.print("\ninput2 [");
	for(int i=0;i<size;i++)
	{
		System.out.print(" "+input2[i]);
	}
	sortByFreq(input2 ,5);
}
}
