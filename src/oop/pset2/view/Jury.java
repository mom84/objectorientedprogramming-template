package oop.pset2.view;
import oop.pset2.model.Movement;



public class Jury {

    public void sayResult(Movement player1Move, Movement player2Move) {



        if (player1Move.getMoveName().equalsIgnoreCase("Rock") && player2Move.getMoveName().equalsIgnoreCase("Scissors")) {
            System.out.println("Player1 Win\nplayer1 Move Rock---ComputerPlayer Move Scissors");

        }
        else if (player1Move.getMoveName().equalsIgnoreCase("Rock") && player2Move.getMoveName().equalsIgnoreCase("Paper")) {
            System.out.println("ComputerPlayer Win\nplayer1 Move Rock---ComputerPlayer Move paper");

        }

        else if (player1Move.getMoveName().equalsIgnoreCase("Rock") && player2Move.getMoveName().equalsIgnoreCase("Rock")) {
            System.out.println("No Body Win\nplayer1 Move Rock---ComputerPlayer Move Rock");

        }

       else if (player1Move.getMoveName().equalsIgnoreCase("Paper") && player2Move.getMoveName().equalsIgnoreCase("Scissors")) {
            System.out.println("ComputerPlayer Win\nplayer1 Move paper----ComputerPlayer Move Scissors");

        }

        else if (player1Move.getMoveName().equalsIgnoreCase("Paper") && player2Move.getMoveName().equalsIgnoreCase("Rock")) {
            System.out.println("Player1 Win\nplayer1 Move Paper---ComputerPlayer Move Rock");

        }

       else if (player1Move.getMoveName().equalsIgnoreCase("Paper") && player2Move.getMoveName().equalsIgnoreCase("Paper")) {
            System.out.println("No Body Win\nplayer1 Move Paper---ComputerPlayer Move Paper");

        }

       else if (player1Move.getMoveName().equalsIgnoreCase("Scissors") && player2Move.getMoveName().equalsIgnoreCase("Scissors")) {
            System.out.println("No Body Win\nplayer1 Move Scissors---ComputerPlayer Move Scissors");

        }

       else if (player1Move.getMoveName().equalsIgnoreCase("Scissors") && player2Move.getMoveName().equalsIgnoreCase("Rock")) {
            System.out.println("ComputerPlayer Win\nplayer1 Move Scissors----ComputerPlayer Move Rock");

        }

        else  {
            System.out.println("Player1 Win\nplayer1 Move Scissors----ComputerPlayer Move Paper");

        }


    }




}

