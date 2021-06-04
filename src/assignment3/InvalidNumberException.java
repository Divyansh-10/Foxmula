/* 
 * Program to design custom Exception.
 */

package assignment3;

public class InvalidNumberException extends Exception {
	
	

	public InvalidNumberException(String s)      //String s to display message through getMessage() method
    {
        super(s);      
    }

}
