/*******************************************************

Program Number: A3_3

Purpose/Description: <Create a search method>

Author: <Nicolas Dabdoub>

Due date: <03/30/15>

Certification:

I hereby certify that this work is my own and none of it is the work of any other 

person.

 < Nicolas Dabdoub >

*******************************************************/
public class Problem3 
{
    private static int[] A;
    
    public static int findN (int n, int[] A)
    {
        int FV = A[0];
        int MV = A[A.length/2];
        int LV = A[A.length-1];
        int FP = 0;
        int MP = (A.length-1)/2;
        int LP = A.length-1;
        
        do
        {
           if(n<FV)
           {
               if(n<LV)
               {
                   if(MV>LV)
                   {
                       FP=MP;
                       FV=MV;
                       MP=(LP+MP)/2;
                       MV=A[MP];
                   }
                   else
                   {
                       if(n>MV)
                       {
                           FP=MP;
                           FV=MV;
                           MP=(LP+MP)/2;
                           MV=A[MP];
                       }
                       else
                       {
                           LP=MP;
                           LV=MV;
                           MP=(LP+FP)/2;
                           MV=A[MP];
                       }
                   }
               }
               else
               {
                   if(n == LV)
                   {
                       return LP;
                   }
                   else
                       return -1;
               }
           }
           else if(MV>FV)
           {
               LP=MP;
               LV=MV;
               MP=(LP+FP)/2;
               MV=A[MP];
               
               if(n>MV)
               {
                   FP=MP;
                   FV=MV;
                   MP=(LP+FP)/2;
                   MV=A[MP];
               }
               else
               {
                   LP=MP;
                   LV=MV;
                   MP=(LP+FP)/2;
                   MV=A[MP];
               }
           }
           else
           {
               LP=MP;
               LV=MV;
               MP=(LP+FP)/2;
               MV=A[MP];
               
               if(n>MV)
               {
                   FP=MP;
                   FV=MV;
                   MP=(LP+FP)/2;
                   MV=A[MP];
                   
               }
               else
               {
                   LP=MP;
                   LV=MV;
                   MP=(LP+FP)/2;
                   MV=A[MP];
               }
           }
        } while(MV != n || (MV != n && LP-FP == 3));
        
        return MP;
    }
    public static void main(String args[])
    {
        int[] A = new int[]{3,4,5,6,7,8,1,2};
        
        System.out.println(findN(2, A));
    }
}
