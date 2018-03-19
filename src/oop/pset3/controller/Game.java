package oop.pset3.controller;
import oop.pset3.model.*;
import oop.pset3.view.Jury;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    PlayerHotel playerHotel = new PlayerHotel();

        public void play() {
            char quit = ' ';
            while (quit != 'N') {
                Moves moves = new Moves();
//              List<Move> moves1 = new ArrayList<>();
//              moves1.add(new Paper());
//              moves1.add(new Rock());
//              moves1.add(new Scissors());
//              moves1.add(new Lizard());
//              moves1.add(new Spock());
                Player player = playerHotel.getOnePlayer();
                Player computer = playerHotel.getOneComputer();
                Move move1 = player.chooseOneMove(moves);
                Move move2 = computer.chooseOneMove(moves);
                Jury jury = new Jury();
                jury.sayResult(move1, move2);
                Scanner scan = new Scanner(System.in);
                System.out.println("Do you want to play again? (y/n): y" );
                String s = scan.nextLine().toUpperCase();
                if (s.length()==0)
                    quit = 'N';
                else
                    quit = s.charAt(0);
            }
        }
}
