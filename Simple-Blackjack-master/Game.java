import java.util.Scanner;
public class Game {
  private static boolean playerWantstoPlay;
  private static int newTotal;
  private static int choice;
  private static boolean noWinner;
  private static int roundTotal;

  public Game(){

  }

  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    // creates a new deck and 2 new plaers
    // with empty hands
    playerWantstoPlay = true;
    noWinner = true;

    // Deck newDeck = new Deck();
    // Player computer = new Player();
    // Player human = new Player();

    while (playerWantstoPlay == true){

      Deck newDeck = new Deck();
      Player computer = new Player();
      Player human = new Player();
      System.out.println();
      System.out.println("New game has begun");

      human.hit(newDeck,2);
      computer.hit(newDeck,2);

      roundTotal = human.handTotal();

      if(human.handHasAce()){
        if (human.handTotal() +10 > 21) {
          ;
        }
        else if (human.handTotal()+10<=21){
          roundTotal = 10 + human.handTotal();
        }
      }

      System.out.println("The Rank of your hand is: " + roundTotal);

      System.out.println("Would you like to hit (1) or stay (0)?");
      choice = kb.nextInt();
      if (choice == 1) {
        human.hit(newDeck,1);
        computer.hit(newDeck,1);
        roundTotal = human.handTotal();
      }
      else if(choice == 0){
        ;
      }

      System.out.println("The Rank of your hand is: " + roundTotal);

      if (roundTotal > computer.handTotal() && roundTotal<=21 ) {
        System.out.println("computer only had: "+ computer.handTotal());
        System.out.print("yay! you won!!");
      }
      else if (roundTotal < computer.handTotal() && computer.handTotal() <= 21) {
        System.out.print("nooo! Computer won!!");
      }

      else if(roundTotal>21){
        System.out.println("over 21, you lose");
      }
      else if(computer.handTotal()>21){
        System.out.println("computer went over 21, you Win!!");
      }

      System.out.println();
      System.out.println("would you like to play another round? (yes = 1, no = 0)");
      choice = kb.nextInt();
      if(choice == 1){
        System.out.println("ok here we go");
        human.clearHand();
        computer.clearHand();
        playerWantstoPlay = true;
        noWinner = true;
      }
      if(choice == 0){
        System.out.println("ok buhbye");
        playerWantstoPlay = false;
      }
    }
  }
}
