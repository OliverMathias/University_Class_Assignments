// Oliver Mathias
// 2289410
// Mathias@chapman.edu
// CPSC-230-01
// Assignment 8
import java.util.*;
public class Simulation{
  // declares all the variables so we can keep track of all the stats of the games
  int totalGames;
  int totalWars;
  int totalBattles;
  double totalDoubleWars;
  double doubleWars;
  int maxBattles;
  int minBattles;
  int maxWars;
  int minWars;
  double avgBattles;
  double avgWars;
  double avgWarsWars;

// this constructor initializes the stats variables to 0 states
public Simulation(int desiredGames){
  totalWars = 0;
  doubleWars = 0.0;
  totalDoubleWars = 0.0;
  maxBattles = 0;
  minBattles = 999;
  maxWars = 0;
  minWars = 53;
  avgBattles = 0.0;
  avgWars = 0.0;
  avgWarsWars = 0.0;

}
// this is the method that ties together all the other methods and
// classes of this project. It takes an @param of int of the number
// of desired games and has no @return but sets all stats variables.
public void simulate(int desiredGames){
  // uses a while loop to simulate n number of games
  while(desiredGames > 0){
    Game newGame = new Game();
    newGame.play();
    // increments and adds the values of play using accessor methods upon each
    // run of the while loop.
    totalGames = totalGames + 1;
    totalWars = totalWars + newGame.getWars();
    totalBattles = totalBattles + newGame.getBattles();
    totalDoubleWars = totalDoubleWars + newGame.doubleWars();
    // checks to make sure the entire simulation's battle and war numbers
    // are the maximum or minimum against each game's stats.
    // if not, it sets them to be the max/min.
    if (newGame.getBattles()>maxBattles){
      maxBattles = newGame.getBattles();
    }
    if (newGame.getBattles()<minBattles){
      minBattles = newGame.getBattles();
    }
    if (newGame.getWars()>maxWars){
      maxWars = newGame.getWars();
    }
    if (newGame.getWars()<minWars){
      minWars = newGame.getWars();
    }
    // the control variable for the while loop.
    desiredGames = desiredGames -1;
  }
}

// no @params and no @returns, this basically just sets the averages
// for the whole simulation.
public void calculate(){
  avgWars = totalWars/totalGames;
  avgBattles = totalBattles/totalGames;
  avgWarsWars = totalDoubleWars/totalGames;

}
// this method report takes in no @params, and @returns a nicely formatted summary
// of the entire simulation.
public String report(){
  return "This simulation had a total of " + totalGames +
  " games, " + totalWars+ " wars,\n" + totalBattles + " battles, and "
  + totalDoubleWars + " double wars.\n\n" + "It also had an average of " + avgWars + " wars, "
  + avgBattles + " battles," + "and \n" + avgWarsWars +" double wars per game.\n\n" +
  "Finally, this simulation had a max of " + maxBattles + " battles & "+ maxWars +
  " \nwars and a minimum of " + minWars + " wars & " + minBattles + " battles per game.";
}

// this main method 'takes in' (using command line arguments) the number of
// desired games and makes a new simulation that simulates that number of games.
public static void main(String[] args){

  int desiredGames = Integer.parseInt(args[0]);
  Simulation newSimulation = new Simulation(desiredGames);
  newSimulation.simulate(desiredGames);
  newSimulation.calculate();
  System.out.println("Simulation Report:");
  System.out.println();
  System.out.println(newSimulation.report());

}

}
