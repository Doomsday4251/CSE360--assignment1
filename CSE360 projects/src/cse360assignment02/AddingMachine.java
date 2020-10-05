package cse360assignment02;

public class AddingMachine {
  private int total;
  private int myCalculator = 0;
  private String thesequence = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    
  }
  
  public int getTotal () {
    return myCalculator;
  }
  
  public void add (int value) {
	  myCalculator = myCalculator + value;
	  thesequence = thesequence + " + value";
  }

  public void subtract (int value) {
	  myCalculator = myCalculator - value;
	  thesequence = thesequence + " - value";
  }

  public String toString () {
	  int theequation = total;
    return "";
  }

  public void clear() {
  }
}