package it.aulab.model;

public class Batman {
    private Suit suit;

    private Batmobile batmobile;

    
    public Batman(Suit suit, Batmobile batmobile) {
        System.out.println("Create Batman");
        this.suit = suit;
        this.batmobile = batmobile;
    }



    public Batman() {
    }

    
    
    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Batmobile getBatmobile() {
        return batmobile;
    }

    public void setBatmobile(Batmobile batmobile) {
        this.batmobile = batmobile;
    }
}
