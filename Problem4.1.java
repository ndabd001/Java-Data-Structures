/*******************************************************

Program Number: A4_1

Purpose/Description: <Create an iterative mergeSort method>

Author: <Nicolas Dabdoub>

Due date: <04/20/15>

Certification:

I hereby certify that this work is my own and none of it is the work of any other 

person.

 < Nicolas Dabdoub >

*******************************************************/
public class Problem1 
{
    public static void mergeSort(int[] A) 
    {
	int n = 1;
	int left, right;
                
        if(A.length < 2)
            return;
		
	while(n < A.length) 
        {
            left = 0;
            right = n;
            
		while(right + n <= A.length) 
                {
                    mergeArrays(A, left, left + n, right, right + n);
                    left = right + n;
                    right = left + n;
		}
                
            if(right < A.length) 
		mergeArrays(A, left, left + n, right, A.length);
            
            n *= 2;
        }
    }
    
    public static void mergeArrays(int[] A, int leftS, int leftEnd, int rightS, int rightEnd)
    {

        int[] right = new int[rightEnd - rightS + 1];
	int[] left = new int[leftEnd - leftS + 1];
        right[right.length-1] = Integer.MAX_VALUE;
	left[left.length-1] = Integer.MAX_VALUE;

	for(int i = 0, j = rightS; i < (right.length - 1); ++i, ++j) 
        {
            right[i] = A[j];
	}
        
	for(int i = 0, j = leftS; i < (left.length - 1); ++i, ++j) 
        {
            left[i] = A[j];
	}

	for(int j = leftS, a = 0, b = 0; j < rightEnd; ++j)
        {
            if(left[a] <= right[b]) 
            {
		A[j] = left[a];
		a++;
            }
            
            else 
            {
		A[j] = right[b];
		b++;
            }
	}
    }
}
