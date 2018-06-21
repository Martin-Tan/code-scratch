/******************************************************************************
 *  Compilation:  javac Shuffle.java
 *  Execution:    java Shuffle
 *  
 *  Prints a shuffled poker deck.
 * 
 *  % java Shuffle
 *
 ******************************************************************************/

import java.util.Arrays;

public class Shuffle {
	public static void main(String[] args) {
		String[] deck = getDeck();
		int n = deck.length;

		for (int i = 0; i < n ; i++) {
			String temp = deck[i];
			// Type converting operator has the same priority with *.
			// lowerbound is inclusive and upperbound exclusive.
			int randomIndex = (int)( Math.random() * n);
			deck[i] = deck[randomIndex];
			deck[randomIndex] = temp;
		}

		System.out.println(Arrays.toString(deck));
	}

	public static String[] getDeck() {
		String[] SUITS = {
		    "Clubs", "Diamonds", "Hearts", "Spades"
		}; 

		String[] RANKS = {
		    "2", "3", "4", "5", "6", "7", "8", "9", "10",
		    "Jack", "Queen", "King", "Ace"
		};

		String[] deck = new String[RANKS.length * SUITS.length];
		for (int i = 0; i < RANKS.length; i++){
			for (int j = 0; j < SUITS.length; j++) {
				// chunk + offset. 13 + 0, 13 + 1, 13 + 2, 13 + 3.
				// [2 of Clubs, 2 of Diamonds, 2 of Hearts, 2 of Spades, ... ]
		        deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}

		return deck;
	}
}
