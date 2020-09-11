package Lab7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Stream;

public class PlayerQueue {
    //fields
    private String name;
    Queue<Integer> postTray = new LinkedList<>();

    // constructor
    public PlayerQueue(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

    //add a card to post tray
    public void addCardsToPostTray(Integer card) {
        if (card > 0 && card < 10) {
            this.postTray.offer(card);
        } else if (card == 0) {
            this.postTray.offer(10);
        } else {
            System.out.println("Something wrong.");
            return;
        }
    }

    // add two card and re-build post trays
    public void rebuildPostTray(Integer cardBigger, Integer cardSmaller) {
        this.postTray.offer(cardBigger);
        this.postTray.offer(cardSmaller);
    }

    // show cards from post tray
    public void showCards() {
        if (!this.postTray.isEmpty()) {
            System.out.print("Cards of player " + this.name + " (top to bottom): ");
            Stream playerStream = this.postTray.stream();
            playerStream.forEach((element) ->
            {
                if ((Integer) element != 10) {
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
