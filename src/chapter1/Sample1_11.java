package chapter1;

public class Sample1_11 {

	public static void main(String[] args) {
		Card1 card = Card1.SPADES;

		switch (card) {
		case SPADES:
		case CLUBS:
			System.out.println("black");
			break;

		case DIAMONDS:
		case HEARTS:
			System.out.println("red");
			break;
		}

	}

}
