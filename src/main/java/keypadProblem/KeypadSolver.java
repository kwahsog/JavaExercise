package keypadProblem;

/** Class to use Pieces classes along with user input to return results to keypad problem.
 * Keypad problem: Generate number of legal phone numbers, beginning with the StartingDigit given, that can be generated by the chess piece.
 * Default length: 10.
 * @author Alex
 *
 */
public class KeypadSolver {

	/** Static method to return number of possible phone numbers generated by a given piece.
	 * 
	 * @param PieceName Chess piece name (class Piece).
	 * @param StartingDigit The starting digit on the keypad, between 0 and 9.
	 * @return int total number of combinations of phone numbers.
	 */
	public static int Solution(String PieceName, int StartingDigit) {
		PieceName = PieceName.toLowerCase();
		
		if(StartingDigit < 0 || StartingDigit > 9){
			return 0;
		}
		
		if (PieceName.equals("king")){
			King KingGen = new King();
			KingGen.generate();
			return(KingGen.search(StartingDigit));
		}
		if (PieceName.equals("queen")){
			Queen QueenGen = new Queen();
			QueenGen.generate();
			return(QueenGen.search(StartingDigit));			
		}
		if (PieceName.equals("bishop")){
			Bishop BishopGen = new Bishop();
			BishopGen.generate();
			return(BishopGen.search(StartingDigit));	
		}
		if (PieceName.equals("knight")){
			Knight KnightGen = new Knight();
			KnightGen.generate();
			return(KnightGen.search(StartingDigit));	
		}
		if (PieceName.equals("rook")){
			Rook RookGen = new Rook();
			RookGen.generate();
			return(RookGen.search(StartingDigit));	
		}
		if (PieceName.equals("pawn")){
			//Pawn PawnGen = new Pawn();
			//PawnGen.generate();
			//return(PawnGen.search(StartingDigit));
			return 0;
		}
		return 0;
	}
	
	/** Static method to return number of possible phone numbers generated by a given piece, allowing length of phone number to be specified.
	 * 
	 * @param PieceName Chess piece name (class Piece).
	 * @param StartingDigit The starting digit on the keypad, between 0 and 9.
	 * @param PhoneNumberLength The length of the phone number, between 1 and 10;
	 * @return int total number of combinations of phone numbers.
	 */
	
	public static int Solution(String PieceName, int StartingDigit, int PhoneNumberLength) {
		PieceName = PieceName.toLowerCase();
		
		if(StartingDigit < 0 || StartingDigit > 9){
			return 0;
		}
		if(PhoneNumberLength == 0){
			return 0;
		}
		if(PhoneNumberLength > 10){
			return 0;
		}
		
		if (PieceName.equals("king")){
			King KingGen = new King();
			KingGen.generate();
			return(KingGen.search(PhoneNumberLength,StartingDigit));
		}
		if (PieceName.equals("queen")){
			Queen QueenGen = new Queen();
			QueenGen.generate();
			return(QueenGen.search(PhoneNumberLength,StartingDigit));			
		}
		if (PieceName.equals("bishop")){
			Bishop BishopGen = new Bishop();
			BishopGen.generate();
			return(BishopGen.search(PhoneNumberLength,StartingDigit));	
		}
		if (PieceName.equals("knight")){
			Knight KnightGen = new Knight();
			KnightGen.generate();
			return(KnightGen.search(PhoneNumberLength,StartingDigit));	
		}
		if (PieceName.equals("rook")){
			Rook RookGen = new Rook();
			RookGen.generate();
			return(RookGen.search(PhoneNumberLength,StartingDigit));	
		}
		if (PieceName.equals("pawn")){
			//Pawn PawnGen = new Pawn();
			//PawnGen.generate();
			//return(PawnGen.search(PhoneNumberLength,StartingDigit));
			return 0;
		}
		return 0;
	}
	
	

}
