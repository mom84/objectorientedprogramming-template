package oop.pset2.controller;
import oop.pset2.model.Movement;
import oop.pset2.model.Paper;
import oop.pset2.model.Rock;
import oop.pset2.model.Scissors;

import java.util.Random;

public class ComputerPlayer implements Player {

    private Random rand;

    public ComputerPlayer() {

        super();
        rand = new Random();
    }



    public Movement getMove() {
        int ComputerRandMove = 1 + rand.nextInt(3);
        Movement move1 = new Paper();
        Movement move2 = new Scissors();
        Movement move3 = new Rock();


        if(ComputerRandMove == 1){
            return move3;
        }
         else if(ComputerRandMove == 2){
            return move1;
        }
        else{
            return move2;
        }

    }



}
