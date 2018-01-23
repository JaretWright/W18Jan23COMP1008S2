package w18comp1008s2jan23;

/**
 *
 * @author JWright
 */
public class Card {
    private String faceName, suit;
    private int faceValue;
    private static final String[] faceNames = { "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    private static final String[] validSuits = {"hearts","spades","clubs","diamonds"}; 
    
    public Card(String faceName, String suit)
    {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue();
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This method will validate the suit entered as an argument to be hearts,
     * diamonds, spades or clubs and set the suit instance variable
     * @param suit 
     */
    public void setSuit(String suit) {
        for (String validSuit : validSuits)
        {
            if (validSuit.equalsIgnoreCase(suit)){
                this.suit = suit.toLowerCase();
                return;
            }
        }
        throw new IllegalArgumentException("Suit must be hearts, diamonds, spades or clubs");
    }

    public int getFaceValue() {
        return faceValue;
    }

    private void setFaceValue() {
        
        for (int index=0; index<faceNames.length; index++)
        {
            if (faceNames[index].equalsIgnoreCase(faceName))
            {
                faceValue = index+2;
                return;
            }
        }
        throw new IllegalArgumentException("face name of card is invalid");
    }
    
    
}
