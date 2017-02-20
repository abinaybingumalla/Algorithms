/* Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
For example, for this problem, following are some good questions to ask :
Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

*/

public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
	  java.util.Collections.reverse(A);
	  int carry = 1;
	  ArrayList<Integer> B = new ArrayList<Integer>();
	  for(int i = 0 ; i <A.size() ; i++ ){
	        int val = A.get(i) + carry; 
    	    carry = val / 10 ;
    	    B.add(i, val % 10 );
	        
	    } 
	        if (carry !=0) {
                B.add(carry%10);
            }
	    while(B.get(B.size()-1) == 0 && B.size() >1 ){
	        B.remove(B.size()-1);
	    }
	  
	  java.util.Collections.reverse(B);
	  return B;     


	}
}


