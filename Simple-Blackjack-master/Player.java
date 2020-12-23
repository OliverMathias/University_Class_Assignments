import java.util.*;

public class Player{
  LinkedList<Card> playerHand;
  private int numCards;
  private int cardTotal;
  private boolean handHasAce;
  private int i;
  private int hitAmount;
  private Deck mainDeck;
  private int playerHandTotal;
  private int playerHandTotalafterace;

	/**
	* Default empty Player constructor
	*/
	public Player() {
		playerHand = new LinkedList<Card>();
    numCards = 0;
    cardTotal = 0;
    handHasAce = false;
	}

	/**
	* Default Player constructor
	*/
	public Player(LinkedList playerHand, int numCards, int cardTotal, boolean handHasAce) {
		super();
		this.playerHand = playerHand;
		this.numCards = numCards;
		this.cardTotal = cardTotal;
		this.handHasAce = handHasAce;
	}

	/**
	* Returns value of playerHand
	* @return
	*/
	public LinkedList getPlayerHand() {
		return playerHand;
	}

	/**
	* Sets new value of playerHand
	* @param
	*/
	public void setPlayerHand(LinkedList playerHand) {
		this.playerHand = playerHand;
	}

	/**
	* Returns value of numCards
	* @return
	*/
	public int getNumCards() {
		return numCards;
	}

	/**
	* Sets new value of numCards
	* @param
	*/
	public void setNumCards(int numCards) {
		this.numCards = numCards;
	}

	/**
	* Returns value of cardTotal
	* @return
	*/
	public int getCardTotal() {
		return cardTotal;
	}

	/**
	* Sets new value of cardTotal
	* @param
	*/
	public void setCardTotal(int cardTotal) {
		this.cardTotal = cardTotal;
	}

	/**
	* Returns value of handHasAce
	* @return
	*/
	public boolean handHasAce() {
    for (int i = 0; i < playerHand.size(); i++) {
        if(playerHand.get(i).getRank() == 1 ){
          return true;
        }
    }
    return false;
  	}
    /**
  	* Sets new value of handHasAce
  	* @param
    *@return the total of plauer's hand
  	*/
  public int handTotal(){
    playerHandTotal = 0;
    for (int i = 0; i < playerHand.size(); i++) {
      playerHandTotal += playerHand.get(i).getRank();
    }
    return playerHandTotal;
  }

  /**
	* Sets new value of handHasAce
	* @param sets new player value
	*/
  public void setPlayerHandTotal(int newPlayerHandValue){
    playerHandTotal = newPlayerHandValue;
  }
	/**
	* Sets new value of handHasAce
	* @param
	*/
	public void sethandHasAce(boolean handHasAce) {
		this.handHasAce = handHasAce;
	}

  /**
  *Randomly adds x cards from the main deck to the player.
  *@return nothing
  */
  public void hit(Deck mainDeck, int hitAmount){
    for(i=0;i<hitAmount;i++){
    playerHand.add(mainDeck.deal());
  }
  }

  /**
  *empties the player deck.
  *@return nothing
  */
  public void clearHand(){
    playerHand.clear();
    playerHandTotalafterace = 0;
  }

}
