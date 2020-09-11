package Lab7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.stream.Stream;

public class PlayerDequeue {
    //fields
    private String name;
    Deque<Integer> postTray = new ArrayDeque<>();

    // constructor
    public PlayerDequeue(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    //add a card to post tray
    public void addCardsToPostTray(Integer card) {
        if (card > 0 && card < 10) {
            this.postTray.addLast(card);
        } else if (card == 0) {
            this.postTray.addLast(10);
        } else {
            System.out.println("Something wrong.");
            return;
        }
    }

    // add two card and re-build post trays
    public void rebuildPostTray(Integer cardBigger, Integer cardSmaller) {
        Deque<Integer> postTrayTemp = new ArrayDeque<>();
        this.postTray.addFirst(cardBigger);
        this.postTray.addFirst(cardSmaller);
    }

    // show cards from post tray
    public void showCards() {
        if (!this.postTray.isEmpty()) {
            System.out.print("Cards of player " + this.name + " (bottom to top): ");
            Stream playerStream = this.postTray.stream();
            playerStream.forEach((element) ->
            {
                if((Integer)element != 10){
                    System.out.print(" " + element);
                } else {
                    System.out.print(" " + 0);
                }
            });
        } else {
            System.out.print("Cards of player " + this.name + " empty.");
        }
    }
}
