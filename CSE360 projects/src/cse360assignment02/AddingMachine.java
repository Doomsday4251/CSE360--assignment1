package cse360assignment02;

public class AddingMachine {
  private int total;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return 0;
  }
  
  public void add (int value) {
  }

  public void subtract (int value) {
  }

  public String toString () {
    return "";
  }

  public void clear() {
  }
}
/*
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
	  thesequence = thesequence + " + value";
  }
  public void subtract (int value) {
	  total = total - value;
	  thesequence = thesequence + " - value";
  }

  public String toString () {
    return thesequence;
  }
  public void clear() {
	  System.gc();
  } 
}
 */
