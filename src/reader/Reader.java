package reader;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Reader {
  /**
   * Read string
   *
   * @return string
   */

  public String readString() {
    return read();
  }

  /**
   * Reads integers
   *
   * @return integers
   * @throws NumberFormatException
   */
  public int readInt() throws NumberFormatException {
    return Integer.parseInt(read());

  }

  /**
   * Reads char
   *
   * @return string
   * @throws InputMismatchException
   */
  public String readChar() throws InputMismatchException {
    String a = read();
    if (a.length() == 1) {
      return a;
    }
    throw new InputMismatchException("Incorrect value!");
  }

  /**
   * Reads float numbers
   *
   * @return float numbers
   * @throws InputMismatchException
   */
  public float readFloat() throws InputMismatchException {
    return Float.parseFloat(read());
  }

  /**
   * Reads the submitted objects
   *
   * @return objects
   */
  private String read() {
    Scanner sc = new Scanner(System.in);
    return sc.next();

  }

}
