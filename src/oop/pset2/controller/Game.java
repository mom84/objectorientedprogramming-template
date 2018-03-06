package oop.pset2.controller;
import oop.pset2.model.Movement;
import oop.pset2.view.Jury;

import java.util.Scanner;


public class Game {

    private Movement player1Move;
    private Movement player2Move;

    public void play() {

        char quit = ' ';
        while (quit != 'N')
        {
            Player player1 = new HumanPlayer();
            Player player2 = new ComputerPlayer();
            player1Move = player1.getMove();
            player2Move = player2.getMove();
            Jury jury = new Jury();
            jury.sayResult(player1Move, player2Move);
            Scanner scan = new Scanner(System.in);
            System.out.println("Do you want to play again? (y/n): y" );
            String s = scan.nextLine().toUpperCase();
            if (s.length()==0)
                quit = 'N';
            else
                quit = s.charAt(0);

        }

        System.out.println("Goodbye\nThank you for playing");

    }


}
