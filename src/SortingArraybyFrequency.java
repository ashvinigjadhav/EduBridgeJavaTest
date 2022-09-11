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
public class SortingArraybyFrequency {
	public static int[] sortFreq(int[] A, int size) {
		int A1[] = { 0,0,0,0,0,0, 0,0,0,0 };
		int n = 0;
		int freq = 0;
		A1[n] = A[0];
		A[0] = -9999;
		int i = 1;

		while (i < A.length) {
			System.out.print("\n i=" + i + "n="+n+"\n");
			for (int j = 1; j < A.length; j++) {
				
				System.out.println(A1[n]+"=="+A[j]);
				if (A[j] == -9999 && j < A.length - 1) {
					j++;
								}
				
				else if (A1[n] == A[j]) {
					
					n++;
					A1[n] = A[j];
					System.out.println("A1 " + A1[n]);
					freq++;
					A[j] = -9999;
				}

			} // fori

			if (A[i] != -9999) {
				n++;
				A1[n] = A[i];
				System.out.print("A1" + A1[n]);
			}
			
							
			if (i< A.length - 1)
			i++;

		} 
		
		
		
		return A1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Inpu1[] = { 5, 5, 4, 6, 4 ,9, 9, 9, 2, 5};
		int input2[] = { 9, 9, 9, 2, 5 };
		int output1[] = { 0, 0, 0, 0, 0,0, 0, 0, 0, 0 };
		int output2[] = { 0, 0, 0, 0, 0 };

		output1 = sortFreq(Inpu1,10);
		
		for (int j = 0; j < output1.length; j++) {
			System.out.print(" " + output1[j]);
		}

	}

}
