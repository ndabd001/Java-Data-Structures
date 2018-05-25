/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nicolas
 */
public class Problem2 
{
    int minAvgPiece(int[]A)
    {
        int minAvg = Integer.MAX_VALUE;
        int index = 0;
        
        for(int i=0; i<A.length-2; i++)
        {
            int avg = (A[i] + A[i+1]) / (2);
            
            if(minAvg > avg)
            {
                minAvg = avg;
                
                index = i;
            }       
        }
        
        return index;
    }
    
    public static void main(String[] args)
     {
        Problem2 n = new Problem2 ();
            
        int[] N = {10, 5, 23, 50, 6, 3, 19, 93};
        
        int [] A = {2, 1, 0, 2};
        
        int [] B = {4, 15, 22, 40, 12};
        
        int [] C = {2, 98, 123, 56, 23, 54};
        
        System.out.println(n.minAvgPiece(N));
        System.out.println(n.minAvgPiece(A));
        System.out.println(n.minAvgPiece(B));
        System.out.println(n.minAvgPiece(C));
        
     }
    
}
