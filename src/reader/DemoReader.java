package reader;


import java.util.InputMismatchException;


public class DemoReader {
  public static void main(String[] args) {
    Reader st = new Reader();
    try {
      System.out.println(st.readString());
      System.out.println(st.readInt());
      System.out.println(st.readChar());
      System.out.println(st.readFloat());
    } catch (InputMismatchException e) {
      System.out.println(e.getMessage());
    } catch (NumberFormatException e) {
      System.out.println("Incorrect value " + e.getMessage());
    }
  }
}
