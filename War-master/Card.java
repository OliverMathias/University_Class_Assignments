// Oliver Mathias
// 2289410
// Mathias@chapman.edu
// CPSC-230-01
// Assignment 8
public class Card {
// declaring the variables to be used later on/
private String m_suit;
private int m_rank;
private String m_face;
private String m_color;
private Card compareCard;

// no @params or @returns to be found here
// it just sets the null values.
public Card(){
  m_suit = "";
  m_rank = 0;
  m_face = "";
  m_color = "";
}

// this is the card constructor and it sets the @param inputs of suit, rank, m_face
// and color to the master variables.
public Card(String suit, int rank, String face, String color){
  m_suit = suit;
  m_rank = rank;
  m_face = face;
  m_color = color;
}

// the next 5 blocks of code are accessors.

// @param none, @return the suit
public String getSuit(){
  return m_suit;
}
// @param none, @return the rank
public int getRank(){
  return m_rank;
}
// @param none, @return the color
public String getColor(){
  return m_color;
}
// @param none, @return the face
public String getFace(){
  return m_face;
}
// @param none, @returns the full description of a card (mostly for debugging)
public String getDescription(){
  return "Card: " + getColor() + " " + getRank() + " of " + getSuit();
}

// @param an object of class card, @return an int, 1 if the card being compared to the other
// is smaller, a -1 if it's bigger, and a 0 if theyre ==.
public int compare(Card compareCard){
  if(m_rank > compareCard.getRank()){
    return 1;
  }
  else if(m_rank < compareCard.getRank()){
    return -1;
  }
  else {
    return 0;
  }

}

}
