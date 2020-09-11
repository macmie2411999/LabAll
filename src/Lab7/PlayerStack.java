package Lab7;

import java.util.Stack;
import java.util.stream.Stream;

public class PlayerStack {
    //fields
    private String name;
    Stack<Integer> postTray = new Stack<Integer>();

    // constructor
    public PlayerStack(String name) {
        this.name = name;
    }

    public PlayerStack(){}

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //add a card to post tray
    public void addCardsToPostTray(Integer card) {
        if (card > 0 && card < 10) {
            this.postTray.push(card);
        } else if (card == 0) {
            this.postTray.push(10);
        } else {
            System.out.println("Something wrong.");
            return;
        }
    }

    // add two card and re-build post trays
    public void rebuildPostTray(Integer cardBigger, Integer cardSmaller) {
        Stack<Integer> postTrayTemp = new Stack<Integer>();

        while (!this.postTray.isEmpty()) {
            postTrayTemp.push(postTray.pop());
        }

        this.postTray.push(cardSmaller);
        this.postTray.push(cardBigger);

        while (!postTrayTemp.isEmpty()) {
            this.postTray.push(postTrayTemp.pop());
        }
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
