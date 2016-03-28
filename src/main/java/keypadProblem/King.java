package keypadProblem;

/** King class, ValidMoves given by chess King on keypad.
 *  Provides methods for filling dynamic programming array and returning amount of phone numbers based on starting number/length.
 * @author Alex
 *
 */
public class King extends Piece {
	
	/** Create King piece, filling HashMap with valid moves.
	 * 
	 */
	public King() {
		ValidMoves.put(0, new Integer[] {0,7,8,9});
		ValidMoves.put(1, new Integer[] {1,2,4,5});
		ValidMoves.put(2, new Integer[] {2,1,3,4,5,6});
		ValidMoves.put(3, new Integer[] {3,2,5,6});
		ValidMoves.put(4, new Integer[] {4,1,2,5,7,8});
		ValidMoves.put(5, new Integer[] {5,1,2,3,4,6,7,8,9});
		ValidMoves.put(6, new Integer[] {6,2,3,5,8,9});
		ValidMoves.put(7, new Integer[] {7,4,5,8,0});
		ValidMoves.put(8, new Integer[] {8,4,5,6,7,9,0});
		ValidMoves.put(9, new Integer[] {9,5,6,8,0});
	}
	
	/** Use dynamic programming algorithm to populate Results array.
	 * 
	 */
	@Override
	public void generate() {
		for(int p = 0; p <10; p++){
			Results[0][p] = 1;
		}		
		for(int digits = 1; digits < 10; digits++){
			for (int f = 0; f < 10; f++){
				for(int i = 0; i < ValidMoves.get(f).length; i++){					
					Results[digits][f] += Results[digits-1][ValidMoves.get(f)[i]];
				}						
			}
		}
	}

	/** Method to return total number of combinations of phone numbers.
	 * 
	 * @param length The length of the phone number.
	 * @param start The starting digit on the keypad.
	 * @return total number of combinations of phone numbers
	 */

	@Override
	public int search(int length, int start) {
		return Results[length-1][start];		
	}

	/** Method to return total number of combinations of phone numbers, using DEFAULT_PHONENUMBER_LENGTH.
	 * 
	 * @param start The starting digit on the keypad.
	 * @return total number of combinations of phone numbers
	 */
	
	@Override
	public int search(int start) {
		return Results[DEFAULT_PHONENUMBER_LENGTH-1][start];		
	}

}
