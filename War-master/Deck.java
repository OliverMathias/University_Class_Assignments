// Oliver Mathias
// 2289410
// Mathias@chapman.edu
// CPSC-230-01
// Assignment 8
  import java.util.Collections;
  import java.util.List;
  import java.util.LinkedList;
  import java.util.Queue;
  import java.util.Random;
// declaring the class
  public class Deck{
  // creating a linkedlist of cards and calling it deck, as the OG deck.
  LinkedList<Card> deck;

  // declaring a random int to be used later.
  int randomInt;
  //declaring a card of type card so we can assign a value to it later
  // in the deal method.
  Card card = new Card();

  // declaring each card individually here so we wouldn't lose
  // out on the full descriptions of each card during de-bugging.

  Card BlackTwoClubs = new Card("Clubs", 2,"none","Black");
  Card RedTwoDiamonds = new Card("Diamonds", 2,"none","Red");
  Card RedTwoHearts = new Card("Hearts", 2,"none","Red");
  Card BlackTwoSpades = new Card("Spades", 2,"none","Black");
  Card BlackThreeClubs = new Card("Clubs", 3,"none","Black");
  Card RedThreeDiamonds = new Card("Diamonds", 3,"none","Red");
  Card RedThreeHearts = new Card("Hearts", 3,"none","Red");
  Card BlackThreeSpades = new Card("Spades", 3,"none","Black");
  Card BlackFourClubs = new Card("Clubs", 4,"none","Black");
  Card RedFourDiamonds = new Card("Diamonds", 4,"none","Red");
  Card RedFourHearts = new Card("Hearts", 4,"none","Red");
  Card BlackFourSpades = new Card("Spades", 4,"none","Black");
  Card BlackFiveClubs = new Card("Clubs", 5,"none","Black");
  Card RedFiveDiamonds = new Card("Diamonds",5,"none","Red");
  Card RedFiveHearts = new Card("Hearts", 5,"none","Red");
  Card BlackFiveSpades = new Card("Spades", 5,"none","Black");
  Card BlackSixClubs = new Card("Clubs", 6,"none","Black");
  Card RedSixDiamonds = new Card("Diamonds",6,"none","Red");
  Card RedSixHearts = new Card("Hearts", 6,"none","Red");
  Card BlackSixSpades = new Card("Spades", 6,"none","Black");
  Card BlackSevenClubs = new Card("Clubs", 7,"none","Black");
  Card RedSevenDiamonds = new Card("Diamonds",7,"none","Red");
  Card RedSevenHearts = new Card("Hearts", 7,"none","Red");
  Card BlackSevenSpades = new Card("Spades", 7,"none","Black");
  Card BlackEightClubs = new Card("Clubs", 8,"none","Black");
  Card RedEightDiamonds = new Card("Diamonds",8,"none","Red");
  Card RedEightHearts = new Card("Hearts", 8,"none","Red");
  Card BlackEightSpades = new Card("Spades", 8,"none","Black");
  Card BlackNineClubs = new Card("Clubs", 9,"none","Black");
  Card RedNineDiamonds = new Card("Diamonds",9,"none","Red");
  Card RedNineHearts = new Card("Hearts", 9,"none","Red");
  Card BlackNineSpades = new Card("Spades", 9,"none","Black");
  Card BlackTenlubs = new Card("Clubs", 10,"none","Black");
  Card RedTenDiamonds = new Card("Diamonds",10,"none","Red");
  Card RedTenHearts = new Card("Hearts", 10,"none","Red");
  Card BlackTenSpades = new Card("Spades", 10,"none","Black");
  Card BlackJackClubs = new Card("Clubs",11, "Jack","Black");
  Card RedJackDiamonds = new Card("Diamonds",11, "Jack","Red");
  Card RedJackHearts = new Card("Hearts",11, "Jack","Red");
  Card BlackJackSpades = new Card("Spades",11, "Jack","Black");
  Card BlackQueenClubs = new Card("Clubs",12, "Queen","Black");
  Card RedQueenDiamonds = new Card("Diamonds",12, "Queen","Red");
  Card RedQueenHearts = new Card("Hearts",12, "Queen","Red");
  Card BlackQueenSpades = new Card("Spades",12, "Queen","Black");
  Card RedKingHearts = new Card("Hearts",13,"King","Red");
  Card BlackKingClubs = new Card("Clubs",13,"King","Black");
  Card RedKingDiamonds = new Card("Diamonds",13,"King","Red");
  Card BlackKingSpades = new Card("Spades",13,"King","Black");
  Card RedAceHearts = new Card("Hearts",14,"Ace","Red");
  Card BlackAceClubs = new Card("Clubs",14,"Ace","Black");
  Card RedAceDiamonds = new Card("Diamonds",14,"Ace","Red");
  Card BlackAceSpades = new Card("Spades",14,"Ace","Black");

  public Deck(){
  // instantiating the deck as a linkedlist of cards.
  deck = new LinkedList<Card>();
  // adding every card from above to the deck.
  deck.addLast(BlackTwoClubs);
  deck.addLast(RedTwoDiamonds);
  deck.addLast(RedTwoHearts);
  deck.addLast(BlackTwoSpades);
  deck.addLast(BlackThreeClubs);
  deck.addLast(RedThreeDiamonds);
  deck.addLast(RedThreeHearts);
  deck.addLast(BlackThreeSpades);
  deck.addLast(BlackFourClubs);
  deck.addLast(RedFourDiamonds);
  deck.addLast(RedFourHearts);
  deck.addLast(BlackFourSpades);
  deck.addLast(BlackFiveClubs);
  deck.addLast(RedFiveDiamonds);
  deck.addLast(RedFiveHearts);
  deck.addLast(BlackFiveSpades);
  deck.addLast(BlackSixClubs);
  deck.addLast(RedSixDiamonds);
  deck.addLast(RedSixHearts);
  deck.addLast(BlackSixSpades);
  deck.addLast(BlackSevenClubs);
  deck.addLast(RedSevenDiamonds);
  deck.addLast(RedSevenHearts);
  deck.addLast(BlackSevenSpades);
  deck.addLast(BlackEightClubs);
  deck.addLast(RedEightDiamonds);
  deck.addLast(RedEightHearts);
  deck.addLast(BlackEightSpades);
  deck.addLast(BlackNineClubs);
  deck.addLast(RedNineDiamonds);
  deck.addLast(RedNineHearts);
  deck.addLast(BlackNineSpades);
  deck.addLast(BlackTenlubs);
  deck.addLast(RedTenDiamonds);
  deck.addLast(RedTenHearts);
  deck.addLast(BlackTenSpades);
  deck.addLast(BlackJackClubs);
  deck.addLast(RedJackDiamonds);
  deck.addLast(RedJackHearts);
  deck.addLast(BlackJackSpades);
  deck.addLast(BlackQueenClubs);
  deck.addLast(RedQueenDiamonds);
  deck.addLast(RedQueenHearts);
  deck.addLast(BlackQueenSpades);
  deck.addLast(RedKingHearts);
  deck.addLast(BlackKingClubs);
  deck.addLast(RedKingDiamonds);
  deck.addLast(BlackKingSpades);
  deck.addLast(RedAceHearts);
  deck.addLast(BlackAceClubs);
  deck.addLast(RedAceDiamonds);
  deck.addLast(BlackAceSpades);

  // this shuffles the deck immediatlely upon creation
  // so there will be a lower risk of infinite loops.
  Collections.shuffle(deck);

  }

  // this function has no @params and @returns a random card
  // from the original deck. It will also be used later on to
  // create the individual player decks.
  public Card deal(){
    Random r = new Random();
    randomInt = (r.nextInt(((deck.size()-1) - 0) + 1) + 0);
    card = (Card)deck.get(randomInt);
    deck.remove(randomInt);
    return card;
  }

  // no @params, no @returns it just shuffles the main deck
  public void shuffle(){
    Collections.shuffle(deck);
  }

  // no @params, returns the dize of the main deck.
  public int getSize(){
  return deck.size();
  }


  }
