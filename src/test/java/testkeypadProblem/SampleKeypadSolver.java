package testkeypadProblem;

import keypadProblem.KeypadSolver;

/** Example class showing usage of KeypadSolver.
 * 
 * @author Alex
 *
 */

public class SampleKeypadSolver {

	public static void main(String[] args){
		
		System.out.println("Keypad solution for King starting at 5: "+KeypadSolver.Solution("King",5));
		System.out.println("Keypad solution for Queen starting at 5: "+KeypadSolver.Solution("Queen",5));
		System.out.println("Keypad solution for Bishop starting at 5: "+KeypadSolver.Solution("Bishop",5));
		System.out.println("Keypad solution for Knight starting at 5: "+KeypadSolver.Solution("Knight",5));
		System.out.println("Keypad solution for Rook starting at 5: "+KeypadSolver.Solution("Rook",5));
		System.out.println("Keypad solution for Knight starting at 1: "+KeypadSolver.Solution("Knight",1));
		
	}
	

}
