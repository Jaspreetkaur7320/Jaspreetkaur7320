/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jaspreetkaur7320;

/**
 *A class that models playing card objects ,cards have
 * a value ( note that ace = 1, jack = 11 , queen = 12 , king = 13 )
 * a suit ( club , heart , spades , diamonds)
 * there are 52 cards in a deck , no jokers,
 * @author jaspreet kaur
 * @date 5 June 2021
 */
public class Card {

       private String suit ;//clubs, spades,diamonds,hearts
    private int value ;//1-13
    public static final String [] SUITS ={"Hearts","Diamond","Spades","Clibs"};
   
    /**
     * @return the suit
     */
  public String getSuit(){
      return suit ;
  }
  /**
   * @param suit the suit to set
   */
  public void setSuit (String suit ){
      this.suit = suit;
      
  }
  
  }
    
