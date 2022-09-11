import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * Q1) Sorting Elements of an Array by Frequency

Given an array A[] of integers, sort the array according to frequency of elements. That is ele-
ments that have higher frequency come first. If frequencies of two elements are same, then
smaller number comes first.
Input:

The first line of input should contains an integer T denoting the number of test cases. The de-
scription of T test cases follows. The first line of each test case contains a single integer N denot-
ing the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting
the elements of the array.
Output:
For each test case, in a new line, print each sorted array in a separate line. For each array its
numbers should be separated by space.
 * 
 * 
 */
public class SortingbyFrequency {
	
	
	public static void Frequencysort(int[],int size) {
		int[] array = { 4, 3, 2, 2, 3, 2, 2, 4, 1, 1, 6, 7, 5 };
		int[] array1 = new int[10];
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
		Collections.sort(freq);
		Iterator i = freq.descendingIterator();
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
		
	}

	public static void main(String[] args) {

		
		
		int[] array = { 4, 3, 2, 2, 3, 2, 2, 4, 1, 1, 6, 7, 5 };
		int[] array1 = new int[10];
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
		Collections.sort(freq);
		Iterator i = freq.descendingIterator();
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
	}
}
