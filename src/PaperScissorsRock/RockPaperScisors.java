package PaperScissorsRock;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScisors {

    int userScore;
    int compScore;


    public static Options getOptionFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one of the following options:");
        System.out.printf("%s -P, %s -S, %s -R, %s -Q\n", Options.Paper, Options.Scissors, Options.Rock, Options.Quit);

        Options userChoice;

        try {
            userChoice = Options.getOption(sc.next());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getOptionFromUser();
        }

        //System.out.println("Your choice is: "+ userChoice);
        return userChoice;
    }

    public static Options randomComputerChoice() {
        Random rd = new Random();
        int number = randomNumber(1, 3);

        Options computerChoice = Options.values()[number];

        return computerChoice;
    }

    public static int randomNumber(int min, int max) {
        Random rd = new Random();
        int range = (max - min) + 1;
        int number = rd.nextInt(range) + min;

        return number;
    }

    public boolean fight() throws Exception {

        Options userOption = getOptionFromUser();
        Options compOption = randomComputerChoice();
        Options paper = Options.Paper;
        Options scissors = Options.Scissors;
        Options rock = Options.Rock;
        Options quit = Options.Quit;
        FightResult fightResult;

        if (userOption == paper && compOption == scissors || userOption == rock && compOption == paper || userOption == scissors && compOption == rock) {
            fightResult = FightResult.ComputerWins;
        } else if (compOption == paper && userOption == scissors || compOption == rock && userOption == paper || compOption == scissors && userOption == rock) {
            fightResult = FightResult.UserWins;
        } else if (compOption == userOption) {
            fightResult = FightResult.Tie;
        } else if (userOption == quit) {
            fightResult = FightResult.Quit;
        } else {
            throw new Exception("This is not possible to happen");
        }

        switch (fightResult) {

            case ComputerWins:
                System.out.println("Computer won this time!");
                compScore += 1;
                break;
            case UserWins:
                System.out.println("You win this time!");
                userScore += 1;
                break;
            case Tie:
                System.out.println("You Tied.");
                break;
            case Quit:
                System.out.println("End of game.");
                return false;
            default:
                System.out.println("This should NOT happened in swich case!");
        }
        return true;
    }

/*        switch(true){
            case (userOption == paper && compOption == scissors):
            case userOption == rock && compOption == paper:
            case userOption == scissors && compOption == rock:
                compScore+=1;
                break;
            case compOption == paper && userOption == scissors:
            case compOption == rock && userOption == paper:
            case compOption == scissors && userOption == rock:
                userScore+=1;
                break;
            case compOption == userOption:
                break;
            case userOption == quit:
                return false;
            default:
                throw new Exception("This is not possible to happen");
        }
        return true;*/


    public void runFightsUntilQuit() throws Exception {
        while (fight()) {
            continue;
        }
        summary();
    }

    public void summary() {
        if (userScore > compScore) {
            System.out.println("You won with score: " + userScore + " vs. computer score: " + compScore);
        } else if (userScore == compScore) {
            System.out.println("That is a TIE. Score is " + userScore);
        } else {
            System.out.println("You lose! your score: " + userScore + " vs. computer score: " + compScore);
        }
    }


    public static void main(String[] args) throws Exception {
        RockPaperScisors rps = new RockPaperScisors();
        rps.runFightsUntilQuit();

    }

}
