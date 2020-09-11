package Lab7;

import java.util.Scanner;

public class GameDrunkardDequeue {
    public static int count = 0;

    public static void main(String args[]) {
        PlayerDequeue firstPlayer = inputPlayer1();
        PlayerDequeue secondPlayer = inputPlayer2();
        gameStart(firstPlayer, secondPlayer);
    }

    //input data for player1
    public static PlayerDequeue inputPlayer1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of first player: ");
        PlayerDequeue firstPlayer = new PlayerDequeue(sc.nextLine());
        System.out.print("Cards of first player (bottom to top, 5 cards): ");
        for (int i = 0; i < 5; i++) {
            firstPlayer.addCardsToPostTray(sc.nextInt());
        }
        return firstPlayer;
    }

    //input data for player2
    public static PlayerDequeue inputPlayer2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of second player: ");
        PlayerDequeue secondPlayer = new PlayerDequeue(sc.nextLine());
        System.out.print("Cards of second player (bottom to top, 5 cards): ");
        for (int i = 0; i < 5; i++) {
            secondPlayer.addCardsToPostTray(sc.nextInt());
        }
        return secondPlayer;
    }

    //game start
    public static void gameStart(PlayerDequeue firstPlayer, PlayerDequeue secondPlayer) {
        while (!firstPlayer.postTray.isEmpty() && !secondPlayer.postTray.isEmpty()) {
            //check cards
            Integer card1 = firstPlayer.postTray.removeLast();
            Integer card2 = secondPlayer.postTray.removeLast();
            if (card1 > card2) {
                firstPlayer.rebuildPostTray(card1, card2);
            } else if (card1 < card2) {
                secondPlayer.rebuildPostTray(card2, card1);
            } else {
                System.out.println("Something wrong!");
                return;
            }

            // show results after check
            System.out.println("\n--------------Turn " + ++count + "---------------");
            firstPlayer.showCards();
            System.out.println();
            secondPlayer.showCards();
        }

        // check winner
        System.out.print("\n-----------------RESULT----------------");
        if (count > 106) {
            System.out.println("BOTBA");
        }

        if (secondPlayer.postTray.isEmpty()) {
            System.out.println("\nFirst player " + firstPlayer.getName() + " win!");
            firstPlayer.showCards();
        }

        if (firstPlayer.postTray.isEmpty()) {
            System.out.println("\nSecond player " + secondPlayer.getName() + " win!");
            secondPlayer.showCards();
        }
    }
}
