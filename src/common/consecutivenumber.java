package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * Q2) Longest consecutive subsequence

Given an array of positive integers. Find the length of the longest sub-sequence such that ele-
ments in the subsequence are consecutive integers, the consecutive numbers can be in any or-
der.

Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive
subsequence
 * 
 */
public class consecutivenumber {
	public static int findconsecutivenumbers(int[]input1){
int[] array =input1;
		
		//step1.add element in  SortedMap
		SortedMap<Integer, Integer> consecutivemap= new TreeMap<Integer, Integer>();
		
		// add in map key(value),val(freq) 1.find freq
		int i=1;
		for (int current : array) {
		
			consecutivemap.put(current,i);
			i++;
		}
		
		LinkedList<Integer> key = new LinkedList<Integer>(consecutivemap.keySet());
		LinkedList<Integer> val = new LinkedList<Integer>(consecutivemap.values());
		
		if(key.getLast()==val.getLast())
		{
			
			return(val.getLast());
		}
		int sortlist[] = new int[val.size()+1];
		int consecutiveno=1;
		for(int i1=0;i1<key.size()-1;i1++) {
			
			if(key.get(i1+1)-key.get(i1)==1)
			{
				
				consecutiveno++;
			}
			else if(key.size()==i1)
				break;
			else
				break;
		}
	return(consecutiveno);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int size;
		int[] input1=new int[7];
		
		
		System.out.println("Enter size of array" );
		size=in.nextInt();
		System.out.println("Enter Element array" );
		for(int i=0;i<size;i++)
		{
			input1[i]=in.nextInt();
		}
		
		
		System.out.print("\ninput1 [");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+input1[i]);
		}
		System.out.print("]");
		int c1=findconsecutivenumbers(input1);
		System.out.print("consecutivenumber"+c1);
	}

}
