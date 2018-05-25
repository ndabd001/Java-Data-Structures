/*******************************************************
Program Number: 2
Purpose/Description: Create a list that is the intersection of List1 and List2
Author: Nicolas Dabdoub
Due date: <02/28/15>
Certification:
I hereby certify that this work is my own and none of it is the
work of any other person.
 < Nicolas Daboub> 
*******************************************************/
public class Problem2 
{
    public static <AnyType extends Comparable<? super AnyType>>

    void intersection(List<AnyType> L1, List<AnyType> L2, List<AnyType> Intersect)
    {
        ListIterator<AnyType> iterL1 = L1.listIterator();

        ListIterator<AnyType> iterL2 = L2.listIterator();

        x = L1.next();
        y = L2.next();
        
        while(L1.hasNext() && L2.hasNext())
        {
            if(x.compareTo(y) == 0)
            {
                L3.add(x)
                x = L1.next();
                y = L2.next();
            }
            elseif(x.compareTo(y) > 0)
                    {
                        y = L2.next();
                    }
                    else(a.compareTo(y))
                            {
                                x = L1.next();
                            }
        }
    }
}
