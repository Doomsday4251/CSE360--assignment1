package cse360assignment02;

public class AddingMachine {
  private int total;
  private String thesequence = "0";
  public AddingMachine() {
    total = 0;
  }
  public int getTotal () {
    return total;
  }
  public void add (int value) {
	  total = total + value;
	  thesequence = thesequence + " + " + value;
  }
  public void subtract (int value) {
	  total = total - value;
	  thesequence = thesequence + " - " + value;
  }

  public String toString () {
    return thesequence;
  }
  public void clear() {
	  System.gc();
	  total = 0;
	  thesequence = "";
  } 
}