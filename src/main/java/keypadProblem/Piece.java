package keypadProblem;

import java.util.HashMap;

/** Abstract base class for chess pieces. 
 * 	Provides abstract methods for filling dynamic programming array and returning amount of phone numbers based on starting number/length.
 * 	Default phone number length is 10.
 * @author Alex
 *
 */

public abstract class Piece {

	protected HashMap<Integer, Integer[]> ValidMoves = new HashMap<Integer, Integer[]>();
	protected int[][] Results = new int[10][10];
	protected final int DEFAULT_PHONENUMBER_LENGTH = 10;
	
	/** Create piece, filling ValidMoves HashMap.
	 * 
	 */	
	public Piece() {}
	
	/** Use dynamic programming algorithm to populate Results array.
	 * 
	 */	
	public abstract void generate();
	
	/** Method to return total number of combinations of phone numbers.
	 * 
	 * @param start The starting digit on the keypad.
	 * @param length The length of the phone number.
	 * @return total number of combinations of phone numbers
	 */	
	public abstract int search(int length, int start);
	
	/** Method to return total number of combinations of phone numbers, using DEFAULT_PHONENUMBER_LENGTH.
	 * 
	 * @param start The starting digit on the keypad.
	 * @return total number of combinations of phone numbers
	 */
	public abstract int search(int start);
	
}
