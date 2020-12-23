// Oliver Mathias
// 2289410
// Mathias@chapman.edu
// CPSC-230-01
// Assignment 8

import java.util.LinkedList;
import java.util.Collections;

public class Game{
// declares ints to keep track of game stats
  int totalBattles;
  int totalWars;
  int totalWarsWars;
  int playerWinner;
  int dealWinnerPlayer;
  int warWinner;
// declare a new deck (OG deck) and two players
  Deck deck;
  Player player1;
  Player player2;

  //Piles for flipped cards.
  LinkedList<Card> deck1 = new LinkedList<Card>();
  LinkedList<Card> deck2 = new LinkedList<Card>();
// sets all the counting integers to 0 at the start of every game so
// we can get accurate stats
public Game(){
  totalBattles = 0;
  totalWars = 0;
  totalWarsWars = 0;
  playerWinner = 0;
// also creates a new deck and 2 players for every game.
  deck = new Deck();
  player1 = new Player(1);
  player2 = new Player(2);
}

//again, next 3 blocks of code are accessors
// no @params but @returns the number of wars
public int getWars(){
  return totalWars;
}
// no @params but @returns the number of battles
public int getBattles(){
  return totalBattles;
}
// no @params but @returns the number of double wars
public int doubleWars(){
  return totalWarsWars;
}

// method for wars. no @params, but it @returns an integer than corresponds
// to the player number to determine who won.
private int war(){

// takes up to four or however many cards are left from each player's deck
// and adds then to the top of their "play" deck.
if (player1.playerNumberofCards()>= 4){
    deck1.addFirst(player1.flip());
    deck1.addFirst(player1.flip());
    deck1.addFirst(player1.flip());
    deck1.addFirst(player1.flip());
}
else {
  while(player1.playerNumberofCards() != 0){
    deck1.addFirst(player1.flip());
  }
}

// takes up to four or however many cards are left from each player's deck
// and adds then to the top of their "play" deck. (Does the same just for plauer2)
if (player2.playerNumberofCards()>= 4){
    deck2.addFirst(player2.flip());
    deck2.addFirst(player2.flip());
    deck2.addFirst(player2.flip());
    deck2.addFirst(player2.flip());
}
else {
  while(player2.playerNumberofCards() != 0){
    deck2.addFirst(player2.flip());
  }
}

// if the top (4th) card of player 1's deck is a higher rank than
// the same card on player 2's deck then they have won the war and
// the war 'control' winner variable is set to 1.
if (deck1.getFirst().getRank()>deck2.getFirst().getRank()){
  warWinner = 1;
}
// if the top (4th) card of player 2's deck is a higher rank than
// the same card on player 1's deck then they have won the war and
// the war 'control' winner variable is set to 2.
else if(deck1.getFirst().getRank()<deck2.getFirst().getRank()){
  warWinner = -1;
}
// if both cards are the same then there is no winner and it goes into a double war
// using the recursive method below.
else{
  warWinner = 0;
}

// in the case of a double war, the double war counter is incremented and a recrsive
// winner variable is set.
if(warWinner == 0){
//Double War!
totalWarsWars = totalWarsWars + 1;
warWinner = war();
}
// at the end of the war method it returns who the winner is based on an int.
return warWinner;
}

// this method play takes in no @params or @retuns but it sets the winner variable
// equal to the player number that has won.
public void play(){

// this makes sure that every card in the OG deck (which has been shuffled)
// is dealt out equally among the players
while(deck.getSize() != 0){
player1.collect(deck.deal());
player2.collect(deck.deal());
}
// this while loop makes sure that while no player has won yet, the game coninues.
while(!player1.hasWon() && !player2.hasWon()){

// uses the decks 1 & 2 as a place to compare cards from the player decks
// these two lines do the first battle.
deck1.addFirst(player1.flip());
deck2.addFirst(player2.flip());
// this uses the compare function and returns 1, -1 or 0 depending on which player won the battle
int dealWinnerPlayer = deck1.getFirst().compare(deck2.getFirst());
// increments the battle var
totalBattles = totalBattles +1;
// if no one wins the battle bc it's a this starts a war and sets the winner of the battle
// to the winner of the war.
if(dealWinnerPlayer == 0){
totalWars = totalWars + 1;
dealWinnerPlayer = war();
}

// this shuffles the piles so there are no repreats in card orders.
Collections.shuffle(deck1);
Collections.shuffle(deck2);

// if the battle winner is player 1, they collect the cards
if(dealWinnerPlayer > 0){
player1.pickupDeck(deck1);
player1.pickupDeck(deck2);
}

// if the battle winner is player 2, they collect the cards
else if(dealWinnerPlayer < 0){
player2.pickupDeck(deck2);
player2.pickupDeck(deck1);
}

// if player 1 wins the game, the game winner variable is set and the while loop is broken
if(player1.hasWon()){
playerWinner = 1;
}

// if player 2 wins the game, the game winner variable is set and the while loop is broken
if(player2.hasWon()){
playerWinner = 2;
}

}
}


}
