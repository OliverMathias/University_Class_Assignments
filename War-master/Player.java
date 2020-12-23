// Oliver Mathias
// 2289410
// Mathias@chapman.edu
// CPSC-230-01
// Assignment 8
import java.util.LinkedList;
import java.util.*;
public class Player{
// declares player variables and a player deck to be used later.
int m_player;
LinkedList<Card> playerDeck;

// player class @param playernumber @ return nothing.
// this creates a player with a number x, and gives them an empty deck
public Player(int playerNum){
  m_player = playerNum;
  playerDeck = new LinkedList<Card>();
}

// this method flip has 0 @params and @returns the card from the top of the player's deck
// after removing it.
public Card flip(){
  // premoves and returns the top cards from the deck
  return playerDeck.poll();
}

// this method has a @param of a card, and no @return.
// it simply adds a card to the bottom a player's deck.
public void collect(Card card){
  playerDeck.addLast(card);
}
// no @params but @returns the size of the players deck
public int playerNumberofCards(){
  return playerDeck.size();
}

// again no @params but @returns a boolean stating if the specific player holds
// and 52 cards and thus has won.
public boolean hasWon(){
switch(playerDeck.size()){
  case 52:
  return true;

  default:
  return false;
}
}
// uses a while loop to externalize the method of picking up the WHOLE deck.
// @param is a deck, and no @return but it uses another method 'collect' as helper
// method and it adds the deck to the player's deck
public void pickupDeck(LinkedList<Card> deck){
while(deck.size() != 0){
  collect(deck.removeFirst());
}
}

}
