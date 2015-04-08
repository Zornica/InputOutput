package reversal;

import java.io.FileNotFoundException;
import java.io.IOException;


public class DemoFileReversal {
  public static void main(String[] args) {
    String file = "reversal.txt";
    FileReversal f = new FileReversal(file);
    try {
      f.revers();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}

