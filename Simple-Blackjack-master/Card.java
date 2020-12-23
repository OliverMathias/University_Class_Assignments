public class Card{
  private String suit;
  private int rank;
  private String face;
  private String color;

	/**
	* Default empty Card constructor
	*/
	public Card() {
		this.suit = " ";
    this.rank = 0;
    this.face = " ";
    this.color = " ";
	}

	/**
	* Default Card constructor
	*/
	public Card(String suit, int rank, String face, String color) {
		super();
		this.suit = suit;
		this.rank = rank;
		this.face = face;
		this.color = color;
	}

	/**
	* Returns value of suit
	* @return suit
	*/
	public String getSuit() {
		return suit;
	}

	/**
	* Sets new value of suit
	* @param String which sets the suit
	*/
	public void setSuit(String suit) {
		this.suit = suit;
	}

	/**
	* Returns value of rank
	* @return int of the rank
	*/
	public int getRank() {
		return rank;
	}

	/**
	* Sets new value of rank
	* @param int which sets the rank
	*/
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	* Returns value of face
	* @return String of the face
	*/
	public String getFace() {
		return face;
	}

	/**
	* Sets new value of face
	* @param String which sets the face of a card.
	*/
	public void setFace(String face) {
		this.face = face;
	}

	/**
	* Returns value of color
	* @return String of the color
	*/
	public String getColor() {
		return color;
	}

	/**
	* Sets new value of color
	* @param String which sets the color.
	*/
	public void setColor(String color) {
		this.color = color;
	}
}
