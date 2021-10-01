package gusto_dsa;

import java.util.Stack;

public class StringStack {
  public static void main(String[] args) {
    Stack<String> cards = new Stack<>();

    cards.push("Jack");
    cards.push("Queen");
    cards.push("King");
    cards.push("Ace");

    System.out.println("Cards: " + cards);

    String topCard = cards.peek();
    System.out.println("\nTop card: " + topCard);

    String removedCard = cards.pop();
    System.out.println("\nPopped/Removed card: " + removedCard);

    System.out.println("\nRemaining cards: " + cards);
  }
}
