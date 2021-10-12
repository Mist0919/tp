package data.card;


import java.io.Serializable;

public class Card implements Serializable {
    private static final long serialVersionUID = -9135686500512288865L;
    private String content;
    private boolean isUsed;
    private int cardID;
    private boolean isCollected;

    public Card(String content, int cardID) {
        this.content = content;
        this.cardID = cardID;
        this.isUsed = false;
        this.isCollected = false;
    }

    public int getCardID() {
        return cardID;
    }

    public String getContent() {
        return content;
    }

    public boolean checkIfIsUsed() {
        return isUsed;
    }

    public boolean checkIfCollected() {
        return isCollected;
    }

    public void setAsUsed() {
        isUsed = true;
    }

    public void setAsCollected() {
        isCollected = true;
    }

    @Override
    public String toString() {
        return getContent();
    }
}